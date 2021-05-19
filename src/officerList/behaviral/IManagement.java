package officerList.behaviral;

import java.util.List;

public interface IManagement<E> {
    E input();

    void add(E e);

    int checkIndex(List<E> list);

    void edit(List<E> list, int index);

    void delete(List<E> list, int index);

    void find(List<E> list);

    void show(List<E> list);

    void menu();

}
