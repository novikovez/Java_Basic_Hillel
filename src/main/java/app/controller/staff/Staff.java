package app.controller.staff;


import app.controller.language.Language;

public class Staff extends Language {
    private String fio;
    private String job;
    private String email;
    private String phone;
    private int age;

    public Staff(
            String fio,
            String job,
            String email,
            String phone,
            int age
    ) {
        this.fio = fio;
        this.job = job;
        this.email = email;
        this.phone = phone;
        this.age = age;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAgeString() {
        return Language.age + age;
    }

    public void incrementAge() {
        this.age++;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "fio='" + fio + '\'' +
                ", job='" + job + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                '}';
    }
}

