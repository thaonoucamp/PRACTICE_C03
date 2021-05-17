package officcer.creat;

public class Staff extends Officer{
    private String wage;

    public String getWage() {
        return wage;
    }

    public void setWage(String wage) {
        this.wage = wage;
    }

    public Staff() {
    }

    public Staff(String wage) {
        this.wage = wage;
    }

    public Staff(String name, String age, String gen, String address, String wage) {
        super(name, age, gen, address);
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "Staff{" + super.toString() +
                "wage='" + wage + '\'' +
                '}';
    }
}
