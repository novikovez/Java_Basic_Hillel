package app;

public class Car extends Language{

    public void start() {
        System.out.println(Sep + startElectricity());
        System.out.println(startCommand());
        System.out.println(startFuelSystem());
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
