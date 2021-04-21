package day_32_arrays_split;

public class ReverseSentence {
    public static void main(String[] args) {
        String sentence="Java is fun";
        String[]newSentence=sentence.split(" ");
        String reversed="";
        for(int i=newSentence.length-1; i>=0; i--){
           // System.out.print(newSentence[i]+ " ");
            reversed+=newSentence[i]+" ";

        }
       System.out.println(sentence+" sentence");
        System.out.println(reversed.trim()+" reversed");


    }
}
