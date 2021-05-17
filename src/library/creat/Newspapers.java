package library.creat;

public class Newspapers extends Document{
    String date;

    public Newspapers(String date) {
        this.date = date;
    }

    public Newspapers(String name, String nxb, String date) {
        super(name, nxb);
        this.date = date;
    }

    @Override
    public String toString() {
        return "Newspapers{" + super.toString() +
                "date='" + date + '\'' +
                '}';
    }
}
