package important_Qus;

import java.util.ArrayList;


public class Common_Element_Two_Arrays {
    public static void main(String[] args) {
        //How do you find the common elements between two arrays in Java?
        int arr1[] = {1,2,4,6,3,5,77};
        int arr2[] = {1,6,3,77,8,3,9};
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2.length; j++){
                if(arr1[i] == arr2[j]){
                    al.add(arr1[i]);
                    break;
                }
            }
        }
        System.out.println(al);
    }
}
