package StackAndQueue;

public class Q2 {

    public static void main(String[] args) {

        Queue queue = new Queue(5);
        queue.push(1);
        queue.push(2);
//        queue.push(3);
//        queue.push(4);
//        queue.push(5);
//        queue.push(6);
        queue.display();
//        System.out.println(queue.isFull());
//        System.out.println(queue.peek()+" Peek");
        System.out.println(queue.pop());
        queue.display();
        System.out.println(queue.isEmpty());


    }
}
