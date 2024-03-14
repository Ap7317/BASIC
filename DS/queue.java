import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

// QUEUE IMPLEMENTATION USING ARRAY


// class simple_queue{
//     int data;
//     int n=10;
//     int[] arr=new int[n];
//     int f=-1,r=-1;
//     void enqueue(){
//         Scanner in=new Scanner(System.in);
//         if(r==n-1){
//             System.out.println("Queue is Overflow.");
//         }
//         else if(f==-1 && r==-1){
//             System.out.println("INSRTION OPERATION:");
//             System.out.print("Enter the data=");
//             int data=in.nextInt();
//             f=r=0;
//             arr[r]=data;
//         }
//         else{
//             System.out.println("INSRTION OPERATION:");
//             System.out.print("Enter the data=");
//             int data=in.nextInt();
//             r++;
//             arr[r]=data;
//         }
//     }
//     void dequeue(){
//         if(f==-1 && r==-1){
//             System.out.println("Queue is underflow.");
//         }
//         else{
//             System.out.println("DELETION OPERATION:");
//             System.out.println(arr[f]+" deleted");
//             f++;
//         }
//     }
//     void display(){
//         if(f==-1 && r==-1){
//             System.out.println("Queue is underflow.");
//         }
//         else{
//             System.out.println("QUEUE ELEMENTS ARE:");
//             for(int i=f;i>=r;i--){
//                 System.out.println(arr[i]);;
//             }
//         }
//     }
// }

// public class queue {
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         simple_queue q=new simple_queue();
//         int ch=1,choice;
//         System.out.println("QUEUE OPERATION ARE:");
//         System.out.println("-----------------------------------------------");
//         System.out.println(" 1 -> ENQUEUE DATA");
//         System.out.println(" 2 -> DEQUEUE DATA");
//         System.out.println(" 3 -> DISPLAY DATA");
//         System.out.println(" ANY KEY -> EXIT");
//         System.out.println("-----------------------------------------------");
//         while(ch==1){
//             System.out.print("Enter the choice=");
//             choice=in.nextInt();
//             switch(choice){
//                 case 1:
//                     q.enqueue();
//                     break;
//                 case 2:
//                     q.dequeue();
//                     break;
//                 case 3:
//                     q.display();
//                     break;
//                 default:
//                     System.out.println("PROGRAM EXITS");
//             }
//             System.out.print("Press 1 to continue=");
//             ch=in.nextInt();
//         }
//     }
// }





// QUEUE IMPLEMENTATION USING LINKED LIST



// public class queue{
//     static class simple_queue{
//         int data;
//         simple_queue next;
//         simple_queue(int data){
//             this.data=data;
//             this.next=null;
//         }
//     }
//     simple_queue f=null,r=null;
//     public void enqueue(){
//         Scanner in=new Scanner(System.in);
//         System.out.println("ENQUEUE OPERATION:");
//         System.out.print("Enter the data=");
//         int data=in.nextInt();
//         simple_queue temp=new simple_queue(data);
//         if(f==null && r==null){
//             f=r=temp;
//         }
//         else{
//             r.next=temp;
//             r=temp;
//         }
//     }
//     public void dequeue(){
//         simple_queue temp=f;
//         if(f==null && r==null){
//             System.out.println("Queue is underflow.");
//         }
//         else{
//             System.out.println("DEQUEUE OPERATION:");
//             System.out.println(f.data);
//             f=f.next;
//         }
//     }
//     public void display(){
//         simple_queue temp=f;
//         if(f==null && r==null){
//             System.out.println("Queue is underflow.");
//         }
//         else{
//             System.out.println("Queue elements are:");
//             while(temp!=null){
//                 System.out.println(temp.data);
//                 temp=temp.next;
//             }
//         }
//     }
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         queue q=new queue();
//         int ch=1;
//         System.out.println("QUEUE OPERATION ARE:");
//         System.out.println("----------------------------------------");
//         System.out.println(" 1 -> ENQUEUE DATA");
//         System.out.println(" 2 -> DEQUEUE DATA");
//         System.out.println(" 3 -> DISPLAY DATA");
//         System.out.println(" ANY KEY -> EXIT");
//         System.out.println("----------------------------------------");
//         while(ch==1){
//             System.out.print("Enter the choice=");
//             int choice=in.nextInt();
//             switch(choice){
//                 case 1:
//                     q.enqueue();
//                     break;
//                 case 2:
//                     q.dequeue();
//                     break;
//                 case 3:
//                     q.display();
//                     break;
//                 default:
//                     System.out.println("PROGRAM EXITS");
//             }
//             System.out.print("Press 1 to continue=");
//             ch=in.nextInt();
//         }
//     }
// }





// CIRCULAR QUEUE IMPLEMENTATION USING ARRAY    


