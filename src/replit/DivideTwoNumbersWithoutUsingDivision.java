package replit;

/**
 * 19. Write a method that can divide two numbers without using division operator
 */
public class DivideTwoNumbersWithoutUsingDivision {
    public static void main(String[] args) {
        int x = 21;
        int y = 5;

        System.out.println(devideNums(x,y));
    }
    public static int devideNums(int a,int b){
        int count=0;
        while (a>=b){ //  21>5,16>5,11>5,6>5, **1>5**
            a=a-b;
            count++;
        }
        return count;
    }
}
