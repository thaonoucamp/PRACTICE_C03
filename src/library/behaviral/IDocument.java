package library.behaviral;

public interface IDocument<E> {
    E input();

    void add(E e);

    void edit();

    void delete();

    void find();

    void show();

    void menu();
}
