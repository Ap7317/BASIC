import java.util.*;

// public class array_list{
//     public static void main(String[] args) {
//         // WRAPPER CLASSES
//         Integer g=Integer.valueOf(5);
//         System.out.println(g);
//         Float c=Float.valueOf(45.53f);
//         System.out.println(c);

//         // SYNTAX TO CREATE ARRAY LIST
//         List<Integer>list_name=new ArrayList<Integer>();
//         List<Float>list_name1=new ArrayList<Float>();
//         List<Boolean>list2=new ArrayList<Boolean>();

//         // METHODS FOR ARRAYLIST
//         // add method is uesd to add new element in array
//         list_name.add(5);
//         list_name1.add(4.5f);
//         list2.add(true);
//         System.out.println(list_name.get(0));
//         System.out.println(list_name1.get(0));
//         for(int i=1;i<5;i++){
//             list_name.add(i);
//         }

//         // ADDING ELEMENTS AT SOME INDEX

//         list_name.add(1,394);
//         System.out.println(list_name);

//         // MODIFYING ELEMENT AT SOME INDEX

//         list_name.set(0,34);
//         System.out.println(list_name);

//         // removing an element at any index

//         list_name.remove(0);
//         System.out.println(list_name);

//         // removing an element without index

//         list_name.remove(Integer.valueOf(4));
//         System.out.println(list_name);

//         // If any element is not present in list the if we pass remove element method in print statement then it will return boolean value
        
//         System.out.println(list_name.remove(Integer.valueOf(45)));


//         // checking if an element exist in arraylist or not (it return boolean value)

//         System.out.println(list_name.contains(Integer.valueOf(3)));


//         // if we don't specify wrapper class then we can store any datatype in arraylist

//         ArrayList l=new ArrayList();
//         l.add(43.5f);
//         l.add("Atharava");
//         l.add(43);
//         System.out.println(l);


//         // listname.size() find size of list

//         System.out.println("Size of list="+list_name.size());

//         // Collection.reverse(list_name) used to reverse the list

//         Collections.reverse(list_name);
//         System.out.println("ArrayList after reversing:");
//         System.out.println(list_name);

//         // Collections.sort(listname) is used to sort list in ascending order

//         Collections.sort(list_name);
//         System.out.println("List after sorting in ascending order:");
//         System.out.println(list_name);

//         // If u want to sort list in descending order

//         Collections.sort(list_name,Collections.reverseOrder());
//         System.out.println("List after sorting in descending order:");
//         System.out.println(list_name);  
//     }
// }





// // WRITE A PROGRAM TO REVERSE A ARRAYLIST

// public class array_list{
//     public static void main(String[] args) {
//         Scanner in=new  Scanner(System.in);
//         ArrayList<Integer> l=new ArrayList<>();
//         System.out.println("Enter the number of element in arraylist:");
//         int n=in.nextInt();
//         for(int i=0;i<n;i++){
//             l.add(i);
//         }
//         System.out.println(l);
//         reverseList(l);
//         Collections.reverse(l);
//         System.out.println(l);
//     }
//     static void reverseList(ArrayList<Integer> l){
//         int i=0,j=l.size()-1;
//         while(i<j){
//             swap(l.get(i),l.get(j));
//             i++;
//             j--;
//         }
//     }
//     static void swap(int a,int b){
//         int c=a;
//         a=b;
//         b=c;
//         return;
//     }
// }


// Kadane's Algorithm to Find Maximum Subarray sum

// public class array_list{
//     public static void main(String[] args) {
//         int arr[]={-3,5,2,-5,100,-5,4,-2};
//         int max=Integer.MIN_VALUE,curr=0;
//         for(int i=0;i<arr.length;i++){
//             curr=curr+arr[i];
//             if(curr>max){
//                 max=curr;
//             }
//             if(curr<0){
//                 curr=0;
//             }
//         }
//         System.out.println(max);
//     }
// }





