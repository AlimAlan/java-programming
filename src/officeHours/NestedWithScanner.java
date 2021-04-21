package officeHours;
import java.util.Scanner;
public class NestedWithScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int num = input.nextInt();

        if(num>0){
            System.out.println("Enter a single word");
            String word=input.next();
            if(word.length()%2==0){
                System.out.println(word+" is even length");

            }
        }else{
            System.out.println("Enter a character");
            char letter=input.next().charAt(0);

            if(letter>'A' && letter <='Z'){
                System.out.println(letter+" is uppercase");

            }else if (letter>='a'&& letter<='z'){
                System.out.println(letter+" is a lowercase letter");

            }else {
                System.out.println("its a not valid number");

            }
        }

    }
}
