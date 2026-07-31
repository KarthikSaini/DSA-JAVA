package LinkedLists;

// Working and optimized for leet code
// Add two numbers represented as linked lists
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

//    public static Node addTwoNumbers(Node l1, Node l2) {
//        if(l1.val == 0 && l2.val == 0 && l1.next == null && l2.next == null){
//            return new Node(0);
//        }
//        return numberToLinkedList(linkedListToNumber(l1)+linkedListToNumber(l2));
//    }

    public static int likedlistLen(Node node){
        if(node == null){
            return 0;
        }

        int len = 0;

        while(node != null){
            len++;
            node = node.next;
        }

        return len;
    }

    public static Node addTwoNumbers(Node l1, Node l2) {
        if (l1.val == 0 && l2.val == 0 && l1.next == null && l2.next == null) {
            return new Node(0);
        }


        Node larger = null;
        Node temp = new Node(-1);
        Node result = temp;

        if(likedlistLen(l1) > likedlistLen(l2)){
            larger = l1;
        } else {
            larger = l2;
        }

        int sum = 0;

        while(larger != null ){

            if(l1 != null){
//                System.out.println(l1.val);
                sum = sum + l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
//                System.out.println(l2.val);
                sum = sum + l2.val;
                l2 = l2.next;
            }

            temp.next = new Node(sum%10);
            temp = temp.next;

//            if we want answer in reverse order
//            Node temp = new Node(sum%10);
//            temp.next = result;
//            result = temp;
            sum = sum / 10;

            larger = larger.next;
        }

        if(sum > 0){
//            if we want answer in reverse order
//            Node temp = new Node(sum%10);
//            temp.next = result;
//            result = temp;

            temp.next = new Node(sum%10);
            temp = temp.next;

        }

        return result.next;
    }

    public static void main(String[] args) {
//        int[] number1 = {2,4,3};
//        int[] number2 = {5,6,4};
        int[] number1 = {9,9,9,9,9,9,9};
        int[] number2 = {9,9,9,9};
//        int[] number1 = {9};
//        int[] number2 = {1,9,9,9,9,9,9,9,9,9};
//        int[] number1 = {9,9,9,9};
//        int[] number2 = {9};
        Node list1 = Node.add(number1);
        Node list2 = Node.add(number2);
//        Node.display(list1);
//        Node.display(list2);

        Node result = addTwoNumbers(list1, list2);
        Node.display(result);
    }

}
