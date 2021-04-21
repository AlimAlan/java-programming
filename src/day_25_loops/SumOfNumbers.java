package day_25_loops;

public class SumOfNumbers {
    public static void main(String[] args) {
        int sum=0;
        for (int i=1; i<=100; i++) {
            System.out.println(i);
            sum+=i;
            
        }
        System.out.println("sum = " + sum);

        }
}
