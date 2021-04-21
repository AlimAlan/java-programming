package officeHours.SaimTask;

/**
 * Write a program that can print all the ODD numbers between 0 ~ 100 that can be divisible by 3 & 5
 */
public class FizzBuzz {
    public static void main(String[] args) {
     //   int a = 100;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 1) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println(i);
                }

            }

        }
    }
}