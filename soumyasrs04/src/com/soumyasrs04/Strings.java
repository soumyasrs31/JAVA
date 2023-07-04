package com.soumyasrs04;//package com.soumyasrs04;
//
import java.util.*;
//import java.util.Scanner;
//
//public class Strings {
//    `public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//
//Taking For Single Input
//        String fullName = sc.next();
//        System.out.println(fullName);
//
//
//
////*
///*
///For taking line as a input..
//        String fullName = sc.nextLine();
//        System.out.println(fullName);
//
//
//
//
////*
///*
///concatenation(joining 2 string)
//
//        String firstName = "Soumya";
//        String lastName = "Sahoo";
//        String fullName = firstName + " " +lastName;
//        System.out.println(fullName);
//        System.out.println(fullName.length());
//
//
//
public class Strings{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String user = sc.nextLine();
        String userName = "";
        for(int i=0; i<user.length(); i++){
            if(user.charAt(i) == '@'){
                break;
            }else{
                userName += user.charAt(i);
            }
        }
        System.out.println(userName);




//
//
//       String fullName = firstName + " " +middleName+ " " + lastName;
//        System.out.println(totalNos.length());
//        if(firstName.compareTo(lastName)==0){
//            System.out.println("Two Name are equal");
//        }else if(firstName.compareTo(lastName) > 0){
//            System.out.println("firstName is greater than lastName");
//        }else if(firstName.compareTo(lastName)<0){
//            System.out.println("firstName is smaller than lastName");
//        }else {
//            System.out.println("Both are not equal");
//        }




    }
}
//        //Acess character of a string
//
//        String firstName = "soumya";
//        String lastName = "sahoo";
//        String fullName = firstName + " " + lastName;
//        for(int i=0; i<fullName.length(); i++){
//            System.out.println(fullName.charAt(i));
//
//        }
//
//
//
//
////*
///*
///compare 2 string...
//
//
//
//
//String name1 = "soumya";
//        String name2 = "soumya";
//        if(name1 == name2){
//            System.out.println("Two strings are same.");
//
//        }else {
//            System.out.println("Two strings are different.");
//
//
//
//
//
//
//if(new String ("soumya") == new String ("soumya")){
//            System.out.println("Two strings are equal.");
//        }else{
//            System.out.println("Two strings are not equal.");
//        }
//
//
//
////        Import Note: '==' are not use in string variable...
//
//
//
//
//String name1 = "soumya";
//        String name2 = "soumya";
//        if(name1.compareTo(name2) == 0){
//            System.out.println("Two strings are equal.");
//        }else{
//            System.out.println("Two strings are not equal.");
//        }
//        String name3 = "bus";
//        String name4 = "box";
//        if(name3.compareTo(name4)>0){
//            System.out.println("bus is greater than box.");
//        }else{
//            System.out.println("bus is not greater than box.");
//        }
//
//        if(name1.equals(name2)){
//            System.out.println("Two strings are equal.");
//        }else{
//            System.out.println("Two strings are not equal.");
//        }
//
//
//
//
//
//
//
////*
///*
/// substring is the subpart of the string...
//
//        String firstName = "Soumya";
//        String middleName = "Ranjan";
//        String lastName = "Sahoo";
//        String fullName = firstName + " " + middleName + " " + lastName;
////        System.out.println(fullName.substring(7);
////        System.out.println(fullName.substring(7, fullName.length()));
//        System.out.println(fullName.substring(0, 6));
//
//
//
//
//
//
////*
///*
///ParseInt Method of Integer class
//
//        String str = "1234";
//        int number = Integer.parseInt(str);
//        System.out.println(number);
//
//
//        //toString method of string class...
//
//        int number = 1234;
//        String str = Integer.toString(number);
//        System.out.println(str);
//
//
//    }
//}
//
//
////Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.
//
//public class Strings{
//    public static void main(String[] args) {
//
//
//Scanner sc = new Scanner(System.in);
//        String firstName = sc.next();
//        String middleName = sc.next();
//        String lastName = sc.next();
//        String fullName = firstName + " " + middleName + " " + lastName;
//        System.out.println(fullName.length());
//
//
//        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//        String []name = new String[size];
//        int totalLength = 0;
//        for(int i=0; i<size; i++){
//            name[i] = sc.next();
//            totalLength += name[i].length();
//
//        }
//        System.out.println(totalLength);
//    }
//}
//
//
//
//
////*
///Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’.
//
//public class Strings{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String ars = sc.nextLine();
//
//for(int i=0; i<ars.length(); i++){
//            if(ars.charAt(i) == 'e'){
//                System.out.print('i');
//            }else{
//                System.out.print(ars.charAt(i));
//            }
//        }
//
//        String result = "";
//        for(int i=0; i<ars.length(); i++){
//            if(ars.charAt(i) == 'e'){
//                result += 'i';
//            }else{
//                result += ars.charAt(i);
//            }
//
//        }System.out.println(result);
//    }
//}
//
//
////Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
//
//public class Strings{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String email = sc.nextLine();
//        String userName = "";
//        for(int i=0; i<email.length(); i++){
//            if(email.charAt(i) == '@'){
//                break;
//            }else{
//                userName += email.charAt(i);
//            }
//        }
//        System.out.println(userName);
//    }
//}
//
//
//
////String Builder...
//
//public class Strings{
//    public static void main(String[] args) {
//        StringBuilder name = new StringBuilder("Soumya Ranjan Sahoo");
//
////        System.out.println(name);
//
//        //Get a char from index...
//
////        System.out.println(name.charAt(2));
//
//        //set a char at index...
//
//
//
//        name.setCharAt(0, 'P');
//        System.out.println(name);
//
//
//
//
//name.insert(2, 'u');
//        System.out.println(name);
//
//
//        //Delete char at some Index
//
//
//
//name.delete(7, 14);
//        System.out.println(name);
//
//
//
//
// StringBuilder sv = new StringBuilder("h");
//        sv.append("e");
//        sv.append("l");
//        sv.append("l");
//        sv.append("o");
//        System.out.println(sv);
//        System.out.println(sv.length());
//
//
//
//    }
//}
//
//
//
////*
///Reverse a String (using StringBuilder class)
//
//public class Strings {
//    public static void main(String[] args) {
//        StringBuilder sv = new StringBuilder("HelloWorld");
//        for (int i = 0; i < sv.length() / 2; i++) {
//            int front = i;
//            int back = sv.length() - i - 1;
//            char frontChar = sv.charAt(front);
//            char backChar = sv.charAt(back);
//            sv.setCharAt(front, backChar);
//            sv.setCharAt(back, frontChar);
//
//        }
//        System.out.println(sv);
//    }
//}
//
//
//
//
