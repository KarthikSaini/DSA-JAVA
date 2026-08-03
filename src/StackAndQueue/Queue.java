package StackAndQueue;

// Implement Queue using Circular Array
public class Queue {

    public int[] arr;

    public int retival;

    public int pointer;

    public int size;

    Queue(int capacity) {
        arr = new int[capacity];
        retival = 0;
        pointer = -1;
        size = 0;
    }

    public void push(int num) {

        if (isFull()) {
            return;
        }

        pointer = (pointer + 1) % arr.length;
        arr[pointer] = num;
        size++;
    }

    public Integer pop() {

        if (isEmpty()) {
            return null;
        }

        int value = arr[retival];

        retival = (retival + 1) % arr.length;
        size--;

        return value;
    }

    public Integer peek() {

        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return null;
        }

        return arr[retival];
    }

    public void display() {

        if (isEmpty()) {
            return;
        }

        int current = retival;

        for (int i = 0; i < size; i++) {
            System.out.print(arr[current] + " -> ");
            current = (current + 1) % arr.length;
        }

        System.out.println("Finished");
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == arr.length;
    }
}