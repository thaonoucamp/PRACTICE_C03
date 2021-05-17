package library.creat;

public class Book extends Document{
    String mon;

    public Book(String mon) {
        this.mon = mon;
    }

    public Book(String name, String nxb, String mon) {
        super(name, nxb);
        this.mon = mon;
    }

    public Book() {
    }

    @Override
    public String toString() {
        return "Book{" + super.toString() +
                "mon='" + mon + '\'' +
                '}';
    }
}
