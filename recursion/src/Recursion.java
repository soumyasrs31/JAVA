public class Recursion {
    /*// print decreasing order...
    public static void decreaseFun(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        decreaseFun(n-1);
    }
    public static void main(String[] args) {
        int n = 10;
        decreaseFun(n);

    }*/

    /*//increasing order....
    public static void increasingFunction(int n){

        if(n == 1){
            System.out.print(n+ " ");
            return;
        }
        increasingFunction(n-1);
        System.out.print(n + " ");

    }*/
    /*// factorial of number n...
    //its time complexity and space complexity is O(n)...
    public static int fact(int n){
        if(n == 0){
            return 1;
        }
        int fnm1 = fact(n-1);
        int fn = n * fact(n-1);
        return fn;
    }*/

    /*//sum of n natural number..
    public static int sumPrint(int n){
        if(n==1){
            return 1;
        }
        sumPrint(n-1);
        int sum = n + sumPrint(n-1);
        return sum;
    }*/

    /*//fibonacci series ...
    public static int fibonacci(int n){
        if(n == 0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int fibnm1 = fibonacci(n-1);
        int fibnm2 = fibonacci(n-2);
        int fibn = fibnm1 + fibnm2;
        return fibn;
    }*/

    //check if array is sorted or not...
    /*public static boolean isSorted(int arr[] , int i){

        if(i==arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        isSorted(arr,i+1);
        return true;
    }*/
/*
    //find the first occurance of elements in an arrray...
    public static int printOccureFirst(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        if(key == arr[i]){
            return i;
        }
        return printOccureFirst(arr, key,i+1);
    }

    //find last occurence of element in an array...
    public static int printOccurLast(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[arr.length-1-i] == key){
            return arr.length-1-i;
        }
        return printOccurLast(arr,key,i+1);
    }*/

    // power function for time complexity is O(n)..
    public static int pow(int x, int n){
        if(n == 0){
            return 1;
        }
        int fnm1 = pow(x,n-1);
        int fn = x * pow(x,n-1);
        return fn;
    }

    //Optimized power function for time complexity is O(log n)..

    public static int optimizedPow(int x, int n){
        if(n == 0){
            return 1;
        }
        int halfPower = optimizedPow(x,n/2);
        int halfPowerSquare = halfPower * halfPower;
        if(n %2 != 0){
            halfPowerSquare = x * halfPowerSquare;
        }
        return halfPowerSquare;
    }

    public static void main(String[] args) {

        System.out.println(optimizedPow(2,5));

    }
}
