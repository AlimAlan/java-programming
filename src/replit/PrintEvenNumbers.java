package replit;
/*
Write a for loop that prints all even integers from 80 through and including 20.
Seperate each number with a space
 */
public class PrintEvenNumbers {
    public static void main(String[] args) {
        int n=20;
        for(int i=80; i>=n; i--){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }

    }
}
