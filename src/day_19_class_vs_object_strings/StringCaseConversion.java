package day_19_class_vs_object_strings;

import java.util.Locale;

public class StringCaseConversion {
    public static void main(String[]args){
        String word="Cybertek";
        String sentence="Java is fun";
        System.out.println(word.toUpperCase());
        System.out.println("JAVA".toLowerCase());
        System.out.println(sentence.toUpperCase());


        String worldInLcase= word.toLowerCase();
        System.out.println("wordInLCase = "+worldInLcase);

        word=word.toLowerCase();
        System.out.println("word = "+word);

        String company="Amazon";
        System.out.println(company.toUpperCase());
        System.out.println("company in uppercase - "+company.toUpperCase());
        System.out.println("java".toUpperCase());
        System.out.println("company = "+company);
        company= company.toUpperCase();
        System.out.println("company = " + company);



    }
}
