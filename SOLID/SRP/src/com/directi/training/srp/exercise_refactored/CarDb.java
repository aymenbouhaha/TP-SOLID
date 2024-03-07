package com.directi.training.srp.exercise_refactored;

import com.directi.training.srp.exercise.Car;

import java.util.Arrays;
import java.util.List;

public class CarDb {



    private List<com.directi.training.srp.exercise.Car> _carsDb = Arrays
            .asList(new com.directi.training.srp.exercise.Car("1", "Golf III", "Volkswagen"), new com.directi.training.srp.exercise.Car("2", "Multipla", "Fiat"),
                    new com.directi.training.srp.exercise.Car("3", "Megane", "Renault"));

    public com.directi.training.srp.exercise.Car getFromDb(final String carId)
    {
        for (Car car : _carsDb) {
            if (car.getId().equals(carId)) {
                return car;
            }
        }
        return null;
    }

}
