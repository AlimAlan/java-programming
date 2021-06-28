package Practice;

public class FibNum {
    public static void main(String [] args){
        //index 0 1 2 3 4 5 6 7  8  9
        //fib 0 1 1 2 3 5 8 13 21 34
        //if the number 9 it has to return 34
        System.out.println("First way - " + fibIndexNumWayOne(9));
        System.out.println("Second way - "+ fibIndexNumWayTwo(4));
        System.out.println("Return the index of the Fibonacci number - "+fibonacciNumber(13));
    }

    public static int fibIndexNumWayOne(int N){ //when we are giving index number and returning fibonacci number
        if(N==0) return 0;
        if(N==1) return 1;

        int a = 0;
        int b = 1;
        int sum = a+b;
        while(N>1){     // since I did not write N>=1, when N will be 2 the while loop will stop
            sum = a+b;  //1 2 3 5 8 13 21 34 will not go more
            a=b;        //1 1 2 3 5 8  13 21 will not go more
            b=sum;      //1 2 3 5 8 13 21 34 will not go more
            //condition for while loop
            N--;        //9 8 7 6 5 4   3  2  1
        }
        return sum;
    }

    public static int fibIndexNumWayTwo(int N) {
        int sum = 0;
        sum = (N-1)+(N-2);

        return sum;
    }
    public static int fibonacciNumber (int fibN){
        //if fibN will be 34, it has to return 9
        //fibIndex will be our index number that is belong to the fibN
        //On the interview I will ask can i declare the fibonacci array and compare my fibN to the
        // array numbers and if it match it will return the index number

        if(fibN ==0) return 0;
        if(fibN ==1) return 1;
        int N=0;
        int fib[] = {0,1,1,2,3,5,8,13,21,34};
        int fibIndex = 0;
        for (int i = 2; i < fib.length; i++) { //here I started from 2, because 0, 1 it will be always return 0,1
            //if i is 34, return the index number
            if(fib[i]==fibN){
                fibIndex = i;
            }
        }
        return fibIndex;
    }
}
