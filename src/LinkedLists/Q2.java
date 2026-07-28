package LinkedLists;

// Delete a node from linked list
public class Q2 {

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

    public static Node delete(Node node, int value){
        Node temp = node;

        if(node.val == value){
            return node.next;
        }

        while(temp.next != null){

            if(temp.next.val == value){
                temp.next = temp.next.next;
                break;
            }

            temp = temp.next;
        }

        return node;
    }

    public static void main(String[] args) {

        Node node1 = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);
        Node node4 = new Node(40);
        Node node5 = new Node(50);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        display(node1);
        Node node6 = delete(node1, 50);
        display(node6);

    }
}
