package app.enums;
/*
| Автор: Igor Novikov |
*/

public enum DayEnum {
    MONDAY ("Понеділок"),
    TUESDAY ("Вівторок"),
    WEDNESDAY ("Середовище"),
    THURSDAY ("Четвер"),
    FRIDAY ("П'ятниця"),
    SATURDAY ("Субота"),
    SUNDAY ("Неділя");

    private final String title;

    DayEnum(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
