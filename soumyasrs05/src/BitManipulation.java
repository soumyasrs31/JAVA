
import java.util.Scanner;
public class BitManipulation {
    public static void main(String[] args) {
        /*//Get bit maniplution...
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pos = sc.nextInt();
        int bitMask = 1<<pos;
        if((bitMask & n) == 0){
            System.out.println("bit was zero");
        }else{
            System.out.println("bit was one");
        }*/

        /*//Set bit manipulation...
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int pos = sc.nextInt();
        int bitMask = 1<<pos;
        int newNumber = bitMask | number;
        System.out.println(newNumber);*/

        /*//Clear bit manipulation....
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int pos = sc.nextInt();
        int bitMask = 1<<pos;
        int newBitMask = ~(bitMask);
        int newNumber = newBitMask & number;
        System.out.println(newNumber);*/

        /*// Update bit Manipulation...
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pos = sc.nextInt();
        int oper = sc.nextInt();
        int bitMask = 1<<pos;
        if(oper == 1){
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        }else{
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);
        }*/

        /*//Write a program to find if a number is a power of 2 or not.

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pos = 0;
        int bitMask = 1<<pos;
        int newBitMask = ~(bitMask);
        int newNumber = newBitMask & n;
        if (newNumber == n){
            System.out.println("number is power of two");
        }else{
            System.out.println("number is not power of two");
        }*/

        /*//Write a program to toggle a bit a position = “pos” in a number “n”

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pos = sc.nextInt();
        int bitMask = 1<<pos;
        int newNumber = bitMask & n;
        if (newNumber == 0){
            System.out.println("bit was 0");
        }else{
            System.out.println("bit was 1");
        }*/

    }

}
