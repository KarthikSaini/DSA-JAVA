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

    public static Node add(int[] arr){

            Node head = new Node(-1);

            Node temp = head;

            for(int i : arr){
                temp.next = new Node(i);
                temp = temp.next;
            }

            return head.next;
    }

    }




