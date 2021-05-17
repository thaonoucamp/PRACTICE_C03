package officcer.creat;

public class Officer {
    private String name;
    private String age;
    private String gen;
    private String address;

    public Officer() {
    }

    public Officer(String name, String age, String gen, String address) {
        this.name = name;
        this.age = age;
        this.gen = gen;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", gen='" + gen + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
