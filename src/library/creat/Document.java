package library.creat;

public class Document {
   public String name;
   public String nxb;
   public int ma;

    public Document() {
    }

    public Document(String name, String nxb) {
        this.name = name;
        this.nxb = nxb;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", nxb='" + nxb + '\'' +
                ", ma='" + ma + '\'' +
                '}';
    }
}
