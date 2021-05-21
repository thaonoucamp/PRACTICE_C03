package map;

import java.util.Map;

public interface IManagement<K, V> {
    V input();

    void add(K key, V value);

    void edit(Map<K, V> map);

    void delete(Map<K, V> map);

    void find(Map<K, V> map);

    void show();

    void menu();
}
