import java.nio.channels.ScatteringByteChannel;
import java.util.*;
import java.util.Arrays;

// public class OneDarr{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.print("Enter the size of array=");
//         int n=in.nextInt();
//         int[] arr=new int[n];
//         System.out.println("Enter the array elements:");
//         for(int i=0;i<n;i++){
//             arr[i]=in.nextInt();
//         }
//         // copying arr elements in arr_2 (SHALLOW COPY METHOD)
//         // int arr_2[]=arr; 
//         // copying arr elements in arr_3(deep copy)
//         int arr_3[]=arr.clone();
//         // changing 0 index value of arr_3 don't change the value of arr at 0 index
//         arr_3[0]=47;
//         // changing arr 0 index value using arr_2   
//         // arr_2[0]=0;
//         System.out.println(Arrays.toString(arr));
//         System.out.println(Arrays.toString(arr_3));
//         // System.out.println(Arrays.toString(arr_2));

//         // COPYING ARRAY ELEMENTS USING ARRAY METHOD WHICH ALSO DONT'T CHANGE ORIGINAL ARRAY VALUE
//         // Arrays.copyOf(arr_name, till which length)
//         int[] arr1=Arrays.copyOf(arr, arr.length);
//         System.out.println(Arrays.toString(arr1));

//         // Arrays.copyOfRange(arr_name,start index, last index)

//         int [] arr2=Arrays.copyOfRange(arr, 2, arr.length);
//         System.out.println(Arrays.toString(arr2));
//     }
// }




// CHECK IF THE GIVEN ARRAY IS SORTED OR NOT



// public class OneDarr{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.print("Enter the size of array=");
//         int n=in.nextInt();
//         int[] arr=new int[n];
//         int c=0;
//         System.out.println("Enter the array elements:");
//         for(int i=0;i<n;i++){
//             arr[i]=in.nextInt();
//         }
//         for(int i=0;i<n-1;i++){
//             if(arr[i+1]<=arr[i]){
//                 c++;
//             }
//         }
//         if(c>0){
//             System.out.println("Arrays is not sorted");
//         }
//         if(c==0){
//             System.out.println("Arrays is sorted");
//         }
//     }
// }



//  FIND THE TOTAL NUMBER OF PAIRS WHOSE SUM IS EQUAL TO X

// public class OneDarr{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.print("Enter the size of array=");
//         int n=in.nextInt();
//         System.out.print("Enter the value of target value=");
//         int x=in.nextInt();
//         int[] arr=new int[n];
//         System.out.println("Enter the arrays elements:");
//         for(int i=0;i<n;i++){
//             arr[i]=in.nextInt();
//         }
//         for(int i=0;i<n;i++){
//             for(int j=i+1;j<n;j++){
//                 if(arr[i]+arr[j]==x){
//                     System.out.println("pair:"+arr[i]+" "+arr[j]);
//                 }
//             }
//         }
//     }
// }




// FIND THE TRIPLET WHOSE SUM IS EQUAL TO TARGET



// public class OneDarr{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.print("Enter the size of array=");
//         int n=in.nextInt();
//         System.out.print("Enter the value of target=");
//         int x=in.nextInt();
//         int[] arr=new int[n];
//         System.out.println("Enter the arrays elements:");
//         for(int i=0;i<n;i++){
//             arr[i]=in.nextInt();
//         }
//         for(int i=0;i<n;i++){
//             for(int j=i+1;j<n;j++){
//                 for(int k=j+1;k<n;k++){
//                     if(arr[i]+arr[j]+arr[k]==x){
//                         System.out.println("Triple:"+arr[i]+" "+arr[j]+" "+arr[k]);
//                     }
//                 }
//             }
//         }
//     }
// }




// RETURN THE VALUE WHOSE REPETION IS ONCE AND OTHER IS TWICE



