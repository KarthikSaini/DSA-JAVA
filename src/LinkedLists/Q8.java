package LinkedLists;

public class Q8 {

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

    public static Node removeNthFromEnd(Node head, int n) {

        if(head == null){
            return head;
        }

        if(head.next == null && n ==1){
            return null;
        } else if (head.next == null && n ==0){
            return head;
        }


        int len = likedlistLen(head);
        int remN = len - n -1;
        Node temp = head;
        Node result = temp;

        if(remN < 0){
            return head.next;
        }

        for(int i =0; i<remN; i++){
            temp = temp.next;
        }

        System.out.println(temp.val);
        temp.next = temp.next.next;

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,2};
        Node list = Node.add(arr);
//        Node.display(list);
        Node result = removeNthFromEnd(list,2);
        Node.display(result);
    }
}
