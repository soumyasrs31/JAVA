package com.pratice;
import java.util.*;
import java.util.*;

//Addition : a + b

/*
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 1st Number : ");
        int a = s.nextInt();
        System.out.println("Enter 2nd Number : ");
        int b = s.nextInt();
        int add = a + b;
        System.out.println(add);
//        if(button == 1){
//            System.out.println("Hello");
//        }
//            else if (button == 2){
//            System.out.println("Namaste");
//        }
//            else if (button == 3){
//            System.out.println("Bounsure");
//        }
//            else{
//            System.out.println("none");
//        }
*/
/*public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        switch(button){
            case 1 : System.out.println("Hello");
            break;
            case 2 :
                System.out.println("Namaste");
                break;
            case 3 :
                System.out.println("Bounjare");
                break;
            default :
                System.out.println("Invalid Button");
        }

    }
}*/


/*
        switch(n){
            case 1 :
                System.out.println("January");
                break;
            case 2 :
                System.out.println("February");
                break;
            case 3 :
                System.out.println("March");
                break;
            case 4 :
                System.out.println("April");
                break;
            case 5 :
                System.out.println("May");
                break;
            case 6 :
                System.out.println("june");
                break;
            case 7 :
                System.out.println("july");
                break;
            case 8 :
                System.out.println("August");
                break;
            case 9 :
                System.out.println("september");
                break;
            case 10 :
                System.out.println("October");
                break;
            case 11 :
                System.out.println("November");
                break;
            case 12 :
                System.out.println("December");
        }
*//*

    }
}
*/



/*//Substration : a - b

import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 1st Number : ");
        int a = s.nextInt();
        System.out.println("Enter 2nd Number : ");
        int b = s.nextInt();
        int sub = a - b;
        System.out.println(sub);
    }

}*/

/*//Multiplication : a * b

import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 1st Number : ");
        int a = s.nextInt();
        System.out.println("Enter 2nd Number : ");
        int b = s.nextInt();
        int multi = a * b;
        System.out.println(multi);
    }

}*/

/*//Division : a / b

import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 1st Number : ");
        int a = s.nextInt();
        System.out.println("Enter 2nd Number : ");
        int b = s.nextInt();
        int division = a / b;
        System.out.println(division);
    }

}*/

//module : a % b

/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 1st Number : ");
        int a = s.nextInt();
        System.out.println("Enter 2nd Number : ");
        int b = s.nextInt();
        int module = a % b;
        System.out.println(module);
    }
 }
*/

/*public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first Number:");
        int num1 = sc.nextInt();
        System.out.print("Enter Second Number:");
        int num2 = sc.nextInt();
        System.out.print("Enter an operator (+, -, *, /, %): ");
        char operator = sc.next().charAt(0);
        sc.close();
        int output;
        switch(operator) {
            case '+':
                output = num1 + num2;
                break;
            case '-':
                output = num1 - num2;
                break;
            case '*':
                output = num1 * num2;
                break;
            case '/':
                output = num1 / num2;
                break;
            case '%':
                output = num1 % num2;
                break;
            default:
                System.out.print("You have entered wrong operator");
                return;

    }
        System.out.println(num1+" "+operator+" "+num2+" : "+output);
}
}*/

/*public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        char operator = sc.next().charAt(0);
        sc.close();
        int output;
        switch(operator){
            case '+' : output = num1 + num2;
            break;
            case '-' : output = num1 - num2;
            break;
            case '/' : output = num1 / num2;
            break;
            case '*' : output = num1 * num2;
            break;
            case '%' : output = num1 % num2;
            break;
            default :
                System.out.println("Wrong input");
return;
        }
        System.out.println(num1+" "+ operator+" "+num2+" "+" = "+ output);

    }
}*/