// public class OneDarr{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.print("Enter the size of array=");
//         int n=in.nextInt();
//         int[] arr=new int[n];
//         System.out.println("Enter the arrays elements:");
//         for(int i=0;i<n;i++){
//             arr[i]=in.nextInt();
//         }
//         for(int i=0;i<n;i++){
//             for(int j=i+1;j<n;j++){
//                 if(arr[i]==arr[j]){
//                     arr[i]=arr[j]=-1;
//                 }
//             }
//         }
//         for(int i=0;i<n;i++){
//             if(arr[i]!=-1){
//                 System.out.println("Unique element is="+arr[i]);
//             }
//         }
//     }
// }



// RETURN THE FIRST ELEMENTS WHICH REPEPAT IN GIVEN ARRAY


// public class OneDarr{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.print("Enter the size of array=");
//         int n=in.nextInt();
//         int[] arr=new int[n];
//         System.out.println("Enter the arrays elements:");
//         for(int i=0;i<n;i++){
//             arr[i]=in.nextInt();
//         }
//         for(int i=0;i<n;i++){
//             for(int j=i+1;j<n;j++){
//                 if(arr[i]==arr[j]){
//                     System.out.println(arr[i]);
//                 }
//             }
//             break;
//         }
//     }
// }




// REVERSE THE ARRAY


// public class OneDarr{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.print("Enter the size of array=");
//         int n=in.nextInt();
//         System.out.println("Enter the array elements:");
//         int[] arr=new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=in.nextInt();
//         }
//         int[] ans=reverse(arr,n);
//         System.out.println(Arrays.toString(ans));
//     }
//     static int[] reverse(int[] arr,int n){
//         int j=0;
//         int[] arr1=new int[n];
//         for(int i=n-1;i>=0;i--){
//             arr1[j]=arr[i];
//             j++;
//         }
//         return arr1;
//     }
// }




// ARRAY REVERSE


// public class OneDarr{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.print("Enter the size of array=");
//         int n=in.nextInt();
//         int[] arr=new int[n];
//         System.out.println("Enter the elements of array:");
//         for(int i=0;i<n;i++){
//             arr[i]=in.nextInt();
//         }
//         int[] ans=reverse(arr,n);
//         System.out.println(Arrays.toString(ans));
//     }
//     static int[] reverse(int[] arr,int n){
//         int i=0;
//         int j=n-1;
//         while(i<j){
//             swap(arr,i,j);
//             i++;
//             j--;
//         }
//         return arr;
//     }
//     static void swap(int[] arr,int a,int b){
//         int temp=arr[a];
//         arr[a]=arr[b];
//         arr[b]=temp;
//     }
// }






// ROTATE THE GIVEN ARRAY BY K TIMES



// public class OneDarr{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.print("Enter the size of array=");
//         int n=in.nextInt();
//         System.out.print("Enter the value of k=");
//         int k=in.nextInt();
//         int[] arr=new int[n];
//         System.out.println("Enter the elements of array:");
//         for(int i=0;i<n;i++){
//             arr[i]=in.nextInt();
//         }
//         int[] ans=rotate(arr,n,k);
//         System.out.println("Array after rotation:");
//         System.out.println(Arrays.toString(ans));
//     }
//     static int[] rotate(int[] arr,int n,int k){
//         int[] arr1=new int[n];
//         k=k%n;
//         int j=0;
//         for(int i=n-k;i<n;i++){
//             arr1[j]=arr[i];
//             j++;
//         }
//         for(int i=0;i<n-k;i++){
//             arr1[j]=arr[i];
//             j++;
//         }
//         return arr1;
//     }
// }



// ROTATE THE ARRAY WITHOUT USING ANOTHER ARRAY


