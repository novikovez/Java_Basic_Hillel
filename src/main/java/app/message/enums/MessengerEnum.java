package app.message.enums;
/*
| Автор: Igor Novikov |
*/

public enum MessengerEnum {
    TELEGRAM ("Telegram"),
    WHATSAPP ("WhatApp");

    private final String title;

    MessengerEnum(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
