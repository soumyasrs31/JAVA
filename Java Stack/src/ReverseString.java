import java.util.*;
public class ReverseString {
    // Reverse a string using stack
    public static String reverseString(String str){
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while(idx < str.length()){
            char ch = str.charAt(idx);
            s.push(ch);
            idx++;
        }
        StringBuilder sb = new StringBuilder("");
        while(!s.isEmpty()){
            char ch = s.pop();
            sb.append(ch);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "hello";
        System.out.println(reverseString(str));
    }
}
