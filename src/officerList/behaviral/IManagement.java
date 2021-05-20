package officerList.behaviral;

import java.util.List;

public interface IManagement<E> {
    E input();

    void add(E e);

    int checkIndex(List<E> list);

    void edit(List<E> list, int index);

    void delete(List<E> list, int index);

    int sort(List<E> list);

    int findIndex(List<E> list);

    int findBinaryTree(List<E> list, int left, int right, int index);

    void show(List<E> list);

    void menu();

}
