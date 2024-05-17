package app;

public class Main {
    private static final String string2 = "(Після оновлення професії)";

    public static void main(String[] args) {
        Person person1 = new Person(
                "John",
                30,
                "Інженер");

        Person person2 = new Person(
                "Mary",
                25,
                "Вчитель");

        Person person3 = new Person(
                "Bob",
                35,
                "Лікар");

        System.out.print(person1.getString());
        System.out.print(person2.getString());
        System.out.print(person3.getString());

        person3.setWork("Президент");

        System.out.println(string2);
        System.out.print(person3.getString());
    }

}

