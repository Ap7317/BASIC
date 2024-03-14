import java.util.Scanner;
import java.util.*;

public class S_LinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head=null;
    public void creation(){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter how many nodes you want to create=");
        int n=in.nextInt();
        for(int i=0;i<n;i++){
            System.out.print("Enter the data=");
            int data=in.nextInt();
            Node temp=new Node(data);
            if(head==null){
                head=temp;
            }
            else{
                temp.next=head;
                head=temp;
            }
        }
    }
    public void traverse(){
        Node temp=head;
        if(head==null){
            System.out.println("No element present in linked list");
        }
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public void insert_beg(){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the data=");
        int data=in.nextInt();
        Node temp=new Node(data);
        if(head==null){
            head=temp;
        }
        temp.next=head;
        head=temp;
    }
    public void insert_end(){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the data=");
        int data=in.nextInt();
        Node temp=new Node(data);
        Node ptr=new Node(data);
        temp=head;
        if(head==null){
            head=temp;
        }
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=ptr;
        ptr.next=null;
    }
    public void insert_pos(){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the data=");
        int data=in.nextInt();
        System.out.print("Enter the pos=");
        int pos=in.nextInt();
        Node temp=new Node(data);
        if(pos-1==0){
            temp.next=head;
            head=temp;
        }
        Node ptr=head;
        for(int i=0;i<pos-2;i++){
            ptr=ptr.next;
        }
        temp.next=ptr.next;
        ptr.next=temp;
    }
    public void del_beg(){
        int data;
        if(head==null){
            System.out.println("No element present in linked list");
        }
        System.out.println("Deleted elements="+head.data);
        head=head.next;
    }
    public void del_end(){
        if(head==null){
            System.out.println("No element present in linked list");
        }
        int data;
        Node temp=head;
        Node ptr=temp.next;
        while(ptr.next!=null){
            temp=ptr;
            ptr=ptr.next;
        }
        System.out.println("Deleted element="+ptr.data);
        temp.next=null;
    }
    public void del_pos(){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter data=");
        int pos=in.nextInt();
        if(pos==0){
            head=head.next;
        }
        Node temp=head;
        Node ptr=temp;
        for(int i=0;i<pos-1;i++){
            ptr=temp;
            temp=temp.next;
        }
        System.out.println("Deleted element="+temp.data);
        ptr.next=temp.next;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        S_LinkedList sll=new S_LinkedList();
        int choice,ch=1;
        System.out.println("SINGLE LINKED LIST OPERATIONS:");
        System.out.println("-------------------------------------------");
        System.out.println("1 -> CREATION");
        System.out.println("2 -> INSERTION AT BEGIN");
        System.out.println("3 -> INSERTION AT END");
        System.out.println("4 -> INSERTION ATE ANY POSITION");
        System.out.println("5 -> DELETION ATE BEGIN");
        System.out.println("6 -> DELTION AT END");
        System.out.println("7 -> DELETION AT ANY POSITION");
        System.out.println("8 -> TRAVERSAL");
        System.out.println("--------------------------------------------");
        while(ch==1){
            System.out.print("Enter the choice=");
            choice=in.nextInt();
            switch(choice){
                case 1:
                    sll.creation();
                    break;
                case 2:
                    sll.insert_beg();
                    break;
                case 3:
                    sll.insert_end();
                    break;
                case 4:
                    sll.insert_pos();
                    break;
                case 5:
                    sll.del_beg();
                    break;
                case 6:
                    sll.del_end();
                    break;
                case 7:
                    sll.del_pos();
                    break;
                case 8:
                    sll.traverse();
                    break;
                default:
                    System.out.println("Program Exit");
            }
            System.out.println("Enter 1 to continue");
            ch=in.nextInt();
        }
    }
}