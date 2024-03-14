import java.util.*;

import javax.xml.transform.Source;
public class C_LL {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head=null;
    Node tail=null;
    public void create(){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter number of nodes want to create=");
        int n=in.nextInt();
        for(int i=0;i<n;i++){
            System.out.print("Enter the data=");
            int data=in.nextInt();
            Node temp=new Node(data);
            if(head==null){
                head=temp;                                                                                             
                tail=temp;
                head.next=head;
            }
            temp.next=head;
            head=temp;
            tail.next=head;
        }
    }
    public void traverse(){
        Node temp=head;
        if(head==null){
            System.out.println("No element present in linked list");
        }
        do{
            System.out.println(temp.data);
            temp=temp.next;
        }
        while(temp!=head);
    }
    public void insert_beg(){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the data=");
        int data=in.nextInt();
        Node temp=new Node(data);
        if(head==null){
            head=temp;
            tail=temp;
            head.next=head;
        }
        temp.next=head;
        head=temp;
        tail.next=temp;
    }
    public void insert_end(){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the data=");
        int data=in.nextInt();
        Node temp=new Node(data);
        if(head==null){
            head=temp;
            tail=temp;
            head.next=head;
        }
        tail.next=temp;
        tail=temp;
        temp.next=head;
    }
    public void insert_pos(){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the position=");
        int pos=in.nextInt();
        System.out.print("Enter the data=");
        int data=in.nextInt();
        Node temp=new Node(data);
        Node ptr=head;
        if(head==null){
            head=temp;
            tail=temp;
            head.next=head;
        }
        int i=0;
        while(i<pos-2){
            ptr=ptr.next;
            i++;
        }
        temp.next=ptr.next;
        ptr.next=temp;
    }
    public void del_beg(){
        if(head==null){
            System.out.println("No elemenet to delete.");
        }
        System.out.println("Deleted element="+head.data);
        head=head.next;
        tail.next=head;
    }
    public void del_end(){
        if(head==null){
            System.out.println("No element to delete.");
        }
        Node ptr=head;
        System.out.println("deleted element="+tail.data);
        while(ptr.next!=tail){
            ptr=ptr.next;
        }
        tail=ptr;
        ptr.next=head;
    }
    public void del_pos(){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the pos=");
        int pos=in.nextInt();
        if(head==null){
            System.out.println("No element to delete.");
        }
        Node ptr=head;
        Node prev=ptr;
        int i=1;
        while(i<pos){
            prev=ptr;
            ptr=ptr.next;
            i++;
        }
        System.out.println("Deleted element="+ptr.data);
        prev.next=ptr.next;
    }
    public static void main(String[] args) {
        C_LL cll=new C_LL();
        Scanner in=new Scanner(System.in);
        System.out.println("CIRCULAR LINKED OPERATIONS:");
        System.out.println("---------------------------------------------------");
        System.out.println("1 -> CREATION");
        System.out.println("2 -> INSERTION AT BEGIN");
        System.out.println("3 -> INSERTION AT END");
        System.out.println("4 -> INSERTION AT ANY POSITION");
        System.out.println("5 -> DELETION AT BEGIN");
        System.out.println("6 -> DELETION AT END");
        System.out.println("7 -> DELETION AT ANY POSTION");
        System.out.println("8 -> DISPLAY");
        System.out.println("ANY KEY -> EXIT");
        System.out.println("---------------------------------------------------");
        int n,ch=1;
        while(ch==1){
            System.out.print("Enter the choice=");
            n=in.nextInt();
            switch(n){
                case 1:
                   cll.create();
                   break;
                case 2:
                    cll.insert_beg();
                    break;
                case 3:
                    cll.insert_end();
                    break;
                case 4:
                    cll.insert_pos();
                    break;
                case 5:
                    cll.del_beg();
                    break;
                case 6:
                    cll.del_end();
                    break;
                case 7:
                    cll.del_pos();
                    break;
                case 8:
                    cll.traverse();
                    break;
                default:
                    System.out.println("Program Exits");
            }
            System.out.println("Do u want to continue if yes enter 1");
            ch=in.nextInt();
        }
    }
}

