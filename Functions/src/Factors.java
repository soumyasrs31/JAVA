import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
        int num = 10;
        ArrayList<Integer> ll = new ArrayList<>();
        for(int i=1; i<=num; i++){
            if(num % i == 0){
                ll.add(i);
            }
        }
        System.out.println(ll);
    }
}
