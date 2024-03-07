package com.directi.training.srp.exercise_refactored;

import java.util.List;

public class CarOperations {


    private List<Car> _carsDb;


    CarOperations(List<Car> cars){
        _carsDb=cars;
    }


    public Car getBestCar()
    {
        Car bestCar = null;
        for (Car car : _carsDb) {
            if (bestCar == null || car.getModel().compareTo(bestCar.getModel()) > 0) {
                bestCar = car;
            }
        }
        return bestCar;
    }


}
