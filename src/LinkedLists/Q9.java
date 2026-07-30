package LinkedLists;

import java.util.Stack;

// Working but need to Optimize
// Check if linked list is palindrome
public class Q9 {

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

    public static boolean isPalindrome(Node head) {

        if(head == null || head.next == null){
            return true;
        }

        int len = likedlistLen(head);
        Node p2 = head;

        Stack<Integer> list = new Stack<>();
        for(int i=0; i<len/2; i++){
            list.push(p2.val);
            p2 = p2.next;
        }

        if(len % 2 != 0){
            p2 = p2.next;
        }

        while(p2 != null){
            if(p2.val != list.pop()){
                return false;
            }
            p2 = p2.next;
        }
        return true;
    }

    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,4,3,2,1};
        int[] arr = {1,2,0,2,1};
        Node list = Node.add(arr);
//        Node.display(list);
        boolean result = isPalindrome(list);
        System.out.println(result);
    }
}
