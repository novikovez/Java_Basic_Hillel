package app.controller.car;

import app.controller.language.Language;
import app.enums.car.CarEngineType;
import app.enums.car.CarType;

public abstract class Car extends Language {
    protected CarType type;
    protected CarEngineType typeEngine;

    public Car(
            CarType type,
            CarEngineType typeEngine
    ) {
        this.type = type;
        this.typeEngine = typeEngine;
    }

    public abstract void start();                     // опис запуску авто
    public abstract String getType();                 // тип кузову
    public abstract String getTypeEngine();           // тип двигуна

}
