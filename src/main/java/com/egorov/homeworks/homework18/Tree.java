package com.egorov.homeworks.homework18;

public interface Tree<T>
{
    void add(T data);
    void delete(T data);
    T get(T data); // если элемента нет то вернуть NULL
    void printDfs(); // (опционально) обойти дерево в глубину
    void printBfs(); // (опционально) обойти дерево в ширину
}