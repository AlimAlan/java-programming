package day_24_loops;

public class Alphabet {
    public static void main(String[] args) {
        char letter='a';
        System.out.println("letter = " + letter);
        letter++;
        System.out.println("letter = " + letter);
        while(letter<='z'){
            System.out.print("Letter - " +letter+" "+",");
            letter++;

        }
        System.out.println("Wrong alphabet!!!");


        System.out.println();


        char letter1='z';
        System.out.println(letter1+" ");
      //  letter--;
        while(letter1>='a') {
            System.out.print(letter1+" "+" ,");
            letter1--;

        }
    }
}
