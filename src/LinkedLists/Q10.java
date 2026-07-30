package LinkedLists;

// Working but not for leet code and need optimizes as well
public class Q10 {

    public static long linkedListToNumber(Node node){

        if(node == null){
            return 0;
        }

        long multiplier = 1;
        long sum = 0;

        while(node != null){
            long temp = node.val * multiplier;
            sum = sum + temp;
            multiplier = multiplier *10;
            node = node.next;
        }

        return sum;
    }

    public static Node numberToLinkedList(long num){

        Node temp = new Node(-1);
        Node result = temp;

        while(num > 0 ){
            temp.next = new Node((int) (num%10));
            temp = temp.next;
            num = num / 10;
        }

        return result.next;
    }

    public static Node addTwoNumbers(Node l1, Node l2) {
        if(l1.val == 0 && l2.val == 0 && l1.next == null && l2.next == null){
            return new Node(0);
        }
        return numberToLinkedList(linkedListToNumber(l1)+linkedListToNumber(l2));
    }

    public static void main(String[] args) {
//        int[] number1 = {2,4,3};
//        int[] number2 = {5,6,4};
//        int[] number1 = {9,9,9,9,9,9,9};
//        int[] number2 = {9,9,9,9};
        int[] number1 = {9};
        int[] number2 = {1,9,9,9,9,9,9,9,9,9};
        Node list1 = Node.add(number1);
        Node list2 = Node.add(number2);
//        Node.display(list1);
//        Node.display(list2);

        Node result = addTwoNumbers(list1, list2);
        Node.display(result);
    }

}
