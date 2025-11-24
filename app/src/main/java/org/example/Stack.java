package org.example;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> {

    private T[] stackArray;
    private int size;


    public Stack(int capacity) {

        stackArray = (T[]) new Object[capacity];
        size = -1;
    }

    public void push(T item) {

        if (isFull()) {

            System.out.println("Stack is full. Cannot push: " + item);
            return;
        }
        stackArray[++size] = item;
    }

    public T pop() {

        if (isEmpty()) {

            System.out.println("Stack is empty. Nothing to pop.");
            return null;
        }

        T removed = stackArray[size];
        stackArray[size] = null;
        size--;
        return removed;
    }

    public T peek() {

        if (isEmpty()) {

            System.out.println("Stack is empty. Nothing to peek.");
            return null;
        }
        return stackArray[size];
    }

    public int size() {return size + 1;}

    public boolean isFull() {return size == stackArray.length - 1;}

    public boolean isEmpty() {return size == -1;}
}
