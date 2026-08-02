package StackAndQueue;

// Implement queue using array
public class Queue {

    int pointer;
    int retival;

    int[] arr;


    Queue(int size){
        pointer = size;
        arr = new int [size];
        retival = size;
    }

    public void push(int num){
        if(pointer > 0){
            pointer--;
            arr[pointer] = num;
        }
    }

    public Integer pop(){
        if (retival > pointer) {
            retival--;
            return arr[retival];

        }
        return null;
    }

    public Integer peek() {

        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return null;
        }

        return arr[retival - 1];
    }

    public void display(){
        for(int i=arr.length-1; i >= pointer; i--){
            System.out.print(arr[i]+" -> ");
        }

        System.out.println("Finished");
    }

    public boolean isEmpty(){
        return pointer >= arr.length;
    }

    public boolean isFull(){
        return pointer == 0;
    }
}
