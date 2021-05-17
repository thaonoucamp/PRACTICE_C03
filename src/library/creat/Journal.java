package library.creat;

public class Journal extends Document{
    String nganh;

    public Journal() {
    }

    public Journal(String nganh) {
        this.nganh = nganh;
    }

    public Journal(String name, String nxb, String nganh) {
        super(name, nxb);
        this.nganh = nganh;
    }

    @Override
    public String toString() {
        return "Journal{" + super.toString() +
                "nganh='" + nganh + '\'' +
                '}';
    }
}
