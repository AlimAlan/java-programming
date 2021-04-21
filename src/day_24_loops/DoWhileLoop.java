package day_24_loops;

public class DoWhileLoop {
    public static void main(String[] args) {
        int  count=10;
        do {
            System.out.println("counter = "+count);
            count+=100;
        }while (count<=1000);

    }
}
