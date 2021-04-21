package day_32_arrays_split;
import java.util.*;
public class SplitMethod {
    public static void main(String[] args) {
        String words="java,python,selenium,html";
        String[]wordsArray=words.split(",");
        System.out.println(Arrays.toString(wordsArray));
        System.out.println("length of array = "+wordsArray.length);
        for(String each:wordsArray){
            System.out.println(each);
        }

          String sentence="today I am coding Java arrays";
          String[]sentenceArray=sentence.split(" ");
          System.out.println(Arrays.toString(sentenceArray));
          System.out.println("With space: "+sentenceArray);
          for(String each: sentenceArray){
              System.out.println(each);

          }




    }
}
