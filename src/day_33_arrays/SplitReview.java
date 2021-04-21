package day_33_arrays;

import java.util.Arrays;

public class SplitReview {
    public static void main(String[] args) {
        String word= "java";
        String[]array=word.split("a");
        System.out.println(array.length);
        int countOfA=array.length-1;
        if(word.endsWith("a")){
            countOfA++;
        }
        System.out.println("Count Of A = "+countOfA);
        System.out.println("******Split with empty string****");
        String []strArr=word.split("");
        System.out.println(strArr[0]);
        System.out.println(strArr[1]);
        System.out.println(strArr[2]);
        System.out.println(strArr[3]);



        String word1="java1html2sql";
        String []strArr1=word1.split("\\d");
        System.out.println(strArr1[0]);
        System.out.println(Arrays.toString(strArr1));

        String password = "bcTddfsaf_a12sdf";
        if(password.matches("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^_&+=]).*$")) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }



    }
}
