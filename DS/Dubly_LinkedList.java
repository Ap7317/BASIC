import java.util.Scanner;

public class Dubly_LinkedList{
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
        System.out.print("Enter how many node you want to create=");
        int n=in.nextInt();
        for(int i=0;i<n;i++){
            System.out.print("Enter the data=");
            int data=in.nextInt();
            Node temp=new Node(data);
            if(head==null){
                head=temp;
                tail=temp;
            }
            head.prev=temp;
            temp.next=head;
            head=temp;
        }
    // }
    // public void front_traverse(){
    //     Node temp=head;
    //     if(temp==null){
    //         System.out.println("No element present in Linked List.");
    //     }
    //     while(temp!=null){
    //         System.out.println(temp.data);
    //         temp=temp.next;
    //     }
    // }
    public void insert_beg(){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the data=");
        int data=in.nextInt();
        Node temp=new Node(data);
        if(head==null){
            head=temp;
            tail=temp;
        }
        head.prev=temp;
        temp.next=head;
        head=temp;
    }
    public void insert_end(){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the data=");
        int data=in.nextInt();
        Node temp=new Node(data);
        if(head==null){
            head=temp;
            tail=temp;
        }
        tail.next=temp;
        temp.prev=tail;
        tail=temp; 
    }
    public void insert_pos(){
        Scanner in=new Scanner(System.in);
        System.out.print("Ente the position=");
        int pos=in.nextInt();
        System.out.print("Enter the data=");
        int data=in.nextInt();
        Node temp=new Node(data);
        Node ptr=head;
        Node ptr1=ptr;
        int i=1;
        while(i<pos){
            ptr1=ptr;
            ptr=ptr.next;
            i++;
        }
        temp.next=ptr;
        temp.prev=ptr1;
        ptr1.next=temp;
        ptr.prev=temp;
        
    }
    public void back_traverse(){
        Node temp=tail;
        if(head==null){
            System.out.println("No element exist");
        }
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.prev;
        }
    }
    public void del_beg(){
        if(head==null){
            System.out.println("No element present in linked list");
        }
        Node temp=head;
        temp=temp.next; 
        System.out.println("Deleted element="+temp.data);
        head=temp;
        temp.prev=null;
    }
    public void del_end(){
        if(head==null){
            System.out.println("No element present in linked list");
        }
        Node ptr=tail;
        ptr=ptr.prev;
        System.out.println("Deleted element="+tail.data);
        tail=ptr;
        ptr.next=null;
    }
    public void del_pos(){
        if(head==null){
            System.out.println("No element present in linked list");
        }
        Scanner in=new Scanner(System.in);
        System.out.print("Enter position=");
        int pos=in.nextInt();
        Node temp=head;
        Node ptr=temp.next;
        int i=1;
        while(i<pos-1){
            temp=ptr;
            ptr=ptr.next;
        }
        System.out.println("Deleted element="+temp.data);
        temp.next=ptr.next;
        ptr.next.prev=temp;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Dubly_LinkedList DLL=new Dubly_LinkedList();
        System.out.println("DOUBLY LINKED LIST OPERTATION:");
        System.out.println("-------------------------------------------------");
        System.out.println("1 -> CREATION");
        System.out.println("2 -> INSERTION AT BEGINING");
        System.out.println("3 -> INSERTION AT END");
        System.out.println("4 -> INSERTION AT ANY POSITION");
        System.out.println("5 -> DELETION AT BEGINING");
        System.out.println("6 -> DELETION AT END");
        System.out.println("7 -> DELETION AT ANY POSITION");
        System.out.println("8 -> BACK TRAVERSAL");
        System.out.println("ANY KEY -> EXIT");
        System.out.println("-------------------------------------------------");
        int ch=1;
        while(ch==1){
            System.out.print("Enter the choice=");
            int choice=in.nextInt();
            switch(choice){
                case 1:
                    DLL.creation();
                    break;
                case 2:
                    DLL.insert_beg();
                    break;
                case 3:
                    DLL.insert_end();
                    break;
                case 4:
                    DLL.insert_pos();
                    break;
                case 5:
                    DLL.del_beg();
                    break;
                case 6:
                    DLL.del_end();
                    break;
                case 7:
                    DLL.del_pos();
                    break;
                case 8:
                    DLL.back_traverse();
                    break;
                default:
                    System.out.println("PROGRAM EXITS.");
            }
            System.out.println("Enter 1 to continue.");
            ch=in.nextInt();
        }
    }
}