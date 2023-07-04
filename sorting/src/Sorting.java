import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Sorting {
    /*public static void bubbleSort(int arr[] , int swap){

        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;
                }

            }

        }System.out.println("Total No of swapping = "+ swap);

    }
    public static void printSorting(int arr[], int swap){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");

        }
    }
    public static void main(String []args){
        int arr[] = {1,2,3,4,5};
        int swap = 0;
        bubbleSort(arr, swap);
        printSorting(arr, swap);
    }*/

    // increasing order using selection sort...

    /*public static void selectionSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int minpos = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minpos]>arr[j]){
                    minpos = j;
                }
            }int temp = arr[i];
            arr[i] = arr[minpos];
            arr[minpos] = temp;
        }
    }
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {3,2,1,5,4};
        selectionSort(arr);
        printArr(arr);
    }*/

    //Decreasing order using Selection sort..
    /*public static void selectionSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int minpos = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minpos]<arr[j]){
                    minpos = j;
                }
            }int temp = arr[i];
            arr[i] = arr[minpos];
            arr[minpos] = temp;
        }
    }
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {3,2,1,5,4};
        selectionSort(arr);
        printArr(arr);
    }*/

    //insertion sort

    /*public static void insertionSort(int arr[]){
        for(int i=1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;
            while(prev >= 0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
                arr[prev+1] = curr;
            }
        }
    }
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        insertionSort(arr);
        printArr(arr);
    }*/

    // Inbuilt Arrays...

    /*public static void main(String[] args) {
       // int arr[] = {5,4,1,3,2};
        //using import java.util.Arrays;
        //Arrays.sort(arr);
        //Arrays.sort(arr,starting index, ending index);
        *//*Arrays.sort(arr);*//*
        *//*Arrays.sort(arr,0,3);*//*
        //How to write a arr in decreasing order..
        //import java.util.Collections;
        //for this using of collection type package we need to create a object type arr..
        //Integer arr[] = {5,2,3,1,4}
        Integer arr[] = {5,4,1,3,2};
        *//*Arrays.sort(arr,Collections.reverseOrder());*//*
        *//*Arrays.sort(arr,0,3,Collections.reverseOrder());*//*

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
    }*/

    //Counting sorting...

    /*public static void countingSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            largest = Math.max(largest,arr[i]);
        }
        int count[] = new int[largest+1];
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }
        //sorting
        int j = 0;
        for(int i=0; i<count.length; i++){
            while(count[i]>0){
                arr[j]=i;
                count[i]--;
                j++;
            }
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {1,4,1,3,2,4,3,7};
        countingSort(arr);
    }*/

    /*//Bubble Sorting..
    //time complexity O(n^2)...
    //time complexity of counting array is O(n+range)..
    public static void bubbleSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void selectionSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int minpos = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minpos] > arr[j]){
                    minpos = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minpos];
            arr[minpos] = temp;
        }
    }
    public static void insertionSort(int arr[]){
        for(int i=1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;
            while(prev >= 0 && arr[prev] >curr){
                arr[prev+1] = arr[prev];
                prev--;
                arr[prev+1] = curr;
            }
        }
    }
    public static void countingSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            largest = Math.max(largest,arr[i]);
        }
        int count[] = new int [largest+1];
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }
        //sorting..
        int j=0;
        for(int i=0; i<count.length; i++){
            while(count[i] > 0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        Scanner sc = new Scanner(System.in);
        //int variable = sc.nextInt();
        countingSort(arr);
        printArr(arr);
    }*/

    

}
