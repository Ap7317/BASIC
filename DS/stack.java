import java.util.Scanner;
import java.util.Stack;


// STACK IMPLEMENTATION USING ARRAY


// class stack_array{
//     int n=10;
//     int[]a=new int[n];
//     int top=-1;
//     void push(){
//         Scanner in=new Scanner(System.in);
//         if(top==n-1){
//             System.out.println("Stack is overflow");
//         }
//         else{
//             System.out.print("Enter the data=");
//             int data=in.nextInt();
//             top++;
//             a[top]=data;
//             System.out.println(data+" item inserted");
//         }
//     }
//     void pop(){
//         if(top==-1){
//             System.out.println("Stack is underflow");
//         }
//         else{
//             System.out.println(a[top]+" deleted");
//             top--;
//         }
//     }
//     void display(){
//         if(top==-1){
//             System.out.println("No element in stack");
//         }
//         else{
//             System.out.println("Stack elements are:");
//         while(top-->=0){
//             System.out.println(a[top]);
//         }
//         }
//     }
// }
// public class stack{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         stack_array s=new stack_array();
//         System.out.println("STACK OPERATIONS ARE:");
//         System.out.println("-----------------------------------------------");
//         System.out.println("1 -> PUSH ELEMENT");
//         System.out.println("2 -> POP DATA");
//         System.out.println("3 -> DISPLAY DATA");
//         System.out.println("ANY KEY -> EXIT");
//         System.out.println("-----------------------------------------------");
//         int ch=1,choice;
//         while(ch==1){
//             System.out.print("Enter the choice=");
//             choice=in.nextInt();
//             switch(choice){
//                 case 1:
//                     s.push();
//                     break;
//                 case 2:
//                     s.pop();
//                     break;
//                 case 3:
//                     s.display();
//                     break;
//                 default:
//                     System.out.println("PROGRAM EXITS");
//             }
//             System.out.print("Do u want to continue press 1=");
//             ch=in.nextInt();
//         }
//     }
// }




// STACK IMPLEMENTATION USING LINKED LIST


// public class stack{
//     static class stack_LinkedList{
//         int data;
//         stack_LinkedList next;
//         stack_LinkedList prev;
//         stack_LinkedList(int data){
//             this.data=data;
//             this.next=null;
//             this.prev=null;
//         }
//     }
//     stack_LinkedList top=null;
//     public void push(){
//         System.out.println("PUSH OPERATION");
//         Scanner in=new Scanner(System.in);
//         System.out.print("Enter the data=");
//         int data=in.nextInt();
//         stack_LinkedList temp=new stack_LinkedList(data);
//         if(top==null){
//             top=temp;
//         }
//         else{
//             temp.next=top;
//             top=temp;
//         }
//     }
//     public void pop(){
//         stack_LinkedList temp=top;
//         if(top==null){
//             System.out.println("Stack underflow.");
//         }
//        else{
//            System.out.println("POP OPERATION:");
//            System.out.println(top.data+" deleted");
//            top=top.next;
//        }
//     }
//     public void display(){
//         // stack_LinkedList;
//         if(top==null){
//             System.out.println("Stack is underflow");
//         }
//         else{
//             while(top!=null){
//                 System.out.println(top.data);
//                 top=top.next;
//             } 
//         }
//     }
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         stack s=new stack();
//         System.out.println("STACK OPERATIONS ARE:");
//         System.out.println("-------------------------------------------");
//         System.out.println(" 1 -> PUSH DATA");
//         System.out.println(" 2 -> POP DATA");
//         System.out.println(" 3 -> DISPLAY DATA");
//         System.out.println(" ANY KEY -> EXIT");
//         System.out.println("-------------------------------------------");
//         int ch=1,choice;
//         while(ch==1){
//             System.out.print("Enter the choice=");
//             choice=in.nextInt();
//             switch(choice){
//                 case 1:
//                     s.push();
//                     break;
//                 case 2: 
//                     s.pop();
//                     break;
//                 case 3:
//                     s.display();
//                     break;
//                 default:
//                     System.out.println("PROGRAM EXIT.");
//             }
//             System.out.print("Press 1 for continue=");
//             ch=in.nextInt();
//         }
//     }
// }




public class stack{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the expression:");
        String s=in.next();
        StringBuilder str=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!=' '){
                str.append(ch);
            }
        }
        String s1=str.toString();
        System.out.println(s1+" "+post(s)+" "+s.length());
    }
    static String post(String s){
        Stack<Character> st=new Stack<>();
        StringBuilder str=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='0' && ch<='9'){
                str.append(ch);
            }
            else if(ch=='('){
                st.push(ch);
            }
            else if(ch==')'){
                while(!st.isEmpty() && st.peek()!='('){
                    str.append(st.peek());
                    st.pop();
                }
                st.pop();
            }
            else{
                while(!st.isEmpty() && st.peek()!='(' && prec(ch)<=prec(st.peek())){
                    str.append(st.pop());
                }
                st.push(ch);
            }
        }
        while(!st.isEmpty()){
            str.append(st.pop());
        }
        return str.toString();
    }
    public static int prec(char c){
        if(c=='+' || c=='-'){
            return 1;
        }
        if(c=='*' || c=='/'){
            return 2;
        }
        if(c=='^'){
            return 3;
        }
        return -1;
    }
    static convert()
    static int eval(String ch){
        Stack<String> st=new Stack<>();
        for(int i=0;i<ch.length;i++){
            if(ch[i].equals("+") || ch[i].equals("-") || ch[i].equals("*")|| ch[i].equals("/")){
                String c1=st.pop();
                String c2=st.pop();
                int a=Integer.parseInt(c1);
                int b=Integer.parseInt(c2);
                if(ch[i].equals("+")){
                    int ans=(a+b);
                    String c=Integer.toString(ans);
                    st.push(c);
                }
                else if(ch[i].equals("-")){
                    int ans=(b-a);
                    String c=Integer.toString(ans);
                    st.push(c);
                }
                else if(ch[i].equals("*")){
                    int ans=a*b;
                    String c=Integer.toString(ans);
                    st.push(c);
                }
                else if(ch[i].equals("/")){
                    int ans=(int)b/a;
                    String c=Integer.toString(ans);
                    st.push(c);
                }
            }
            else{
                st.push(ch[i]);
            }
        }
        String s=st.pop();
        int ans=Integer.parseInt(s);
        return ans;
    }
}

