package replit;
import java.util.Scanner;
import java.util.*;
/**
 * Write a program that will find out shortest words in the given string str.
 * If there are few words that are evenly short, print them all.
 * Use split method in order to split str string variable and create an array of strings.
 * Print array with Arrays.toString() method. Sort array before printing.
 */
public class ShortestWord {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine(); // olive, fish, pursuit, old, warnign, python,java, coffee, cat, ray
        String[]strArr=str.split(", ");
        String []shortest = {strArr[0]};
        for(String each: strArr){
            if(each.length()<=shortest[0].length()){
                shortest[0]=each;
            }
        }
        String shortestWord="";
        for(int i=0; i<strArr.length; i++){
            if(shortest[0].length()==strArr[i].length()){
                shortestWord+=strArr[i]+", ";

            }
        }
        String []result=shortestWord.split(", ");
        System.out.println(Arrays.toString(result));
        Arrays.sort(result);
        System.out.println(Arrays.toString(result));

    }
}
