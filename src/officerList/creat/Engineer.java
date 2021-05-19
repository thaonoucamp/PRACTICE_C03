package officerList.creat;

public class Engineer extends Officer{
    private String instruction;

    public Engineer() {

    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    public Engineer(String name, String age, String gen, String address) {
        super(name, age, gen, address);
    }

    public Engineer(String name, String age, String gen, String address, String instruction) {
        super(name, age, gen, address);
        this.instruction = instruction;
    }

    public Engineer(String instruction) {
        this.instruction = instruction;
    }

    @Override
    public String toString() {
        return "Engineer{" + super.toString() +
                "instruction='" + instruction + '\'' +
                '}';
    }
}
