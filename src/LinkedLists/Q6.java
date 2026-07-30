package LinkedLists;

// Merge two sorted linked lists
public class Q6 {

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

//    static public Node mergeSortedLinkedlist(Node node1, Node node2){
//
//        if(node1 == null){
//            return node2;
//        }
//
//        if(node2 == null){
//            return node1;
//        }
//
//        Node result = null;
//        Node point1 = node1;
//        Node point2 = node2;
//
//        if(node1.val < node2.val){
//            result = node1;
//            point1 = point1.next;
//        } else {
//            result = node2;
//            point2 = point2.next;
//        }
//
//        Node tempResult = result;
//
//        while(point1 != null && point2 != null){
//            if(point1.val < point2.val){
//                result.next = point1;
//                point1 = point1.next;
//            } else {
//                result.next = point2;
//                point2 = point2.next;
//            }
//        }
//
//        return tempResult;
//    }

    public static Node mergeSortedLinkedlist(Node node1, Node node2) {

        if (node1 == null)
            return node2;

        if (node2 == null)
            return node1;

        Node head;
        Node current;

        if (node1.val < node2.val) {
            head = node1;
            node1 = node1.next;
        } else {
            head = node2;
            node2 = node2.next;
        }

        current = head;

        while (node1 != null && node2 != null) {

            if (node1.val < node2.val) {
                current.next = node1;
                node1 = node1.next;
            } else {
                current.next = node2;
                node2 = node2.next;
            }

            current = current.next;
        }

        if (node1 != null) {
            current.next = node1;
        } else {
            current.next = node2;
        }

        return head;
    }

    public static void main(String[] args) {
        Node list1Node1 = new Node(10);
        Node list1Node2 = new Node(20);
        Node list1Node3 = new Node(30);
        Node list1Node4 = new Node(50);
        Node list1Node5 = new Node(70);

        list1Node1.next = list1Node2;
        list1Node2.next = list1Node3;
        list1Node3.next = list1Node4;
        list1Node4.next = list1Node5;

        Node list2Node1 = new Node(15);
        Node list2Node2 = new Node(25);
        Node list2Node3 = new Node(40);
        Node list2Node4 = new Node(60);
        Node list2Node5 = new Node(80);

        list2Node1.next = list2Node2;
        list2Node2.next = list2Node3;
        list2Node3.next = list2Node4;
        list2Node4.next = list2Node5;

        display(list1Node1);
        display(list2Node1);

        display(mergeSortedLinkedlist(list1Node1, list2Node1));
        System.out.println("completed");
    }
}
