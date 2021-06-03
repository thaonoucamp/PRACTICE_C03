package students.controller;

import java.io.IOException;
import java.util.List;

public interface IManagement<T> {
    T input();

    void add(List<T> list) throws IOException;

    void edit(List<T> list) throws IOException;

    void delete(List<T> list) throws IOException;

    void find(List<T> list);

    void sort(List<T> list) throws IOException;

    void show(List<T> list);

    void menu() throws IOException;
}
