package day_21_string_manipulation;

public class FirstAndLastTest {
    public static void main(String[] args) {
        String word="MOM";
        char first=word.charAt(0);
        char last=word.charAt(2);

        if(first==last) {
            System.out.println("first and last letter match");

        }else {
            System.out.println("first and last letters mismatch");

        }
        if(word.charAt(0)==word.charAt(2)){
            System.out.println("first and last letters match");

        }else {
            System.out.println("first last letters mismatch");

        }
        String husband="Arstan";
        char firstLetter=husband.charAt(0);
        char lastLetter=husband.charAt(5);
        System.out.println(lastLetter);
        System.out.println(firstLetter);

        if(firstLetter==lastLetter){
            System.out.println(husband+"-first and last names match");
        }else{
            System.out.println(husband+" first and last names mismatch");

        }

    }
}
