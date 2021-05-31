package street.creat;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Family implements Serializable {
    private int quantityMember;
    private int idHome;
    private List<Person> listMembers;

    public int getIdHome() {
        return idHome;
    }

    public void setIdHome(int idHome) {
        this.idHome = idHome;
    }

    public Family(int quantityMember, int idHome, List<Person> listMembers) {
        this.quantityMember = quantityMember;
        this.idHome = idHome;
        this.listMembers = listMembers;
    }

    public Family() {
    }

    public int getQuantityMember() {
        return quantityMember;
    }

    public void setQuantityMember(int quantityMember) {
        this.quantityMember = quantityMember;
    }

    public List<Person> getListMembers() {
        return listMembers;
    }

    public void setListMembers(ArrayList<Person> listMembers) {
        this.listMembers = listMembers;
    }

    @Override
    public String toString() {
        return "Family{" +
                " idHome=" + idHome +
                " quantity=" + quantityMember +
                ", members=" + listMembers +
                '}';
    }
}
