import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class FindDistinctOrNot {
    public static void main(String[] args) {
        HashMap<Integer,Integer> set = new HashMap<>();

        Scanner sc = new Scanner(System.in);
        boolean check = false;
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            int num = sc.nextInt();
            if(set.containsKey(num)){
                set.put(num,set.get(num)+1);
                check = true;
                break;
            }else{
                set.put(num,1);
            }
        }
        if(check){
            System.out.println("True");
        }else{
            System.out.println("false");
        }

    }
}
