package day_45_OOP;

public class ComparingStrings {
    public static void main(String[] args) {
        String word1="java";          //in string pool
        String word2="java";         //it will reuse from string pool
        String word3=new String("java");        //create outside in Heap. outside String pool
        String word4=new String("java");         //create new object in heap, outside string pool


        System.out.println(word1==word2);     //true
        System.out.println(word1==word3);       //false -> point to different object in heap and pool
        System.out.println(word3==word4);      //false -> pont to different objects in heap

        System.out.println(word1.equals(word2));   //true
        System.out.println(word1.equals(word3));
        System.out.println(word1.equals(word4));


    }
}
