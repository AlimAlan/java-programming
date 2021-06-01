package officeHours.Practice_05_05_2021;
import java.util.*;
public class ReverseLetters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       // System.out.println(reverseNoSpec(in.next()));
        System.out.println(reverseNoSpec("Ab,c,de!$"));


    }

    public static String reverseNoSpec(String str) {
        // your code here
        char[] letters=str.toCharArray();                //[A, b, ,, c, ,, d, e, !, $]  converted to char
        System.out.println(Arrays.toString(letters));
        for(int i=0,j=letters.length-1; i<=letters.length/2;i++){
            if(Character.isLetter(letters[i])){
                for(; j>=0 ;j--){
                    if(Character.isLetter(letters[j])){
                        char temp=letters[i];
                        letters[i]=letters[j];
                        letters[j--]=temp;
                        break;
                    }
                }
            }
        }

        return Arrays.toString(letters).replace("[","").replace("]","").replace(", ","");
        }
    }