// public class OneDarr{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.print("Enter the size of array=");
//         int n=in.nextInt();
//         System.out.print("Enter the value of k=");
//         int k=in.nextInt();
//         int[] arr=new int[n];
//         System.out.println("Enter the elements of array:");
//         for(int i=0;i<n;i++){
//             arr[i]=in.nextInt();
//         }
//         int[] ans=rotate(arr,n,k);
//         System.out.println(Arrays.toString(ans));
//     }
//     static int[] rotate(int[] arr,int n,int k){
//         int i=0;
//         reverse(arr,i,n-k-1);
//         reverse(arr,n-k,n-1);
//         reverse(arr,i,n-1);
//         return arr;
//     }
//     static void reverse(int[] arr,int i,int j){
//         while(i<j){
//             swap(arr,i,j);
//             i++;
//             j--;
//         }
//     }
//     static void swap(int[] arr,int i,int j){
//         int temp=arr[i];
//         arr[i]=arr[j];
//         arr[j]=temp;
//     }
// }



// CHECK IF GIVEN NUMBER IS PRESENT IN ARRAY OR NOT FOR Q QUERY


// public class OneDarr{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.print("Enter the size of array=");
//         int n=in.nextInt();
//         System.out.print("Enter the value of k=");
//         int k=in.nextInt();
//         int[] arr=new int[n];
//         System.out.println("Enter the elements of array:");
//         for(int i=0;i<n;i++){
//             arr[i]=in.nextInt();
//         }
//         int[] f=frequency(arr);
//         while(k-->0){
//             int x=in.nextInt();
//             if(f[x]>0){
//                 System.out.println("YES");
//             }
//             else{
//                 System.out.println("NO");
//             }
//         }
//     }
//     static int frequency(int[] arr){
//         int[] freq=new int[10005];
//         for(int i=0;i<arr.length;i++){
//             freq[arr[i]]++;
//         }
//         return freq;
//     }  
// }



// SORT AN ARRAY OF 0's AND 1's


// public class OneDarr{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.print("Enter the size of array=");
//         int n=in.nextInt();
//         int[] arr=new int[n];
//         System.out.println("Enter the elements of array:");
//         for(int i=0;i<n;i++){
//             arr[i]=in.nextInt();
//         }
//         int c=0;
//         for(int i=0;i<n;i++){
//             if(arr[i]==0){
//                 c++;
//             }
//         }
//         for(int i=0;i<n;i++){
//             if(i<c){
//                 arr[i]=0;
//             }
//             else{
//                 arr[i]=1;
//             }
//         }
//         System.out.println(Arrays.toString(arr));
//     }
// }




// SORT ARRAY OF 0's AND 1'S USING ONE TRAVERSAL



// public class OneDarr{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.print("Enter the size of array=");
//         int n=in.nextInt();
//         int[] arr=new int[n];
//         System.out.println("Enter the elements of array:");
//         for(int i=0;i<n;i++){
//             arr[i]=in.nextInt();
//         }
//         int[] ans=sort(arr);
//         System.out.println(Arrays.toString(ans));
//     }
//     static void swap(int[] arr,int i,int j){
//         int temp=arr[i];
//         arr[i]=arr[j];
//         arr[j]=temp;
//     }
//     static int[] sort(int[] arr){
//         int i=0,j=arr.length-1;
//         while(i<j){
//             if(arr[i]==1 && arr[j]==0){
//                 swap(arr,i,j);
//                 i++;
//                 j--;
//             }
//             if(arr[i]==0){
//                 i++;
//             }
//             if(arr[j]==1){
//                 j--;
//             }
//         }
//         return arr;
//     }
// }



// MOVE ALL EVEN INTEGERS AT THE BIGINING OF THE ARRAY ORDER DOES NOT MATTER


// public class OneDarr{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.print("Enter the size of array=");
//         int n=in.nextInt();
//         int[] arr=new int[n];
//         System.out.println("Enter the elements of array:");
//         for(int i=0;i<n;i++){
//             arr[i]=in.nextInt();
//         }
//         int[] ans=even_begin(arr,n);
//         System.out.println(Arrays.toString(ans));
//     }
//     static int[] even_begin(int[] arr,int n){
//         int i=0,j=n-1;
//         while(i<j){
//             if(arr[i]%2!=0 && arr[j]%2==0){
//                 swap(arr,i,j);
//                 i++;
//                 j--;
//             }
//             if(arr[i]==0){
//                 i++;
//             }
//             if(arr[j]%2!=0){
//                 j--;
//             }
//         }
//         return arr;
//     }
//     static void swap(int[] arr,int i,int j){
//         int temp=arr[i];
//         arr[i]=arr[j];
//         arr[j]=temp;
//     }
// }




