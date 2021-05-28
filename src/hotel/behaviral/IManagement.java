package hotel.behaviral;

import java.io.IOException;
import java.util.ArrayList;

public interface IManagement<E> {
    long TYPE_LUXURY = 300000;
    long TYPE_DOUBLE = 200000;
    long TYPE_SIMPLE = 100000;

    void edit(ArrayList<E> list);

    void delete(ArrayList<E> list);

    void add(ArrayList<E> list) throws IOException;

    void find(ArrayList<E> list);

    void sort(ArrayList<E> list);

    void show(ArrayList<E> list);

    void menu() throws IOException;
}
