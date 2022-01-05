package service;

import models.Car;

public class CarService {

    public static void createCar(){
        Car car = new Car("Ertiga", "red", "Maruti");

        System.out.println(car);


    }
}