// RETURN THE SQUARE OF ARRAY OF GIVEN ARRAY IN NON DECREASING ORDER


// public class OneDarr{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.print("Enter the size of array=");
//         int n=in.nextInt();
//         int[] arr=new int[n];
//         System.out.println("Enter the elements of array:");
//         for(int i=0;i<n;i++){
//             arr[i]=in.nextInt();
//         }
//         int []ans=sol(arr,n);
//         for(int i=0;i<10005;i++){
//             if(ans[i]==1){
//                 System.out.println(i);
//             }
//         }
//     }
//     static int[] sol(int[] arr,int n){
//         int m=Integer.MAX_VALUE;
//         int freq[]=new int[10005];
//         for(int i=0;i<n;i++){
//             freq[arr[i]]++;
//         }
//         return freq;
//     }
// }



// UNIQUE ELEMENT IN A GIVEN ARRAY WHICH DID NOT

// public class OneDarr{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.print("Enter the size of array=");
//         int n=in.nextInt();
//         int[] arr=new int[n];
//         System.out.println("Enter the elements of array:");
//         for(int i=0;i<n;i++){
//             arr[i]=in.nextInt();
//         }
//         for(int i=0;i<n;i++){
//             int c=0;
//             for(int j=0;j<n;j++){
//                 if(arr[i]==arr[j]){
//                     c++;
//                 }
//             }
//             if(c==1){
//                 System.out.println(arr[i]);
//             }
//             else{
//                 continue;
//             }
//         }
//     }
// }


// RETURN THE SQUARE OF ARRAY OF GIVEN ARRAY IN NON DECREASING ORDER(For both Sorted or not)


// public class OneDarr{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.print("Enter the size of array=");
//         int n=in.nextInt();
//         int[] arr=new int[n];
//         System.out.println("Enter the elements of array:");
//         for(int i=0;i<n;i++){
//             arr[i]=in.nextInt();
//         }
//         for(int i=0;i<n;i++){
//             arr[i]*=arr[i];
//         }
//         int [] ans=sol(arr,n);
//         System.out.println(Arrays.toString(ans));
//     }
//     static void swap(int[] arr,int i,int j){
//         int temp=arr[i];
//         arr[i]=arr[j];
//         arr[j]=temp;
//     }
//     static  int[] sol(int[] arr,int n){
//         int i=0,j=n-1;
//         for(j=n-1;j>=0;j--){
//             i=0;
//             while(i<j){
//                 if(arr[i]>arr[j]){
//                     swap(arr,i,j);
//                 }
//                 i++;
//             }
//         }
//         return arr;
//     }
// }



// RETURN THE SQUARE OF ARRAY OF GIVEN ARRAY IN DECREASING ORDER(With One Loop but array sholud be sorted)


// public class OneDarr{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.print("Enter the size of array=");
//         int n=in.nextInt();
//         System.out.println("Enter array elements:");
//         int[] arr=new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=in.nextInt();
//         }
//         int [] ans=sol(arr,n);
//         System.out.println(Arrays.toString(ans));
//     }
//     static int[] sol(int[] arr,int n){
//         int i=0,j=n-1,k=n-1;
//         int a[]=new int[n];
//         while(i<j){
//             if(Math.abs(arr[i])>Math.abs(arr[j])){
//                 a[k]=arr[i]*arr[i];
//                 i++;
//                 k++;
//             }
//             else{
//                 a[k]=arr[j]*arr[j];
//                 k++;
//                 j--;
//             }
//         }
//         return a;
//     }
// }




