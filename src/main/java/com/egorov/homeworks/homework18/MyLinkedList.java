package com.egorov.homeworks.homework18;

public class MyLinkedList<T> implements List<T> {

    private Node first;
    private Node last;
    private int size;

    @Override
    public String toString() {
        return
                "[" + first + "]";
    }

    @Override
    public void remove(int index) {
        Node prev = first;
        Node curr = first;

        if (index >= size) {
            System.out.println("Exseption");
        }
        for (int i = 0; i < size; i++) {
            if (i == index) {

                if (size == 1) {
                    first = null;
                    last = null;
                }

                else if (curr.equals(first)) {
                    first = first.next;
                }

                else if (curr.equals(last)) {
                    last = prev;
                    last.next = null;
                }

                else {
                    prev.next = curr.next;
                }
                size--;
                break;
            }
            prev = curr;
            curr = prev.next;

        }
    }

    public MyLinkedList() {
        first = null;
        last = null;
        size = 0;
    }

    private class Node {
        private T data;

        @Override
        public String toString() {
            String result = "";
            if (next == null) {
                result = result + data + "";
            } else
                result = result + data + ", ";
            if (next != null) {
                result = result + next;
            }
            return result;
        }

        private Node next;

        public Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
    }


    @Override
    public void add(T data) {

        if (data == null) {
            throw new NullPointerException("The first argument for addLast() is null.");
        }
        if (!isEmpty()) {
            Node prev = last;
            last = new Node(data, null);
            prev.next = last;
        } else {
            last = new Node(data, null);
            first = last;
        }
        size++;

    }


    public void removeValue(T value) {
        if (isEmpty()) {
            throw new IllegalStateException("Cannot remove() from and empty list.");
        }
        Node prev = first;
        Node curr = first;
        while (curr.next != null || curr == last) {
            if (curr.data.equals(value)) {

                if (size == 1) {
                    first = null;
                    last = null;
                } else if (curr.equals(first)) {
                    first = first.next;
                } else if (curr.equals(last)) {
                    last = prev;
                    last.next = null;
                }
                // remove element
                else {
                    prev.next = curr.next;
                }
                size--;
                break;
            }
            prev = curr;
            curr = prev.next;
        }

    }

    @Override
    public T get(int index) {
        Node curr = first;

        if (index >= size) {
            System.out.println("Exception");
        }
        for (int i = 0; i < size; i++) {
            if (i == index) {
                return curr.data;
            }
            curr = curr.next;

        }

        return null;
    }

    @Override
    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return (size == 0);
    }
}
