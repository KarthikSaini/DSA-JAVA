package LinkedLists;

// Reverse a linked list (iterative and recursive)
public class Q5 {

    static class Node {

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
    }

    public static void display(Node node){

        Node temp = node;

        while(temp != null){
            System.out.print(temp.val+ " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static Node reverseList(Node node){

        if(node == null || node.next == null){
            return node;
        }

        Node temp = node;
        Node prev = null;
        Node next = null;

        while(temp != null){

            next = temp.next;
            temp.next = prev;
            prev = temp;

            temp = next;
        }

        return prev;
    }

    public static void main(String[] args) {
        Node node1 = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);
        Node node4 = new Node(40);
        Node node5 = new Node(50);
        Node node6 = new Node(60);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

        display(node1);
        display(reverseList(node1));
    }
}
