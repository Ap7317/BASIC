import java.util.*;
import java.io.*;

// Q1. DUPLICATES BRACKETS

// public class Stack_ques {
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.println("Enter expression:");
//         String s=in.nextLine();
//         Stack<Character> st=new Stack<>();
//         for(int i=0;i<s.length();i++){
//             if(s.charAt(i)==')'){
//                 if(st.peek()=='('){
//                     System.out.println("true");
//                     return;
//                 }
//                 else{
//                     while(st.peek()!='('){
//                         st.pop();
//                     }
//                     st.pop();
//                 }
//             }
//             else{
//                 st.push(s.charAt(i));
//             }
//         }
//         System.out.println("false");
//     }
// }



// Q3.NEXT GREATER ELEMENT TO THE RIGHT

// public class Stack_ques{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.print("Enter the size=");
//         int n=in.nextInt();
//         int[] arr=new int[n];
//         System.out.println("Enter elements of array:");
//         for(int i=0;i<n;i++){
//             arr[i]=in.nextInt();
//         }
//         int[]  ans=sol(arr);
//         System.out.println(Arrays.toString(ans));
//     }
//     public static  int[] sol(int[] arr){
//         int[] nge=new int[arr.length];
//         Stack<Integer> st=new Stack<>();
//         st.push(arr[arr.length-1]);
//         nge[arr.length-1]=-1;
//         for(int i=arr.length-2;i>=0;i--){
//             while(st.size()>0 && arr[i]>=st.peek()){
//                 st.pop();
//             }
//             if(st.size()==0){
//                 nge[i]=-1;
//             }
//             else{
//                 nge[i]=st.peek();
//             }
//             st.push(arr[i]);
//         }
//         return nge;
//     }
// }



// Q 3. Balanced Brackets


// public class Stack_ques{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.println("Enter the expression:");
//         String s=in.nextLine();
//         boolean ans=valid(s);
//         System.out.println(ans);
//     }
//     public static boolean valid(String s){
//         Stack<Character> st=new Stack<>();
//         for(int i=0;i<s.length();i++){
//             char c=s.charAt(i);
//             if(c=='{' || c=='(' || c=='['){
//                 st.push(c);
//             }
//             else{
//                 if(st.isEmpty()){
//                     return false;
//                 }
//                 else if(c==')' && st.peek()=='('){
//                     st.pop();
//                 }
//                 else if(c==']' && st.peek()=='['){
//                     st.pop();
//                 }
//                 else if(c=='}' && st.peek()=='{'){
//                     st.pop();
//                 }
//                 else{
//                     return false;
//                 }
//             }
//         }
//         return st.isEmpty();
//     }
// }



// Balanced Brackets Alternate approach without Stack

// public class Stack_ques{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.println("Enter the expression:");
//         String s=in.nextLine();
//         System.out.println(valid(s));
//     }
//     public static boolean valid(String s){
//         int i = -1;
//         char[] stack = new char[s.length()];
//         for (char ch : s.toCharArray()) {
//             if (ch == '(' || ch == '{' || ch == '[')
//                 stack[++i] = ch;
//             else {
//                 if (i >= 0
//                     && ((stack[i] == '(' && ch == ')')
//                         || (stack[i] == '{' && ch == '}')
//                         || (stack[i] == '[' && ch == ']')))
//                     i--;
//                 else
//                     return false;
//             }
//         }
//         return i == -1;
//     }
// }



// public class Stack_ques{
//     public static void main(String[] args){
// 		Scanner in = new Scanner(System.in);
// 		int testCases = Integer.parseInt(in.nextLine());
// 		while(testCases>0){
// 			String pattern = in.nextLine();
//             StringBuilder str=new StringBuilder();
//             for(int i=0;i<pattern.length();i++){
//                 char ch=pattern.charAt(i);
//                 if(ch=='[' || ch==']' || ch=='{' || ch=='}' || ch=='(' || ch==')')
//                     str.append(ch);
//             }
//           	boolean ans=valid(str.toString());
//               if(ans==true){
//                   System.out.println("Valid");
//               }
//               else{
//                   System.out.println("Invalid");
//               }
// 		}
// 	}
//     public static boolean valid(String s){
//         int i = -1;
//         char[] stack = new char[s.length()];
//         for (char ch : s.toCharArray()) {
//             if (ch == '(' || ch == '{' || ch == '[')
//                 stack[++i] = ch;
//             else {
//                 if (i >= 0
//                     && ((stack[i] == '(' && ch == ')')
//                         || (stack[i] == '{' && ch == '}')
//                         || (stack[i] == '[' && ch == ']')))
//                     i--;
//                 else
//                     return false;
//             }
//         }
//         return i == -1;
//     }
// }






