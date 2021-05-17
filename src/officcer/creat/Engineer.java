package officcer.creat;

public class Engineer extends Officer{
    private String train;

    public String getTrain() {
        return train;
    }

    public void setTrain(String train) {
        this.train = train;
    }

    public Engineer() {
    }

    public Engineer(String train) {
        this.train = train;
    }

    public Engineer(String name, String age, String gen, String address, String train) {
        super(name, age, gen, address);
        this.train = train;
    }

    @Override
    public String toString() {
        return "Engineer{" + super.toString() +
                "train='" + train + '\'' +
                '}';
    }
}
