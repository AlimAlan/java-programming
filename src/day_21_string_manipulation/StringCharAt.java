package day_21_string_manipulation;

public class StringCharAt {
    public static void main(String[] args) {
        String word="java";
        System.out.println(word.charAt(0));
        System.out.println(word.charAt(1));
        System.out.println(word.charAt(2));
        System.out.println(word.charAt(3));

        System.out.println(word.length());
        String company="Cybertek";
        System.out.println("first letter: "+ company.charAt(0));
        System.out.println("first letter: "+company.charAt(1));
        char first =company.charAt(0);
        char second=company.charAt(1);
      char third =company.charAt(2);
      char fours=company.charAt(3);
      char fives=company.charAt(4);
      char six=company.charAt(5);
      char seventh=company.charAt(6);
      char eight=company.charAt(7);


        System.out.println(first+" "+second+" "+third+ " "+fours+" "+fives+" "+seventh+" "+eight);

        String withSpaces = first+" "+second+" "+third+ " "+fours+" "+fives+" "+seventh+" "+eight;
        System.out.println("With Spaces: "+withSpaces);



    }
}
