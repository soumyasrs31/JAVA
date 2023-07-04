import java.util.*;
public class Functions {
    /*public static int calculateSum(int num1, int num2){

        int sum = num1 + num2;
        return sum;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculateSum(a,b);
        System.out.println(sum);
    }*/

    //Java always Call By Value example (swapping)....

    /*public static void swaps(int num1, int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        swaps(a,b);
        System.out.println("a is "+ a);
        System.out.println("b is "+ b);
    }*/

    // product of a & b...

    /*public static int calculateProduct(int num1, int num2){
        int product = num1 * num2;
        return product;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int product = calculateProduct(a,b);
        System.out.println(product);
        System.out.println(calculateProduct(5,5));
    }*/

    // Binomial coefficient....

    /*public static int factorialNum(int num){
        int factorial = 1;
            for(int i=1; i<=num; i++){
                factorial *= i;
        }
        return factorial;
    }
    public static int binomialCoef(int n, int r){
        int fact_n = factorialNum(n);
        int fact_r = factorialNum(r);
        int fact_nr = factorialNum(n-r);
        int finalValue = (fact_n) /(fact_r*fact_nr);
        return finalValue;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int finalValue=binomialCoef(n,r);
        System.out.println(finalValue);
    }*/

    // Function Overloading using parameter....(it is only depends on numbers of parameter not on return type..)
    /*public static int sum(int a, int b){
        return a+b;
    }
    public static int sum(int a, int b, int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        System.out.println(sum(5,5,5));
        System.out.println(sum(5,5));
    }*/

    // Function overloading using Data Types....(it is depends on data types of parameters)

    /*public static int sum(int a, int b){
        return a+b;
    }
    public static float sum(float a, float b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(sum(5,3));
        System.out.println(sum(4.8f,3.2f));
    }*/

    //check prime or not...

    /*public static boolean isPrime(int n){
        if(n == 2){
            return true;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPrime(2));
    }*/

    // print all primes in a Range..
    /*public static boolean isPrime(int n){
        if(n == 2){
            return true;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void printPrime(int num){
        for(int i = 2; i<=num; i++){
            if(isPrime(i)){
                System.out.println("Prime is "+ i);
            }
        }

    }
    public static void main(String[] args) {
        printPrime(10);
    }*/

    
}
