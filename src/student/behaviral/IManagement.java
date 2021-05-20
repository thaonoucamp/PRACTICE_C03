package student.behaviral;

import java.util.List;

public interface IManagement<T> {
    T input();

    void add(List<T> list);

    void edit(List<T> list);

    void delete(List<T> list);

    void findId(List<T> list);

    void sort(List<T> list);

    void show(List<T> list);
}
