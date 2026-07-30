package LinkedLists;

public class Node {

        int val;
        Node next;

        Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }

        Node(int val) {
            this.val = val;
            this.next = null;
        }

    public static void display(Node node){

        Node temp = node;

        while(temp != null){
            System.out.print(temp.val+ " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    }




