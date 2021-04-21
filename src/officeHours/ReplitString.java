package officeHours;
import java.util.Scanner;

public class ReplitString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String txt = s.next();
        //your code here

        System.out.println(txt.substring(0, txt.length()-1));


        Scanner scan =new Scanner(System.in);
        String word= scan.next();
        int half=word.length()/2;

        if(word.length()%2!=0){
            System.out.println(word.charAt(half)+""+word.charAt(half));

        }else {
            System.out.println();
        }


    }

}
