package LinkedLists;

public class Q1 {

    Node head;

    static class Node {

        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // Insert at beginning
    public void insertAtBeginning(int val) {

        Node newNode = new Node(val);

        newNode.next = head;
        head = newNode;
    }

    // Insert at end
    public void insertAtEnd(int val) {

        Node newNode = new Node(val);

        // Empty list
        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // Insert at position (1-based indexing)
    public void insertAtPosition(int position, int val) {

        Node newNode = new Node(val);

        // Insert at first position
        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;

        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        // Invalid position
        if (temp == null) {
            System.out.println("Invalid Position");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Display Linked List
    public void display() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Q1 list = new Q1();

        list.insertAtBeginning(20);
        list.insertAtBeginning(10);

        list.insertAtEnd(40);
        list.insertAtPosition(3, 30);

        list.display();
    }
}