import java.util.*;
public class ReverseStack {
    public static void pushAtBottom(Stack<Integer> s, int key){
        if(s.isEmpty()){
            s.push(key);
            return;
        }
        int top = s.pop();
        pushAtBottom(s,key);
        s.push(top);
    }
    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s,top);
    }
    public static void print(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        reverseStack(s);
        print(s);


    }
}
