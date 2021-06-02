package street.creat;

import street.behaviral.Regex;

import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private String gender;
    private int id;
    private String age;
    private String job;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        String NAME_REGEX = "^[A-Za_z]+$";
        boolean check = true;
        while (check) {
            if (Regex.validate(NAME_REGEX, name)) {
                this.gender = gender;
                check = false;
            } else {
                System.err.println("Enter to repeat !");
                check = true;
            }
        }
    }

    public Person(int id, String name, String age, String gender, String job) {
        this.name = name;
        this.gender = gender;
        this.id = id;
        this.age = age;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String NAME_REGEX = "^[A-Za_z]+$";
        boolean check = true;
        while (check) {
            if (Regex.validate(NAME_REGEX, name)) {
                this.name = name;
                check = false;
            } else {
                System.err.println("Enter to repeat !");
                check = true;
            }
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        String NAME_REGEX = "^[A-Za_z]+$";
        boolean check = true;
        while (check) {
            if (Regex.validate(NAME_REGEX, age)) {
                this.age = age;
                check = false;
            } else {
                System.err.println("Enter to repeat !");
                check = true;
            }
        }
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        String NAME_REGEX = "^[A-Za_z]+$";
        boolean check = true;
        while (check) {
            if (Regex.validate(NAME_REGEX, job)) {
                this.job = job;
                check = false;
            } else {
                System.err.println("Enter to repeat !");
                check = true;
            }
        }
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Members{" +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}
