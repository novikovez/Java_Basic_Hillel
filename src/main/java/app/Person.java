package app;

public class Person {
    private String name;
    private int age;
    private String work;
    private static final String string1 = "Ім'я: %s, Вік: %d, Професія: %s%n";

    public Person(String name, int age, String work) {
        this.name = name;
        this.age = age;
        this.work = work;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getWork() {
        return work;
    }

    public String getString() {
        return String.format(string1, name, age, work);
    }
}
