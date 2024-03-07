package com.directi.training.srp.exercise_refactored;


import java.util.List;

public class CarDataFormatter {


    private List<Car> _carsDb;


    CarDataFormatter(List<Car> cars){
        _carsDb=cars;
    }

    public String getCarsNames()
    {
        StringBuilder sb = new StringBuilder();
        for (Car car : _carsDb) {
            sb.append(car.getBrand());
            sb.append(" ");
            sb.append(car.getModel());
            sb.append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }



}