/*public class Main{
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        num1 = sc.nextInt();
        System.out.print("Enter second number:");
        num2 = sc.nextInt();
        System.out.print("Enter an operator (+, -, *, /, %) :");
        char operator = sc.next().charAt(0);
        sc.close();
        int output;
        if(operator == '+') {
            output = num1 + num2;
            System.out.print(num1+" "+operator+" "+num2+" : "+output);
        }
        else
            if (operator == '-') {
                output = num1 - num2;
                System.out.print(num1+" "+operator+" "+num2+" : "+output);
            }

        else if(operator == '*') {
                output = num1 * num2;
                System.out.print(num1+" "+operator+" "+num2+" : "+output);
            }else if(operator == '/'){
            output = num1 / num2;
                System.out.print(num1+" "+operator+" "+num2+" : "+output);
            }
        else if(operator == '%'){
            output = num1 % num2;
                System.out.print(num1+" "+operator+" "+num2+" : "+output);
            }
        else {
                System.out.println("You have entered wrong operator....");
            }



    }
}*/

/*public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        char operator = sc.next().charAt(0);
        sc.close();
        int output;
        if(operator == '+'){
            output = num1 + num2;
            System.out.println(output);
        }else if(operator == '-'){
            output = num1 - num2;
            System.out.println(output);

        }else if(operator == '*'){
            output = num1 * num2;
            System.out.println(output);

        }else if(operator == '%'){
            output = num1 % num2;
            System.out.println(output);

        }else if(operator == '/'){
            output = num1 /num2;
            System.out.println(output);
        }else{
            System.out.println("Wrong Input");
        }

    }
}*/

/*
public class Main{
    public static void main(String[] args) {
        int i, n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        */
/*for(i=0; i<n; i++){
            System.out.println("Hello World");
        }*//*


        */
/*for(i=0; i<n; i++){
            System.out.println(i);
        }*//*


        */
/*for(i=0; i<n; i++){
            System.out.print(i+", ");
        }*//*

    }
}
*/

/*public class Main{
    public static void main(String[] args) {
        int i, n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.close();
        i = 0;
        while(i<n){
            System.out.println(i);
           i++;
        }
    }
}*/

/*public class Main{
    public static void main(String[] args) {
        int i=0, num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        while(i<num){
            System.out.println(i);
            i++;
        }


    }
}*/

/*
public class Main{
    public static void main(String[] args) {
        int i=1, num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        do{
            System.out.println(i);
            i++;
        }while(i<=num);
    }
}
*/



/*public class Main{
    public static void main(String[] args) {
        int i, n;
        i = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.close();
        do{
            System.out.println(i);
            i++;
        } while(i<n);
    }
}*/

/*public class Main{
    public static void main(String[] args) {
        int i,n,sum,multi;
//        sum = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.close();
        *//*for(i=1; i<=n; i++){
            sum = sum + i;
        }
        System.out.println(sum);*//*

        for(i=1; i<=10; i++){
            multi = n * i;
            System.out.println(n+" "+'*'+" "+i+" :"+multi);
        }



    }
}*/



// solid rectangle....

/*public class Main{
    public static void main(String[] args) {
        int m, n, i, j;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        m = sc.nextInt();
        System.out.print("Enter number of coloums: ");
        n = sc.nextInt();
        for(i=1; i<=m; i++){
            for(j=1; j<=n; j++){
                System.out.print("* ");
            } System.out.println();
        }

    }
}*/


/*public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print('*');

            }
            System.out.println();
        }
    }
}*/


//public class Main{
   // public static void main(String[] args){
        /*//Hollow Rectangle...
        int n, m;
        n = 4;
        m = 5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(i==1 || i==n || j==1 || j==m){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }*/


public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int lcm=1, big;
        if(num1<num2){
            big = num2;
    }
      else{
          big = num1;
        }
      if(num1!=num2) {
      for(int i = big; i<=num1*num2; i++) {
          if (i % num1 == 0 && i % num2 == 0) {
              lcm = i;
          }
      }
        }
      else{
          lcm=num1;
      }
      System.out.println(lcm);



