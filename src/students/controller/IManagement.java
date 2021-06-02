package students.controller;

import java.util.List;

public interface IManagement<T> {
    T input();

    void add(List<T> list);

    void edit(List<T> list);

    void delete(List<T> list);

    void find(List<T> list);

    void sort(List<T> list);

    void menu(List<T> list);
}
