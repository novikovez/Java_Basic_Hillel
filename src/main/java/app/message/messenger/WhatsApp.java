package app.message.messenger;
/*
| Автор: Igor Novikov |
*/

import app.message.MessageDTO;
import app.message.Printer;
import app.message.Validation;

public class WhatsApp extends Validation implements Printer {
    @Override
    public void printMessage(MessageDTO message) {
        System.out.println(WORK_WA);
        validation(message);
    }




}
