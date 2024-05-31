package app.message;
/*
| Автор: Igor Novikov |
*/

import app.message.language.Language;

public class Validation extends Language {
    protected void validation(MessageDTO message) {
        if(message.getAuthor().isEmpty() && !message.getMessage().isEmpty()) {
            System.out.println(ANONIM + message.getMessage());
        }

        if(!message.getAuthor().isEmpty() && !message.getMessage().isEmpty()) {
            System.out.printf(SHOW_MESSAGE, message.getAuthor(), message.getMessage());
        }

        if(message.getAuthor().isEmpty() && message.getMessage().isEmpty()) {
            System.out.println(EMPTY_MESSAGE);
        }
    }
}
