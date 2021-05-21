package map;

public class Customer {
    private String cusName;
    private String cusAge;
    private String cusGender;
    private String cusAddress;
    private String cusTelephone;

    public Customer() {
    }

    public Customer(String cusName, String cusAge, String cusGender, String cusAddress, String cusTelephone) {
        this.cusName = cusName;
        this.cusAge = cusAge;
        this.cusGender = cusGender;
        this.cusAddress = cusAddress;
        this.cusTelephone = cusTelephone;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public String getCusAge() {
        return cusAge;
    }

    public void setCusAge(String cusAge) {
        this.cusAge = cusAge;
    }

    public String getCusGender() {
        return cusGender;
    }

    public void setCusGender(String cusGender) {
        this.cusGender = cusGender;
    }

    public String getCusAddress() {
        return cusAddress;
    }

    public void setCusAddress(String cusAddress) {
        this.cusAddress = cusAddress;
    }

    public String getCusTelephone() {
        return cusTelephone;
    }

    public void setCusTelephone(String cusTelephone) {
        this.cusTelephone = cusTelephone;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cusName='" + cusName + '\'' +
                ", cusAge='" + cusAge + '\'' +
                ", cusGender='" + (cusGender.equals("1") ? "nam" : "nu") + '\'' +
                ", cusAddress='" + cusAddress + '\'' +
                ", cusTelephone='" + cusTelephone + '\'' +
                '}';
    }
}
