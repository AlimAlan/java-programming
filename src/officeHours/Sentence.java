package officeHours;


public class Sentence {
    public static void main(String[] args) {
        String sentence = "Java is a fun language";
        String firstWord = sentence.substring(0, sentence.indexOf(" "));
        String newSentence = sentence.substring(sentence.indexOf(" ")) + " " + firstWord;
        System.out.println(newSentence);


        String str = "    i love java    ";
        System.out.println(str.trim());


   // String input1 = "JamesBond";
  //  String input2 = "Secret";

   // if(input1.length()<6 && input2.length()>6){


      //  first = input1.substring(0, 4).toLowerCase();
    //    last = input2.substring(input2.length() - 3).toLowerCase();

  //  }else{
   //     System.out.println("Invalid data");
       // System.out.println();
   // }




}



    }