// class circular_queue{
//     int n=10;
//     int[] arr=new int[n];
//     int data;
//     int f=-1,r=-1;
//     void enqueue(){
//         Scanner in=new Scanner(System.in);
//         if(f==(r+1)%n){
//             System.out.println("Queue is Overflow.");
//         }
//         else if(f==-1 && r==-1){
//             System.out.println("ENQUEUE OPERATION:");
//             System.out.print("Enter the data=");
//             int data=in.nextInt();
//             f=r=0;
//             arr[r]=data;
//         }
//         else{
//             System.out.println("ENQUEUE OPERATION:");
//             System.out.print("Enter the data=");
//             int data=in.nextInt();
//             r=(r+1)%n;
//             arr[r]=data;
//         }
//     }
//     void dequeue(){
//         if(f==-1 && r==-1){
//             System.out.println("Queue is underflow.");
//         }
//         else if(f==r){
//             System.out.println("Queue is underflow.");
//         }
//         else{
//             System.out.println("DEQUEUE OPERATION:");
//             System.out.println(arr[f]+" deleted");
//             f=(f+1)%n;
//         }
//     }
//     void display(){
//         if(f==-1 && r==-1){
//             System.out.println("Queue is underflow.");
//         }
//         else{
//             System.out.println("QUEUE ELEMENTS ARE:");
//             int i=f;
//             while(i!=r){
//                 System.out.println(arr[i]);
//                 i=(i+1)%n;
//             }
//         }
//     }
// }
// public class queue{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         circular_queue cq=new circular_queue();
//         int ch=1;
//         System.out.println("CIRCULAR QUEUE OPERATION ARE:");
//         System.out.println("------------------------------------------------");
//         System.out.println("1 -> ENQUEUE DATA");
//         System.out.println("2 -> DEQUEUE DATA");
//         System.out.println("3 -> DISPLAY DATA");
//         System.out.println("ANY KEY -> EXIT");
//         System.out.println("------------------------------------------------");
//         while(ch==1){
//             System.out.print("Enter the choice=");
//             int choice=in.nextInt();
//             switch(choice){
//                 case 1:
//                     cq.enqueue();
//                     break;
//                 case 2:
//                     cq.dequeue();
//                     break;
//                 case 3:
//                     cq.display();
//                     break;
//                 default:
//                     System.out.println("PROGRAM EXITS");
//             }
//             System.out.print("Press 1 for continue=");
//             ch=in.nextInt();
//         }
//     }
// }





// CIRCULAR QUEUE IMPLEMENETATION USING LINKED LIST



// public class queue{
//     static class circular{
//         int data;
//         circular next;
//         circular(int data){
//             this.data=data;
//             this.next=null;
//         }
//     }
//     circular f=null,r=null;
//     public void enqueue(){
//         Scanner in=new Scanner(System.in);
//         System.out.println("ENQUEUE OPERATION:");
//         System.out.print("Enter the data=");
//         int data=in.nextInt();
//         circular temp=new circular(data);
//         if(r==null){
//             f=r=temp;
//             r.next=temp;
//         }
//         else{
//             r.next=temp;
//             r=temp;
//             r.next=f;
//         }
//     }
//     public void dequeue(){
//         if(r==null){
//             System.out.println("No velue to delete");
//         }
//         else{
//             System.out.println("DEQUEUE OPERATION:");
//             System.out.println(f.data+" deleted");
//             f=f.next;
//             r=f;
//         }
//     }
//     public void display(){
//         if(r==null){
//             System.out.println("NO element in queue");
//         }
//         else{
//             System.out.println("DISPLAY OPERATION:");
//             circular temp=f;
//             do{
//                 System.out.println(temp.data);
//                 temp=temp.next;
//             }
//             while(temp!=f);
//         }
//     }
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         queue cq=new queue();
//         int ch=1;
//         System.out.println("CIRCULAR QUEUE OPERATIONS ARE:");
//         System.out.println("-------------------------------------------------------");
//         System.out.println("1 -> ENQUEUE DATA");
//         System.out.println("2 -> DEQUEUE DATA");
//         System.out.println("3 -> DISPLAY DATA");
//         System.out.println("ANY KEY -> EXIT");
//         System.out.println("-------------------------------------------------------");
//         while(ch==1){
//             System.out.print("Enter the choice=");
//             int choice=in.nextInt();
//             switch(choice){
//                 case 1:
//                     cq.enqueue();
//                     break;
//                 case 2:
//                     cq.dequeue();
//                     break;
//                 case 3:
//                     cq.display();
//                     break;
//                 default:
//                     System.out.println("PROGRAM EXITS.");
//             }
//             System.out.println("Press 1 to continue=");
//             ch=in.nextInt();
//         }
//     }
// }





// DOUBLE ENDED QUEUE(DEQUE) USING ARRAY(USING CIRCULAR QUEUE)



public class queue{
    public static void main(String[] args) {
        
    }
}