// Hollow rectangle..

        /*for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                if(i==1 || i==m || j==1 || j==n){
                    System.out.print(" "+"*");
                }else{
                    System.out.print("  ");
                }

            }System.out.println();
        }*/

        /*for(int i=1; i<=m; i++){

            for(int j=1; j<=n; j++){
                if(i==1 || i==m || j==1 || j==n){
                    System.out.print(" "+'1');
                } else{
                    System.out.print(" "+'0');
                }
            }
            System.out.println();
        }*/
/*// 1 & 0 Rectangle..

        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                if(i==1 || i==m || j==1 || j==n){
                    int position = i+j;
                    if(position%2 == 0){
                        System.out.print("1");

                    }else{
                        System.out.print("0");
                    }
                }else{
                    System.out.print(" ");
                }



            }System.out.println();
        }*/

        /*//hollow half inverted pyramid with 0-1...
        int n=6;
        for(int i=m; i>=1; i--){
            for(int j=1; j<=i; j++){
               if(i==1 || i==j || j==1 || i==m){
                   int number =i+j;
                   if(number%2==0){
                       System.out.print("1");

                   }else{
                       System.out.print("0");
                   }
               }else{
                   System.out.print(" ");
               }
            }
            System.out.println();
        }*/

 /*//Butterfly ...

        int n = 4;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            } int spaces = (n-i) * 2;
            for(int j=1; j<=spaces; j++) {
                System.out.print(" ");
            } for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }int spaces = (n-i)*2;
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }for(int j=1; j<=i; j++){
                System.out.print("*");
            }System.out.println();
        }*/








        /*0-1 Diamod
for(int i=1; i<=m; i++){
    for(int j=1; j<=m-i; j++){
        System.out.print(" ");

    }for(int j=1; j<=2*i-1; j++){
        int number = i+j;
        if(number%2 == 0){
            System.out.print("1");

        }else{
            System.out.print("0");
        }
    }
    System.out.println();
} for(int i=m; i>=1; i--){
    for(int j=1; j<=m-i; j++){
        System.out.print(" ");

    }for(int j=1; j<=2*i-1; j++){
        int number = i+j;
                if(number % 2 == 0){
                    System.out.print("1");

                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }*/







    }
}
        /*//half pyramid....

        int n = 4;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }*/

        /*//inverted half pyramid...

        int n = 4;
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

        /*//inverted half pyramid (roated by 180 degree)....

        int n = 4;
        for(int i=1; i<=n; i++){
            //space = n-i..
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

        /*//Half pyramid with number..

        int n = 5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }*/

        /*//inverted half pyramid with number...

        int n = 5;
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }*/

        /*//floyd's Triangle..
        int n = 5;
        int number = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }*/

        /*//0-1 Triangle...

        int n = 5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                int number = i+j;
                if(number % 2 == 0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }

            }
            System.out.println();
        }*/

        /*//inverted 1-0 Triangle..

        int n = 5;
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                int number = i+j;
                if(number % 2 == 0){
                    System.out.print("0 ");
                }else{
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }*/

        /*//Butterfly ...

        int n = 4;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            } int spaces = (n-i) * 2;
            for(int j=1; j<=spaces; j++) {
                System.out.print(" ");
            } for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }int spaces = (n-i)*2;
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }for(int j=1; j<=i; j++){
                System.out.print("*");
            }System.out.println();
        }*/

        /*//solid rohmbus..

        int n = 5;
        for(int i=1; i<=n; i++){
            int spaces = (n-i);
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

        /*//number pyramid..

        int n = 5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }for(int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }*/

        /*//palindromic number pyramid...

        int n = 5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }for(int j=i; j>=1; j--){
                System.out.print(j);
            }for(int j=2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }*/

        /*//Diamond Pattern..

        int n = 4;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }for(int i=n; i>=1; i--){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }*/


        /*//hollow rohmbus..
        int n=5;
        int m=9;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }for(int j=1; j<=m; j++){
                if(i==1 || i==n || j==1 || j==m){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }*/

        /*// half number pyramid..

        int n = 5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }for(int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }*/

        /*//inverted number pyramid...
        int n=4;
        int number = 1;
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(number);
            }number++;
            System.out.println();
        }*/


  //  }
