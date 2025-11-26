package org.example;

public class Stack<T> {

    private T[] data;
    private int size;


    public Stack(int capacity) {

        data = (T[]) new Object[capacity];
        size = -1;
    }

    public void push(T item) {

        if (isFull()) {

            System.out.println("Stack is full. Cannot push: " + item);
            return;
        }
        data[++size] = item;
    }

    public T pop() {

        if (isEmpty()) {

            System.out.println("Stack is empty. Nothing to pop.");
            return null;
        }

        T removed = data[size];
        data[size] = null;
        size--;
        return removed;
    }

    public T peek() {

        if (isEmpty()) {

            System.out.println("Stack is empty. Nothing to peek.");
            return null;
        }
        return data[size];
    }

    public int size() {return size + 1;}

    public boolean isFull() {return size == data.length - 1;}

    public boolean isEmpty() {return size == -1;}
}
