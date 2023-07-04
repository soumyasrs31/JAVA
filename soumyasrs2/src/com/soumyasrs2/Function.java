package com.soumyasrs2;
import java.util.*;
public class Function {

    //print my name....

    /*public static void printMyName(String name){
        System.out.println(name);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        printMyName(name);

    }*/


    //print calculate product....

    /*public static int calculateProduct(int a, int b){
        int product = a*b;
        return a*b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int product = calculateProduct(a, b);
        System.out.println(product);
    }*/



    /*//calculate sum....

    public static int calculateSum(int a, int b){
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(calculateSum(a, b));
    }*/

    /*// Factorial Number....

    public static void calculateFactorial(int n){
        if(n<0){
            System.out.println("invalid Number");
            return;
        }
        int factorial = 1;
        for(int i=n; i>=1; i--){
            factorial = factorial * i;
        }System.out.println(factorial);
        return;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        calculateFactorial(n);

    }*/
    
    //Check Even...

    /*public static void checkEven(int n){
        if(n % 2 == 0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        checkEven(n);

    }*/

    /*//Table of Number...

    public static void printNumberTable(int n){
        for(int i=1; i<=10; i++){
            System.out.println(i+" "+'*'+" "+n+'='+" "+i*n);
        }return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNumberTable(n);
    }*/

    /*//Check Prime Number...

    public static void checkPrime(int n){
        if(n == 1){
            System.out.println("not Prime");
        }
        else if(n == 2){
            System.out.println("Prime");
        }
        else if(n % 2 == 0 || n % 3 == 0 || n % 5 == 0 || n % 7 == 0 || n % 11 == 0){
            System.out.println("not Prime");
        }else{
            System.out.println("Prime");
        }return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        checkPrime(n);

    }*/

    /*//Enter 3 numbers from the user & make a function to print their average

    public static int calculateAverage(int a, int b, int c){
        int avg = (a + b + c) / 3;
        System.out.println(avg);
        return avg;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        calculateAverage(a, b, c);
    }*/

    /*//Write a function to print the sum of all odd numbers from 1 to n

    public static int calculateOddSum(int n){
        int sum = 0;

        if(n % 2 == 0){
            for(int i=1; i<n; i = i+2) {
                sum = i + sum;


            }System.out.println(sum);

            }else {
            for(int i=1; i<=n; i=i+2){
                sum = i + sum;

            }System.out.println(sum);
        }return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        calculateOddSum(n);
    }*/

    /*//Write a function which takes in 2 numbers and returns the greater of those two

    public static void findGreater(int a, int b){
        if(a >= b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        findGreater(a, b);
    }*/

    /*//Write a function that takes in the radius as input and returns the circumference of a circle

    public static double calculateCircumference(double r){
        double circumference = 2 * 3.14 * r;
        System.out.println(circumference);
        return circumference;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        calculateCircumference(r);
    }*/

    /*//Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote

    public static void eligibleForVote(int x){
        if(x > 18){
            System.out.println("eligible for vote");
        }else{
            System.out.println("not eligible for vote");
        }return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        eligibleForVote(x);
    }*/

    /*//Write an infinite loop using do while condition

    public static void infiniteLoop(int n){
        do{
            System.out.println(n);
            n++;
        }while(n>1);
        return;
    }

    public static void main(String[] args) {
        int n = 1;
        infiniteLoop(n);

    }*/

    



    