//}

// Number Pattern...

/*public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();

        //Number Pattern 1

        /*for(int i=1; i<=m; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }*/

       /*// Number Pattern 2
        for(int i=1; i<=m; i++){
            for(int j=m; j>=i; j--){
                System.out.print(j);
            }
            System.out.println();
        }*/

        /*// Number Pattern 3
        for(int i=0; i<m; i++){
            for(int j=1; j<=m-i; j++){
                System.out.print(j);

            }
            System.out.println();
        }*/

        /*//Number Pattern 4
        for(int i=1; i<=m; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);

            }
            System.out.println();
        }
        for(int i=1; i<m; i++){
            for(int j=1; j<=m-i; j++){
                System.out.print(j);

            }
            System.out.println();
        }*/

      /*  //Number Pattern 5
        for(int i=0; i<m; i++){
            for(int j=1; j<=m-i; j++){
                System.out.print(j);
            }
            System.out.println();
        }for(int i=1; i<m; i++){
            for(int j=1; j<=(i+1); j++){
                System.out.print(j);
            }
            System.out.println();
        }*/

        /*//Number Pattern 6

            for (int i = 1; i <= m; i++) {
                for (int j = 1; j <= i; j++){
                    System.out.print(i);
                }
                System.out.println();
            }*/

       /* // Number Pattern 7

        int r=1;
        for(int i=1; i<=m; i++){
            for(int j=1; j<=i; j++){
                if(r == 10){
                    r=0;

                }System.out.print(r++);
            }
            System.out.println();
        }*/

        /*//Number Pattern 8

        for(int i=1; i<=m; i++){
            for(int j=m; j>=i; j--){
                if(i%2 == 0){
                    System.out.print('0');
                }else{
                    System.out.print('1');
                }
            }
            System.out.println();
        }*/

       /* //Number Pattern 9
        for(int i=1; i<=m; i++){
            int j=m-i;
            while(j>0){
                System.out.print("  ");
                j--;
            } j=1;
            while(j<=i){
                System.out.print(" "+j);
                j++;
            } j=i-1;
            while(j>0){
                System.out.print(" "+j);
                j--;
            } j=m-i;
            while(j>0){
                System.out.print("  ");
                j--;
            }
            System.out.println();
        }*/

        /*//Number Pattern 10

        for(int i=1; i<=m; i++){
            int j=1;
            while(j<=i){
                System.out.print(j);
                j++;
            } j=i-1;
            while(j>0){
                System.out.print(j);
                j--;
            }
            System.out.println();
        }*/


/*// Star Pattern...
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();

        Star Pattern 1

        for(int i=1; i<=m; i++){
            for(int j=m; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
for(int i=1; i<=m; i++){
    for(int j=1; j<=i; j++){
        System.out.print("*");
    }
    System.out.println();
}*//*

        Star Pattern 2..
        for(int i=1; i<=m; i++){
            int j=1;
            while(j<=i){
                System.out.print("*");
                j++;
            } j=m-i;
            while(j>0){
                System.out.print(" ");
                j--;
            } j=m-i;
            while(j>0){
                System.out.print(" ");
                j--;
            } j=1;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
        }*//*

        Star Pattern 3
        for(int i=1; i<=m; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1; i<=m; i++){
            for(int j=m; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }*//*


    }
}*/

