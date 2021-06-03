package students.sever;

import java.util.Objects;

public class Student {
    private String id;
    private String name;
    private String birthday;
    private String gender;
    private String address;
    private String email;
    private String mark;

    public Student(String id, String name, String birthday, String gender, String address, String email, String mark) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.address = address;
        this.email = email;
        this.mark = mark;
    }

    public Student() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", gender='" + (gender.equals("0") ? "boy" : "girl") + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", mark='" + mark + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return Objects.equals(getId(), student.getId()) && Objects.equals(getName(), student.getName()) && Objects.equals(getBirthday(), student.getBirthday()) && Objects.equals(getGender(), student.getGender()) && Objects.equals(getAddress(), student.getAddress()) && Objects.equals(getEmail(), student.getEmail()) && Objects.equals(getMark(), student.getMark());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getBirthday(), getGender(), getAddress(), getEmail(), getMark());
    }
}
