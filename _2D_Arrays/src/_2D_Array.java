import java.sql.SQLOutput;
import java.util.*;
public class _2D_Array {
    public static void inputMatrix(int matrix[][]){
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
    }
    public static void printMatrix(int matrix[][]){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j]+" ");
            }System.out.println();
        }
    }
    public static boolean findKey(int matrix[][], int key){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == key){
                    System.out.println("The index is"+i+", "+j);
                    return true;
                }
            }
        }
        System.out.println("The key doesnot exist in matrix");
        return false;
    }
    public static void find_Max_Min(int matrix[][]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] > largest){
                    largest = matrix[i][j];
                }
                if(matrix[i][j] < smallest){
                    smallest = matrix[i][j];
                }
            }
        }
        System.out.println(largest);
        System.out.println(smallest);

    }
    public static void main(String[] args) {

        int matrix[][] = new int[3][3];
        inputMatrix(matrix);
        printMatrix(matrix);
        findKey(matrix, 5);
        find_Max_Min(matrix);
    }
}
