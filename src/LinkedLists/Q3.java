package LinkedLists;

// Find middle of linked list (two pointer)
public class Q3 {

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

    public static Node findMiddle(Node node){

        if(node == null || node.next == null){
            return node;
        }

        if(node.next.next == null){
            return node.next;
        }
        Node p1 = node;
        Node p2 = node;

        while(p2.next != null && p2.next.next != null){

            p1 = p1.next;
            p2 = p2.next.next;

            if(p2.next == null){
                return p1;
            }

            if(p2.next.next == null){
                return p1.next;
            }

        }
        return p1;
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
//        node5.next = node6;

        display(node1);
        Node node7 = findMiddle(node1);
        System.out.println(node7.val);

    }
}
