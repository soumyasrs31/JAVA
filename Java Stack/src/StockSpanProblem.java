import java.util.*;
public class StockSpanProblem {
    public static void stockProblem(int stock[], int span[]){
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);
        for(int i=1; i<stock.length; i++){
            while(!s.isEmpty() && stock[i] > stock[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                span[i] = i+1;
            }else{
                int highest_idx = s.peek();
                span[i] = i - highest_idx;

            }
            s.push(i);
        }
    }
    public static void main(String[] args) {
        int stock[]  = {100,80,60,70,60,85,100};
        int span[] = new int[stock.length];
        stockProblem(stock,span);
        for(int i=0; i<stock.length; i++){
            System.out.print(span[i] + " ");
        }
    }
}
