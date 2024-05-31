package app.message;
/*
| Автор: Igor Novikov |
*/

public class MessageDTO {
    private String message;
    private String author;

    public MessageDTO(
            String message,
            String author
    ) {
        this.message = message;
        this.author = author;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

}
