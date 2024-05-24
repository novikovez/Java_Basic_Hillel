package app.enums.car;

public enum CarType {
    SEDAN ("Седан"),
    HATCHBACK ("Хэтчбек"),
    COUPE ("Купе");

    private final String title;

    CarType(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
