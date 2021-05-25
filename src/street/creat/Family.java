package street.creat;

import java.util.List;

public class Family extends Person{
    private int quantityMember;
    private int idHome;
    private List<Person> members;

    public int getIdHome() {
        return idHome;
    }

    public void setIdHome(int idHome) {
        this.idHome = idHome;
    }

    public Family(int quantityMember, int idHome, List<Person> members) {
        this.quantityMember = quantityMember;
        this.idHome = idHome;
        this.members = members;
    }

    public Family() {
    }

    public int getQuantityMember() {
        return quantityMember;
    }

    public void setQuantityMember(int quantityMember) {
        this.quantityMember = quantityMember;
    }

    public List<Person> getMembers() {
        return members;
    }

    public void setMembers(List<Person> members) {
        this.members = members;
    }

    @Override
    public String toString() {
        return "Family{" +
                "quantityMember=" + quantityMember +
                ", idHome=" + idHome +
                ", members=" + members +
                '}';
    }
}
