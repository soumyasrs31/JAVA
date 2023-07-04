import java.util.*;
//push element at bottom at the stack
public class PushAtBottomAtStack {
    public static void stack(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        stack(s,data);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        stack(s,4);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }

    }
}
