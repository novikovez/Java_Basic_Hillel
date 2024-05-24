package app;

public class Main extends Language  {
    public static void main(String[] args) {
        Car car = new Car();
        Staff staff = new Staff(
                "Jack Jack",
                "QA",
                "mail@mail.com",
                "+3804456554534",
                32
        );

        System.out.println(ageOld + staff.getAge());            // Отримати вік
        staff.setAge(44);                                       // Змінити вік
        System.out.println(ageNew + staff.getAge());            // Отримати вік
        System.out.println(staff);                              // toString

        car.start();                                            // Старт..
    }
}


