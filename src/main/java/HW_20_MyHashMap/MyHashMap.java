package HW_20_MyHashMap;

import java.util.Arrays;
import java.util.Objects;

public class MyHashMap<K, V> implements MyMap<K, V> {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyHashMap)) return false;
        MyHashMap<?, ?> myHashMap = (MyHashMap<?, ?>) o;
        return capacity == myHashMap.capacity && count == myHashMap.count && Arrays.equals(table, myHashMap.table);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(capacity, count);
        result = 31 * result + Arrays.hashCode(table);
        return result;
    }

    @Override
    public String toString() {
        return "MyHashMap{" + Arrays.toString(table) +
                '}';
    }

    private class Entry<K, V> {
        @Override
        public String toString() {
            return "{" +
                    "key=" + key +
                    ", value=" + value +
                    '}';
        }

        private K key;
        private V value;
        private Entry<K, V> next;

        public Entry(K key, V value, Entry<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        public Entry getNext() {
            return next;
        }

        public void setNext(Entry<K, V> next) {
            this.next = next;
        }
    }

    private int capacity = 16;

    private int count = 0;

    private Entry<K, V>[] table;

    public MyHashMap() {
        table = new Entry[capacity];
    }

    public MyHashMap(int capacity) {
        this.capacity = capacity;
        table = new Entry[capacity];
    }

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        if (count == 0) {
            return true;
        } else
            return false;
    }

    private void upp() {
        capacity *= 2;
        Entry<K, V>[] tempTable = table;
        table = new Entry[capacity];
        for (int i = 0; i < capacity / 2; i++) {
            if (tempTable[i] != null) {
                put(tempTable[i].key, tempTable[i].value);
                count--;
                if (tempTable[i].next != null) {
                    Entry<K, V> next = tempTable[i].next;
                    while (next != null) {
                        put(next.key, next.value);
                        count--;
                        next = next.next;
                    }
                }
            }
        }

    }

    public void put(K key, V value) {
        if (count == capacity) {
            upp();
        }
        int index = index(key);

        Entry newEntry = new Entry(key, value, null);
        if (table[index] == null) {
            table[index] = newEntry;
            count++;
        } else {
            Entry<K, V> previousNode = null;
            Entry<K, V> currentNode = table[index];
            while (currentNode != null) {
                if (currentNode.getKey().equals(key)) {
                    currentNode.setValue(value);
                    break;
                }
                previousNode = currentNode;
                currentNode = currentNode.getNext();
            }
            if (previousNode != null)
                previousNode.setNext(newEntry);
            count++;
        }
    }

    public V get(K key) {
        V value = null;
        int index = index(key);
        Entry<K, V> entry = table[index];
        while (entry != null) {
            if (entry.getKey().equals(key)) {
                value = entry.getValue();
                break;
            }
            entry = entry.getNext();
        }
        return value;
    }

    public void remove(K key) {
        int index = index(key);
        Entry previous = null;
        Entry entry = table[index];
        while (entry != null) {

            if (entry.getKey().equals(key)) {
                if (previous == null) {
                    entry = entry.getNext();
                    table[index] = entry;
                    count--;
                    return;
                } else {
                    previous.setNext(entry.getNext());
                    return;
                }
            }
            previous = entry;
            entry = entry.getNext();

        }
    }

    public void display() {

        for (int i = 0; i < capacity; i++) {
            if (table[i] != null) {
                Entry<K, V> currentNode = table[i];
                while (currentNode != null) {
                    System.out.println("Key = " + currentNode.getKey() + ", value = " + currentNode.getValue());
                    currentNode = currentNode.getNext();
                }
            }
        }
    }

    private int index(K key) {
        if (key == null) {
            return 0;
        }
        return Math.abs(key.hashCode() % capacity);
    }

}