// PREFIX SUM IN SAME ARRAY


// public class OneDarr{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.println("Enter the size of array:");
//         int n=in.nextInt();
//         System.out.println("Enter array elements:");
//         int[] arr=new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=in.nextInt();
//         }
//         int[] ans=prefix_sum(arr,n);
//         System.out.println(Arrays.toString(ans));
//     }
//     static int[] prefix_sum(int[] arr,int n){
//         for(int i=1;i<n;i++){
//             arr[i]=arr[i]+arr[i-1];
//         }
//         return arr;
//     }
// }




// RETURN THE SUM FOR Q QUERY FROM l INDEX TO r INDEX AND l AND r FOLLOW 0 BASED INDEXING


// public class OneDarr{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.println("Enter the size of array:");
//         int n=in.nextInt();
//         System.out.println("Enter array elements:");
//         int[] arr=new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=in.nextInt();
//         }
//         System.out.print("Enter the number of query=");
//         int q=in.nextInt();
//         while(q-->0){
//             System.out.print("Enter the value of l=");
//             int l=in.nextInt();
//             System.out.print("Enter the value of r=");
//             int r=in.nextInt();
//             int ans=sum(arr,n,l,r);
//             System.out.println(ans);
//         }
//     }
//     static int sum(int[] arr,int n,int l, int r){
//         int s=0;
//         for(int i=l-1;i<r;i++){
//             s+=arr[i];
//         }
//         return s;
//     }
// }



// RETURN THE SUM FOR Q QUERY FROM l INDEX TO r INDEX AND l AND r FOLLOW 1 BASED INDEXING(USING PREFIX SUM METHOD)


// public class OneDarr{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.println("Enter the size of array:");
//         int n=in.nextInt();
//         System.out.println("Enter array elements:");
//         int[] arr=new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=in.nextInt();
//         }
//         System.out.print("Enter number of query=");
//         int q=in.nextInt();
//         while(q-->0){
//             System.out.print("Enter the value of l=");
//             int l=in.nextInt();
//             System.out.print("Enter the value of r=");
//             int r=in.nextInt();
//             int ans=sum(arr,n,l,r);
//             System.out.println(ans);
//         }
//     }
//     static int[] prefix_sum(int[] arr,int n,int l,int r){
//         for(int i=1;i<n;i++){
//             arr[i]=arr[i]+arr[i-1];
//         }
//         return arr;
//     }
//     static int sum(int[] arr,int n,int l,int r){
//         prefix_sum(arr,n,l,r);
//         l=l%n;
//         r=r%n;
//         if(l>1){
//         return arr[r-1]-arr[l-2];
//         }
//         return arr[r-1];
//     }
// }




// CAN WE DO PARTITION OF ARRAY IN TWO SUBARRAY WITH EQUAL SUM(USING PREFIX AND SUFFIX SUM METHOD)


// public class OneDarr{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.print("Enter the size of array=");
//         int n=in.nextInt();
//         int[] arr={1,7,3,6,5,6};
//         System.out.println("Enter array elements:");
//         for(int i=0;i<n;i++){
//             arr[i]=in.nextInt();
//         }
//         int n=arr.length;
//         int s1=0,s2=0,k=0;
//         int[] arr1=new int[n];
//         int[] arr2=new int[n];
//         for(int i=0;i<n;i++){
//             s1+=arr[i];
//             s2+=arr[n-i-1];
//             arr1[i]=s1;
//             arr2[n-i-1]=s2;
//         }
//         for(int i=0;i<n-1;i++){
//             if(arr1[i]==arr2[i+1]){
//                 k+=i;
//                 break;
//             }
//         }
//         System.out.println("The Two Subarays are:");
//         for(int i=0;i<=k;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//         for(int i=k+1;i<n;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }


// Inverse of an Array


// public class OneDarr{
//     public static void main(String[] args) {
        
//     }
// }




public class OneDarr{
    public static void main(String[] args) {
        String s=" a good example ";
        
    }
    
}