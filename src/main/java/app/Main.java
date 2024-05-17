package app;

public class Main {
    private static final String string1 = "Ім'я: %s, Вік: %d, Професія: %s%n";
    private static final String string2 = "(Після оновлення професії)";

    public static void main(String[] args) {
        Person person1 = new Person("John", 30, "Інженер");
        Person person2 = new Person("Mary", 25, "Вчитель");
        Person person3 = new Person("Bob", 35, "Лікар");

        System.out.printf(string1, person1.getName(), person1.getAge(), person1.getWork());
        System.out.printf(string1, person2.getName(), person2.getAge(), person2.getWork());
        System.out.printf(string1, person3.getName(), person3.getAge(), person3.getWork());

        person3.setWork("Президент");

        System.out.println(string2);
        System.out.printf(string1, person3.getName(), person3.getAge(), person3.getWork());
    }

}

