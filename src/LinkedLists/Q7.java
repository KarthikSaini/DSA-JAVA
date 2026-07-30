package LinkedLists;

// Remove duplicates from sorted list
public class Q7 {

    public static Node removeDuplicates(Node node){

        if(node == null || node.next == null){
            return node;
        }

        Node temp = node;
        while(temp != null && temp.next != null){
            if(temp.val == temp.next.val ){
                temp.next = temp.next.next;
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
        Node node6 = new Node(70);
        Node node7 = new Node(80);
        Node node8 = new Node(80);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;



        Node.display(node1);
        Node result = removeDuplicates(node1);
        Node.display(result);
    }

}
