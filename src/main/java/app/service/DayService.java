package app.service;
/*
| Автор: Igor Novikov |
*/

import app.DayInterface;
import app.enums.DayEnum;
import app.language.Language;
import java.util.Scanner;


public class DayService extends Language implements DayInterface {
    private static final Scanner scanner = new Scanner(System.in);

    @Override
    public String advise(DayEnum dayEnum) {
        return switch (dayEnum) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY -> STRING;
            case FRIDAY -> STRING2;
            case SUNDAY, SATURDAY -> STRING3;
        };
    }

    public DayEnum getDayEnum() {
        DayEnum[] daysArray = DayEnum.values();
        int i = 0;
        for (DayEnum day : DayEnum.values()) {
            i++;
            System.out.println(i + " - " + day.getTitle());
        }
        int day = scanner.nextInt();
        if(day > daysArray.length  || day < 0) {
            System.out.println(STRING5);
            System.out.println(STRING4);
            return getDayEnum();
        }
        return daysArray[day - 1];
    }

}
