import java.util.*;

import static java.lang.System.*;

public class DataType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);


       /* String s = sc.next();
        String b = sc.nextLine();
        int c = sc.nextInt();
        float zd = sc.nextFloat();
        byte bd = sc.nextByte();
        short sd = sc.nextShort();
        long sl = sc.nextLong();
        double sdd = sc.nextDouble();*/


        // type converision..
        /*int a = 34;
        float bdd = a;*/


        // type casting
        /*int aa = (int) sc.nextLong();
        int f = (int) sc.nextFloat();
        System.out.println(f);*/


        /*char ch = 'a';
        int chValue = ch;
        System.out.println(chValue);*/

        //Type Promotion in Expressions..

        /*char a = 'a';
        char b = 'b';
        System.out.println((int) a);
        System.out.println((float) b);
        System.out.println(b-a);
        System.out.println(a);*/

        //long, float, double are available...

        /*int c = 34;
        float d = 343.3f;
        double e = 333.324;
        byte f = 43;
        double g = c+d+e+f;
        // float f = c+d+e+f;(wrong)
        System.out.println(g);*/

        /*byte b = 4;
        byte a =(byte) (b * 2) ;*/

        ///  Arithmetic operator = unary operator....

        /*int a = 5;
        int b = ++a;
        int c = b++;
        int d = a++;
        int e = --d;
        int f = d--;
        System.out.println(a +" " + b + " "+ c+ " " + d + " "+ e+ " " + f);
*/

        //Ternary Operator

        /*int num = 5;
        String a = (num%2 == 0) ? "even": "odd";
        System.out.println(a);*/

        //calculator....
       /* System.out.println("Give the first Number: ");
        int num1 = sc.nextInt();
        System.out.println("Give the Last Number: ");
        int num2 = sc.nextInt();
        System.out.println("Give any operator from these ('+', '-', '*', '%')");
        String operator = sc.next();
        switch(operator){
            case "+" :
                System.out.println(num1+num2);
                break;
            case "-" :
                System.out.println(num1 - num2);
                break;
            case "*" :
                System.out.println(num1 * num2);
                break;
            case "/" :
                System.out.println(num1/num2);
                break;
            default :
                System.out.println("enter wrong input");
        }
*/
        //Write a Java program to get a number from the user and print whether it is positive or negative.

        /*int num = sc.nextInt();
        if(num>=0){
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }*/

       // IMP Question ...

        /*int a = 63;
        int b = 36;
        boolean x = (a<b) ? true : false;
        int y = (a>b) ? a : b;
        System.out.println(x +" "+ y);*/

        //Write a Java program that takes a year from the user and print whether that year is a leap year or not
        /*int year = sc.nextInt();
        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean z = (year % 400 == 0) && (year % 100 == 0);

        if(x && (y || z)){
            System.out.println(year + " is leap year");
        } else {
            System.out.println(year + " is not a leap year.");
        }*/

        /*int m = 5;
        int n = 5;
        for(int i =1; i<=m; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 1; i<=m; i++){
            for(int j= m; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }*/

        //print reverse of a number..

        /*int num = sc.nextInt();
        while(num > 0){
            int lastDigit = num % 10;
            System.out.print(lastDigit);
            num /= 10;
        }*/

        // reverse of a given number

        /*int rev= 0,num = 44322;
        while(num > 0){
            int lastDigit = num%10;
            rev = (rev * 10) + lastDigit;
            num /= 10;
        }
        System.out.println(rev);*/

        // break statement uses...
        /*int num = 5,i = 0;
        for( ; i<=num; i++){
            if(i == 4){
                break;
            }
            System.out.println(i);
        }*/

        // continue statement uses..
        /*int num = 5, i = 0;
        for(; i<=num; i++){
            if(i==3){
                continue;
            }
            System.out.println(i);
        }*/

        //keep entering numbers till user enter a multiple of 10...

        /*do{
            int n = sc.nextInt();
            if(n%10 == 0){
                break;
            }
            System.out.println(n);
        }while(true);*/

        //display all numbers entered by the user except multiple of 10..

        /*do{
            int n = sc.nextInt();
            if(n % 10 == 0){
                continue;
            }
            System.out.println(n);

        }while(true);*/

        //check a number is prime or not..

       /* int num = sc.nextInt();

        boolean isPrime = true;
        for(int i=2; i<=num-1; i++){
            if(num % i == 0){
                isPrime = false;
            }
        }
        if(isPrime == true){
            System.out.println(num + " is a prime number");

        }else{
            System.out.println(num + " is not a prime number");
        }*/

                            //OR
        /*int num = sc.nextInt();
        boolean isPrime = true;
        for(int i=2; i<=Math.sqrt(num); i++){
            if(num % i == 0){
                isPrime = false;
            }
        }
        if(isPrime == true){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }*/

        // Write a program that reads a set of integers, and then prints the sum of the even and odd integers..

       /* int num, sumEven = 0, sumOdd = 0,i=0, totalNum;
        totalNum = sc.nextInt();
        do{
            num = sc.nextInt();
            if(num % 2 == 0){
                sumEven += num;
            }else{
                sumOdd += num;
            }
            i++;
        }while(i<totalNum);
        System.out.println(sumEven);
        System.out.println(sumOdd);*/

        //Write a program to find the factorialof any number entered by the user.

        /*int factorialNum =1;
        int num = sc.nextInt();
        if(num == 0){
            out.println("factorial is "+ factorialNum);
        }else if(num>0){
            for(int i = 1; i<=num; i++){
               factorialNum = factorialNum * i;
            }
            out.println(factorialNum);
        } else{
            out.println("wrong input");
        }*/

        // pattern...



    }
}
