package com.soumyasrs3;

import java.util.*;
public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]);
        }
    }
    /*public static void main(String[] args) {
        int []marks = new int[3];
        marks[0] = 97;
        marks[1] = 94;
        marks[2] = 91;
        System.out.println(marks[1] + " " + marks[0]);

    }*/

    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        } for(int i=0; i<size; i++){
            System.out.println(numbers[i]);
        }

    }*/

    /*// How to find index of the number..


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int age[] = new int[size];
        for(int i=0; i<size; i++){
            age[i] = sc.nextInt();
        }int x = sc.nextInt();
        for(int i=0; i<age.length; i++){
            if (age[i] == x){
                System.out.println("x found at index "+ i);
            }
        }
    }*/

    /*//Take an array of names as input from the user and print them on the screen.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String []students = new String[size];
        for(int i=0; i<size; i++){
            students[i] = sc.next();
        }
        for(int i=0; i<students.length; i++){
            System.out.print(students[i] + ", ");
        }
    }*/

    /*//Find the maximum & minimum number in an array of integers.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int number[] = new int[size];
        for(int i=0; i<size; i++){
            number[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for(int i=0; i<number.length; i++){
            if(number[i] < min){
                min = number[i];
            }if(number[i] > max){
                max = number[i];
            }
        }
        System.out.println(max + ", " + min);
    }*/

    //Take an array of numbers as input and check if it is an array sorted in ascending order.

    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int number[] = new int[size];
        for(int i=0; i<size; i++){
            number[i] = sc.nextInt();
        }
        boolean isAscending = true;
        for(int i=0; i<number.length-1; i++){
            if(number[i]>number[i+1]){
                isAscending = false;
            }
        }if(isAscending) {
            System.out.println("The array is sorted in ascending order");
        }else{
            System.out.println("The array isn't sorted in ascending order");

        }
    }*/

    // 2D Arrays...

    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int [][]numbers = new int[rows][cols];
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                numbers[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }*/

    /*//Searching for an element x in a matrix

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int [][]numbers = new int[rows][cols];
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                numbers[i][j] = sc.nextInt();
            }
        }
        int x = sc.nextInt();
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(x == numbers[i][j]){
                    System.out.print("rows = "+i+" "+ "cols = "+j);
                }
            }
        }
    }*/

    /*//For a given matrix of N x M, print its transpose.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int [][]matrix = new int [m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Its Transpose is -");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }

    }*/


}
