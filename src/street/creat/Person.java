package street.creat;

import java.io.Serializable;

public class Person implements Serializable {
    private String name;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Person(String name, String gender, int id, int age, String job) {
        this.name = name;
        this.gender = gender;
        this.id = id;
        this.age = age;
        this.job = job;
    }

    private String gender;
    private int id;
    private int age;
    private String job;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                ", id='" + id + '\'' +
                "name='" + name + '\'' +
                "gender='" + gender + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                "\n" +
                '}';
    }
}
