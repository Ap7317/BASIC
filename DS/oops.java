import java.util.Scanner;
import java.util.Stack;

public class oops {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s="Atharava";
        StringBuilder str=new StringBuilder();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            st.push(s.charAt(i));
        }
        System.out.println(st);
        while(!st.isEmpty()){
            str.append(st.pop());
        }
        System.out.println(str.toString());
    }
}
