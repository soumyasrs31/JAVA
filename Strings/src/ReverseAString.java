import java.util.*;
public class ReverseAString {
    public static void main(String[] args) {
        String str = "i.like.this.program.very.much";
        //output = much
        String arr[] = str.split("\\.");
        String result = "";
        for(int i=arr.length-1; i>=0; i--){
            result += arr[i];
            if(i != 0){
                result += '.';
            }
        }
        System.out.println(result);
    }
}
