package replit;

/**
 * 21.Swap two variable' values without using a third variable
 */
public class SwapNumbers {
    public static void main(String[] args) {
        int a=15;
        int b=7;
        a=a+b;        //8
        b=a-b;
        a=a-b;
        System.out.println(a);
        System.out.println(b);

    }
}
