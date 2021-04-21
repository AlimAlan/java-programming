package day_32_arrays_split;

public class SentenceSplit {
    public static void main(String[] args) {
        String sentence="java is fun";
        String []words=sentence.split(" ");
        System.out.println("1 st word: "+words[0]);
        System.out.println("2 nd word: "+words[1]);
        System.out.println("3 rd word: "+words[2]);
        for(String w: words){
            System.out.println(w);
        }
        String googleResult="About 1,810,000 results (0.68 seconds)";
        String[]words1=googleResult.split(" ");
        System.out.println("Count = "+words1[1]);
        System.out.println("Second = "+words1[3].replace("(",""));
        System.out.println("second: "+words1[3].toString().replace("(",""));
        for(String j: words1){
            System.out.println(j);
        }

    }
}
