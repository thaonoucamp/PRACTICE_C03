package street.behaviral;

import java.util.List;

public interface IManagement<E> {
    E input();

    void add(List<E> list);

    void edit(List<E> list);

    void delete(List<E> list);

    void find(List<E> list);

    void sort(List<E> list);

    void menu();
}
