package com.directi.training.lsp.exercise;

import java.util.ArrayList;
import java.util.List;

public class Pool
{
    public void run()
    {
        Duck donaldDuck = new Duck();
        ElectronicDuck electricDuck = new ElectronicDuck();
        ArrayList<Duck> ducks = new ArrayList<>();
        ducks.add(donaldDuck);
        ArrayList<ElectronicDuck> electronicDucks = new ArrayList<>();
        electronicDucks.add(electricDuck);
        ducks.add(donaldDuck);
        quack(ducks, electronicDucks);
        swim(ducks, electronicDucks);
    }

    private void quack(List<Duck> ducks, List<ElectronicDuck> electronicDucks)
    {
        for (Duck duck : ducks) {
            duck.quack();
        }
        for (ElectronicDuck electronicDuck : electronicDucks){
            electronicDuck.turnOn();
            electronicDuck.quack();
            electronicDuck.turnOff();
        }
    }

    private void swim(List<Duck> ducks, List<ElectronicDuck> electronicDucks)
    {
        for (Duck duck : ducks) {
            duck.swim();
        }
        for (ElectronicDuck electronicDuck : electronicDucks){
            electronicDuck.turnOn();
            electronicDuck.swim();
            electronicDuck.turnOff();
        }
    }

    public static void main(String[] args)
    {
        Pool pool = new Pool();
        pool.run();
    }
}
