package street.creat;

import java.util.List;

public class Street {
    private int quantityFamily;
    private List<Family> families;

    public Street() {
    }

    public Street(int quantityFamily, List<Family> families) {
        this.quantityFamily = quantityFamily;
        this.families = families;
    }

    public int getQuantityFamily() {
        return quantityFamily;
    }

    public void setQuantityFamily(int quantityFamily) {
        this.quantityFamily = quantityFamily;
    }

    public List<Family> getFamilies() {
        return families;
    }

    public void setFamilies(List<Family> families) {
        this.families = families;
    }

    @Override
    public String toString() {
        return "Street{" +
                "quantityFamily=" + quantityFamily +
                ", families=" + families +
                '}';
    }
}
