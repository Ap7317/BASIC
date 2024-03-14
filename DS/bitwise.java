import java.util.Scanner;

import javax.naming.InvalidNameException;

import java.util.*;

//Q1. ON A PARTICULAR BIT OF A NUMBER

// public class bitwise{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.print("Enter the number=");
//         int x=in.nextInt();
//         System.out.print("Enter the bit number which one you want to on=");
//         int n=in.nextInt();
//         n=1<<n;
//         System.out.println(n|x);
//     }
// }



//Q2. TO OFF A PARTICULAR BIT OF A NUMBER


// public class bitwise{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.print("Enter the number=");
//         int x=in.nextInt();
//         System.out.print("Enter the bit number which one you want to on=");
//         int n=in.nextInt();
//         n=1<<n;
//         n=~n;
//         System.out.println(n&x);
//     }
// }


//Q3. TO TOGGLE OR FLIP A PARTICULAR BIT OF A NUMBER(USING XOR)


// public class bitwise{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.print("Enter the number=");
//         int x=in.nextInt();
//         System.out.print("Enter the bit number which one you want to on=");
//         int n=in.nextInt();
//         n=1<<n;
//         System.out.println(n^x);
//     }
// }



//Q4. TO CHECK A BIT IS ON OR OFF(USING AND)


// public class bitwise{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.print("Enter the number=");
//         int x=in.nextInt();
//         System.out.print("Enter the bit number which one you want to on=");
//         int n=in.nextInt();
//         n=1<<n;
//         int a=x&n;
//         if(a==0){
//             System.out.println("Bits is off");
//             return;
//         }
//         System.out.println("Bit is on");
//     }
// }

// Q5. RIGHT MOST SET BIT OF A NUMBER


// public class bitwise{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.print("Enter the number=");
//         int n=in.nextInt();
//         System.out.println(Integer.toBinaryString(n&(-n)));
//     }
// }



// Q6. Kernighan's Algorithm(To check how many bits are on and off)


// public class bitwise{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.print("Enter the number=");
//         int n=in.nextInt();
//         int c=0;
//         while(n!=0){
//             c++;
//             n-=(n&(-n));
//         }
//         System.out.println(c+" number of bit are on.");
//         System.out.println((32-c)+" number of bit are off");
//     }
// }



// Q7. Josephus Special Case(Simple Approach)



// public class bitwise{
//     public static void main(String[] args) {
//         Scanner in =new Scanner(System.in);
//         System.out.print("Enter the number=");
//         int n=in.nextInt();
//         int i=1;
//         while(Math.pow(2,i)<=n){
//             i++;
//         }
//         int ans=n-(int)Math.pow(2,i-1);
//         ans=2*ans+1;
//         System.out.println(ans);
//     }
// }


// Alternate Method Josephus Special(Bitwise)


// public class bitwise{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//     }
// }




// Q8. Print n bit grey code


// public class bitwise{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.print("Enter the number=");
//         int n=in.nextInt();
//         ArrayList<String> l=grey(n);
//         System.out.println(l);
//     }
//     public static ArrayList<String> grey(int n){
//         if(n==1){
//             ArrayList<String> b=new ArrayList<>();
//             b.add("0");
//             b.add("1");
//             return b;
//         }
//         ArrayList<String> r=grey(n-1);
//         ArrayList<String> l=new ArrayList<>();
//         for(int i=0;i<r.size();i++){
//             String s=r.get(i);
//             l.add("0"+s);
//         }
//         for(int i=r.size()-1;i>=0;i--){
//             String s=r.get(i);
//             l.add("1"+s);
//         }
//         return l;
//     }
// }




// Q9. MINIMUM NUMBER OF SOFTWARE DEVELOPERS