//public class Main{
  //  public static void main(String[] args) {
     //   Scanner sc = new Scanner (System.in);
     //   int m = sc.nextInt();
     /*   // Floyd Triangle
        int r=1;
        for(int i=1; i<=m; i++){
            for(int j=1; j<=i; j++){
                System.out.print(" "+r++);
            }
            System.out.println();
        }*/

       /*// Triangle Pattern..

        for(int i=1; i<=m; i++){
            int j=m-i;
            while(j>0){
                System.out.print("  ");
                j--;
            } j=1;
            while(j<=i){
                System.out.print(" *");
                j++;
            } j=i-1;
            while(j>0){
                System.out.print(" *");
                j--;
            } j=m-i;
            while(j>0){
                System.out.print("  ");
                j--;
            }
            System.out.println();
        }*/

        /*//Pyramid of Number..

        for(int i=1; i<=m; i++){

            int j=m-i;
            while(j>0){
                System.out.print("  ");
                j--;
            } j=1;
            while(j<=i){
                System.out.print(" "+ i);
                j++;
            } j=i-1;
            while(j>0){
                System.out.print(" " + i);
                j--;
            } j=m-i;
            while(j>0){
                System.out.print("  ");
                j--;
            }
            System.out.println();
        }*/

/*// Binary Pattern
        int count =1;
        for(int i=1; i<=m; i++){
            if(i%2 == 0){
                count=0;
            } else{
                count=1;
            }
            for(int j=1; j<=i; j++){
                System.out.print(count++ % 2);

            }
            System.out.println();
        }*/

        /*//Alphabet Pattern 1..
        char ch = 'A';
        for(int i=1; i<=m; i++){
            for(int j=1; j<=i; j++){
                System.out.print(ch++);
            }
            System.out.println();
        }*/

        /*//Alphabet Pattern 2...
        char ch='A';
        for(int i=1; i<=m; i++){
            for(int j=1; j<=i; j++){
                System.out.print(ch);
            }
            System.out.println();
            ch++;
        }*/

        /*//Star Diamond

        for(int i=1; i<=m; i++){
            int j=m-i;
            while(j>0){
                System.out.print(" ");
                j--;
            } j=1;
            while(j<=i){
                System.out.print("*");
                j++;
            } j=i-1;
            while(j>0){
                System.out.print("*");
                j--;
            } j=m-i;
            while(j>0){
                System.out.print(" ");
                j--;
            }
            System.out.println();
        }

        for(int i=1; i<m; i++){
            int j=i;
            while(j>0){
                System.out.print(" ");
                j--;
            } j=m-1;
            while(j>=i){
                System.out.print("*");
                j--;
            } j=m-i-1;
            while(j>0){
                System.out.print("*");
                j--;
            } j=m-i;
            while(j>0){
                System.out.print(" ");
                j--;
            }
            System.out.println();

        }*/

        /*//Square Kite Pattern..
        char space = ' ';
        for(int i=1; i<=m; i++){
            int j=m-i;
            while(j>0){
                System.out.print("  ");
                j--;
            } j=1;
            System.out.print(" "+i);
                j++;
             j=i-1;
            while(j>0){
                System.out.print("  ");
                j--;
            } j=i-2;
            while(j>0){
                System.out.print("  ");
                j--;
            } j=i-1;
            while(j>0){
                System.out.print(" "+i);
                break;
            }
            System.out.println();

        } for(int i=1; i<m; i++){
            int j=i;
            while(j>0){
                System.out.print("  ");
                j--;
            } j=m-i;
            while(j>0){
                System.out.print(" "+j);
                break;
            } j=m-i-1;
            while(j>0){
                System.out.print("  ");
                j--;
            } j=m-i-2;
            while(j>0){
                System.out.print("  ");
                j--;
            }  j=m-i;
            while(j>1){
                System.out.print(" "+j);
                break;
            }
            System.out.println();
        }*/

        /*//Pyramid of Number..

        for(int i=1; i<=m; i++){
            int j=m-i;
            while(j>0){
                System.out.print("  ");
                j--;
            } j=1;
            while(j<=i){
                System.out.print(" "+i);
                j++;
            } j=i-1;
            while(j>0){
                System.out.print(" "+i);
                j--;
            }
            System.out.println();
        }*/


//    }
//}

