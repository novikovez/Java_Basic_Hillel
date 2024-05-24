package app.enums.car;

public enum CarEngineType {
    ELECTRIC ("Електричний"),
    PETROL ("Бензиновий"),
    DIESEL ("Дизельний");

    private final String title;

    CarEngineType(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
