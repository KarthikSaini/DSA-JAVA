package Tree;


// Start learning about Tree Data Structures
public class buildingTree {

    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val = val;
        }
    }

    public static void display(Node root){
        if(root==null) return;

        System.out.print(root.val+ " ->");
        if(root.left!=null) {System.out.print(root.left.val+", ");} else {System.out.print("null,");}
        if(root.right!=null) {System.out.print(root.right.val);} else {System.out.print(" null");};
        System.out.println();

        display(root.left);
        display(root.right);
    }

    public static void main(String[] args){
        Node root = new Node(2);
        root.left = new Node(4);
        root.right = new Node(10);
        root.left.left = new Node(6);
        root.left.right = new Node(5);
        root.right.right = new Node(11);
//        System.out.println(root.left.left.val);
        display(root);
    }
}
