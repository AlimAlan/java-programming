package day_25_loops;

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println("\nFIZZ numbers: ");
        for (int n=0; n<=100; n++){
            if(n%3==0){
                System.out.print(n+" ");
            }
        }
        System.out.println("\nBUZZ numbers: ");
        for(int n=0; n<=100; n++){
            if(n%5==0){
                System.out.print(n+" ");
            }
        }
        System.out.println("\nFIZZBUZZ numbers: ");
        for(int n=0; n<=100; n++){
            if(n%3==0 && n%5==0){
                System.out.print(n+" ");
            }
        }
    }
}
