import java.util.*;
public class BinaryToDecimal {
    public static void main(String[] args) {
        int num = 1001;
        int decimalNum = 0;
        int i=0;
        while(num  != 0){
            int rem = num%10;
            decimalNum += rem * Math.pow(2,i);
            num = num/10;
            i++;
        }
        System.out.println(decimalNum);
    }
}
