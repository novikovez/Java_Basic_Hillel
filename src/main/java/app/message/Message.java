package app.message;
/*
| Автор: Igor Novikov |
*/

import app.message.enums.MessengerEnum;
import app.message.language.Language;
import app.message.messenger.Telegram;
import app.message.messenger.WhatsApp;

import java.util.Scanner;

public class Message extends Language {
    private static Printer printer;
    private static final Scanner scanner = new Scanner(System.in);
    private static String author;
    private static String message;

    public static void run() {
        selectMessenger();
        setMessage();
        printer.printMessage(
                new MessageDTO(message, author)
        );
    }

    private static Printer setMessenger(int id) {
        switch (id) {
            case 1:
                printer = new Telegram();
                break;
            case 2:
                printer = new WhatsApp();
                break;
            default:
                System.out.println(BAD_MESSENGER);
                printer = new Telegram();
        }
        return printer;
    }

    private static void selectMessenger() {
        System.out.println(SELECT_MESSENGER);
        int i = 0;
        for (MessengerEnum messenger : MessengerEnum.values()) {
            i++;
            System.out.println(i + " - " + messenger);
        }
        printer = setMessenger(scanner.nextInt());
    }

    private static void setMessage() {
        System.out.println(SELECT_NAME);
        author = scanner.next();
        System.out.println(SELECT_MESSAGE);
        message = scanner.next();
    }


}
