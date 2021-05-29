package replit;
import java.util.*;
public class PrintFirstAndLastChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
       //bahar
        //br
        String newWord="";
        for(String each: words){
            newWord+=""+each.charAt(0)+each.charAt(each.length()-1)+" ";


            }
        System.out.println(Arrays.toString(newWord.split(" ")));
        }

    }


