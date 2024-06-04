package app;
/*
| Автор: Igor Novikov |
*/

import app.enums.DayEnum;
import app.language.Language;
import app.service.DayService;

public class Main extends Language {
    private static final DayService dayService = new DayService();

    public static void main(String[] args) {
        System.out.println(STRING4);
        DayEnum day = dayService.getDayEnum();
        System.out.println(dayService.advise(day));
    }
}


