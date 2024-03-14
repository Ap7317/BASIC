import java.util.Scanner;

public class C_D_LL {
    static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    Node head=null;
    Node tail=null;
    public void creation(){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter how many node want to create=");
        int n=in.nextInt();
        for(int i=0;i<n;i++){
            System.out.print("Enter the data=");
            int data=in.nextInt();
            Node temp=new Node(data);
            if(head==null){
                head=temp;
                tail=temp;
                temp.next=head;
                temp.prev=tail;
            }
            temp.next=head;
            temp.prev=tail;
            head.prev=temp;
            head=temp;
            tail.next=temp;
        }
    }
    public void insert_beg(){
        System.out.println("INSERTION AT BEGIN:");
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the data=");
        int data=in.nextInt();
        Node temp=new Node(data);
        if(head==null){
            head=tail=temp;
            temp.next=temp.prev=head;
        }
        temp.next=head;
        temp.prev=tail;
        head.prev=tail.next=temp;
        head=temp;
    }
    public void insert_end(){
        System.out.println("INSERTION AT END:");
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the data=");
        int data=in.nextInt();
        Node temp=new Node(data);
        if(head==null){
            head=tail=temp;
            temp.next=temp.prev=head;
        }
        temp.next=head;
        tail.next=temp;
        head.prev=temp;
        temp.prev=tail;
        tail=temp;
    }
    public void insert_pos(){
        System.out.println("INSERTION AT ANY POSITION;");
        Scanner in=new Scanner(System.in);
        System.out.print("Enter position=");
        int pos=in.nextInt();
        System.out.print("Enter data=");
        int data=in.nextInt();
        Node temp=new Node(data);
        Node ptr=head;
        Node ptr1=ptr.next;
        if(head==null){
            head=tail=temp;
            temp.next=temp.prev=head;
        }
        int i=1;
        while(i<pos){
            ptr=ptr1;
            ptr1=ptr1.next;
        }
        temp.prev=ptr;
        ptr.next=temp;
        temp.next=ptr1;
        ptr1.prev=temp;
    }
    public void del_beg(){
        if(head==null){
            System.out.println("No element present in Linked List.");
        }
        else{
            System.out.println("DELETION AT BEGIN:");
            Node temp=head.next;
            System.out.println("Deleted element="+temp.prev.data);
            temp.prev=tail;
            tail.next=temp;
            head=temp;
        }
    }
    public void front_traverse(){
        Node temp=head;
        if(head==null){
            System.out.println("No element present in Linked List");
        }
        else{
            System.out.println("FRONT TRAVERSE:");
            do{
                System.out.println(temp.data);
                temp=temp.next;
            }
            while(temp!=head);
        }
    }
    public void back_traverse(){
        Node temp=tail;
        if(head==null){
            System.out.println("No element present in linked list");
        }
        else{
            System.out.println("BACKWARD TRAVERSE:");
            do{
                System.out.println(temp.data);
                temp=temp.prev;
            }
            while(temp!=tail);
        }
    }
    public void del_end(){
        if(head==null){
            System.out.println("No element present in linked list.");
        }
        System.out.println("DELETION AT END:");
        System.out.println("Deleted element="+tail.data);
        head.prev=tail.prev;
        tail.prev.next=head;
        tail=tail.prev;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        C_D_LL cdl=new C_D_LL();
        cdl.creation();
        cdl.insert_beg();
        cdl.insert_end();
        cdl.insert_pos();
        cdl.del_beg();
        cdl.del_end();
        cdl.back_traverse();
        cdl.front_traverse();
    }
}
