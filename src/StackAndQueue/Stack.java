package StackAndQueue;

// Implement stack using array
public class Stack {

    int pointer;

    int[] arr;

    Stack(int size){
        pointer = -1;
        arr = new int [size];
    }

//    public void push(int num){
//        if(pointer < arr.length-1){
//            pointer++;
//            arr[pointer] = num;
//        }
//    }

    public Integer pop(){
        if(pointer > -1){
            int temp = arr[pointer];
            pointer--;
            return temp;
        }
        return null;
    }

    public Integer peek(){
        if(pointer > -1){
            return arr[pointer];
        }
        return null;
    }

    public void display(){
        for(int i=0; i<=pointer; i++){
            System.out.print(arr[i]+" -> ");
        }

        System.out.println("Finished");
    }

    public boolean isEmpty(){
        return pointer < 0;
    }

    public boolean isFull(){
        return pointer >= arr.length-1;
    }
}
