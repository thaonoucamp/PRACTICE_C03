package hotel.creat;

public class Customer extends Person{
    private int rentDays;
    private String typeRoom;

    public Customer() {
    }

    public Customer(int rentDays, String typeRoom) {
        this.rentDays = rentDays;
        this.typeRoom = typeRoom;
    }

    public Customer(String name, int age, int id, int rentDays, String typeRoom) {
        super(name, age, id);
        this.rentDays = rentDays;
        this.typeRoom = typeRoom;
    }

    public int getRentDays() {
        return rentDays;
    }

    public void setRentDays(int rentDays) {
        this.rentDays = rentDays;
    }

    public String getTypeRoom() {
        return typeRoom;
    }

    public void setTypeRoom(String typeRoom) {
        this.typeRoom = typeRoom;
    }

    @Override
    public String toString() {
        return "Customer{" + super.toString() +
                ", rentDays=" + rentDays +
                ", typeRoom='" + typeRoom + '\'' +
                '}';
    }
}
