package Practice;

import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {

        String word = "DC501GCCCA098911";

        String temp = ""+word.charAt(0);
        String result = "";

        for (int i = 1; i < word.length(); i++) {
            boolean check = Character.isLetter(word.charAt(i)) && Character.isLetter(word.charAt(i-1)) ||
                    Character.isDigit(word.charAt(i))  &&  Character.isDigit(word.charAt(i-1));

            if(check){
                temp+= word.charAt(i) + "";
            }else{
                char arr[] = temp.toCharArray();
                Arrays.sort(arr);
                result += String.valueOf(arr);
                temp = "";
                temp += ""+word.charAt(i);
            }
        }
        char arr[] = temp.toCharArray();
        Arrays.sort(arr);
        result += String.valueOf(arr);
        System.out.println("was " + word);
        System.out.println("now " + result);
    }

}
