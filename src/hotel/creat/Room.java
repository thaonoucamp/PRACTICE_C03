package hotel.creat;

import java.util.ArrayList;

public class Room {
    private int idRoom;
    private int quantityCusInRoom;
    private ArrayList<Customer> people;

    public Room() {
    }

    public int getIdRoom() {
        return idRoom;
    }

    public void setIdRoom(int idRoom) {
        this.idRoom = idRoom;
    }

    public int getQuantityCusInRoom() {
        return quantityCusInRoom;
    }

    public void setQuantityCusInRoom(int quantityCusInRoom) {
        this.quantityCusInRoom = quantityCusInRoom;
    }

    public Room(int idRoom, int quantityCusInRoom, ArrayList<Customer> people) {
        this.idRoom = idRoom;
        this.quantityCusInRoom = quantityCusInRoom;
        this.people = people;
    }

    public Room(int quantityInRoom, ArrayList<Customer> people) {
        this.quantityCusInRoom = quantityInRoom;
        this.people = people;
    }

    public int getQuantityInRoom() {
        return quantityCusInRoom;
    }

    public void setQuantityInRoom(int quantityInRoom) {
        this.quantityCusInRoom = quantityInRoom;
    }

    public ArrayList<Customer> getPeople() {
        return people;
    }

    public void setPeople(ArrayList<Customer> people) {
        this.people = people;
    }

    @Override
    public String toString() {
        return "Room{id=" + idRoom +
                "quantityInRoom=" + quantityCusInRoom +
                ", people=" + people +
                '}';
    }
}
