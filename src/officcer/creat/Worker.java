package officcer.creat;

public class Worker extends Officer{
    private String work;

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public Worker() {
    }

    public Worker(String work) {
        this.work = work;
    }

    public Worker(String name, String age, String gen, String address, String work) {
        super(name, age, gen, address);
        this.work = work;
    }

    @Override
    public String toString() {
        return "Worker{" + super.toString() +
                "work='" + work + '\'' +
                '}';
    }
}
