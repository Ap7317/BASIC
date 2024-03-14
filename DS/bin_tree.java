import java.util.Scanner;

public class bin_tree {
    static Node create(){
        Node root=null;
        System.out.print("Enter the data=");
        Scanner in=new Scanner(System.in);
        int data=in.nextInt();
        if(data==-1){
            return null;
        }
        root=new Node(data);
        System.out.println("Enter the left child of "+ root);
        root.left=create();
        System.out.println("Enter the right child of "+ root);
        root.right=create(); 
        return root;
    }
    public static void main(String[] args) {
        create();
    }
}
class Node{
    Node left,right;
    int data;
    public Node(int data){
        this.data=data;
        left=null;
        right=null;
    }
}
