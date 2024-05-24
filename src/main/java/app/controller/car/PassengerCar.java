package app.controller.car;

import app.enums.car.CarEngineType;
import app.enums.car.CarType;

public class PassengerCar extends Car {
    private final int passengerCapacity;

    public PassengerCar(
            CarType type,
            CarEngineType typeEngine,
            int passengerCapacity
    ) {
        super(type, typeEngine);
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public void start() {
        System.out.println(startElectricity());
        System.out.println(startCommand());
        System.out.println(startFuelSystem());
    }

    @Override
    public String getType() {
        return string1 + type.getTitle();
    }

    @Override
    public String getTypeEngine() {
        return string2 + typeEngine.getTitle();
    }

    public String getPassengerCapacity() {
        return string3 + passengerCapacity;
    }

    /*
    |--------------------------------------------------------------------------
    | Private methods
    |--------------------------------------------------------------------------
    */

    private String startElectricity() {
        return startElectricity;
    }

    private String startCommand() {
        return startCommand;
    }

    private String startFuelSystem() {
        return startFuelSystem;
    }
}
