package officeHoursPractice03_24_2021;

import java.util.Locale;

public class ChainingStringMethods {
    public static void main(String[] args) {
        String word="wo oden spo on";
        System.out.println(word.toUpperCase().toLowerCase());

        System.out.println(word.replace(" ","").toUpperCase());

        String word2="woodbridge";
        System.out.println(word2.substring(0,1).toUpperCase()+word2.substring(1));
        String capitalized=word2.substring(0,1).toUpperCase()+word2.substring(1).toLowerCase();

        System.out.println(capitalized+ " capitalized");




    }
}
