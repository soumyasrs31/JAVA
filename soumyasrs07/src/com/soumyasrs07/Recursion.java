/*
package com.soumyasrs07;

public class Recursion {

    // calculate factorial of n number
    public static int calcFactorial(int n){
        if(n==1 || n==0){
            return 1;
        }
        int fact_nm1 = calcFactorial(n-1);
        int fact_n = n * fact_nm1;
        return fact_n;
    }
    public static void main(String[] args){
        int n=5;
        int ans = calcFactorial(n);
        System.out.println(ans);
    }
}
*/

import javax.swing.*;
class  Jframe{
    public static void main(String[] args) {
        JFrame j = new JFrame("Bland JFrame");
        j.setSize(400,400);
        j.setVisible(true);
    }
}