package app;

import app.controller.car.PassengerCar;
import app.controller.staff.Staff;
import app.enums.car.CarEngineType;
import app.enums.car.CarType;

public class Main  {
    public static void main(String[] args) {
        Staff staff = new Staff(
                "Jack Jack",
                "QA",
                "mail@mail.com",
                "+3804456554534",
                32
        );

        System.out.println(staff.getAgeString());                       // Отримати вік
        staff.incrementAge();                                           // Змінити вік
        System.out.println(staff.getAgeString());                       // Отримати вік

        /*
        |--------------------------------------------------------------------------
        | Car controller
        |--------------------------------------------------------------------------
        */

        System.out.println("#################################");
        PassengerCar passengerCar = new PassengerCar(
                CarType.SEDAN,
                CarEngineType.ELECTRIC,
                4
        );

        System.out.println(passengerCar.getType());
        System.out.println(passengerCar.getTypeEngine());
        System.out.println(passengerCar.getPassengerCapacity());

    }
}


