package HW_20_MyHashMap;

public interface MyMap<K, V> {

    public V get(K key);

    public void remove(K key);

    public void put(K key, V value);

    public void display();

    }

