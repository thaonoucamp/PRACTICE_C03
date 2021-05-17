package library.show;

import library.creat.Book;
import library.creat.Document;
import library.creat.Journal;
import library.creat.Newspapers;

public class Main {
    int index;
    Document[] documents;
    int id = 0;

    public Main() {
        documents = new Document[100];
        index = 0;
    }

    public void add(Document item) {
        item.ma = id;
        id++;
        documents[index] = item;
        index++;
    }

    public void show() {
        for (int i = 0; i < index; i++) {
            System.out.println(documents[i]);
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        Book book = new Book("a", "b", "d");
        Journal book1 = new Journal("a", "b", "d");
        Newspapers book2 = new Newspapers("a", "b", "d");
        main.add(book);
        main.add(book1);
        main.add(book2);

        main.show();
    }
}
