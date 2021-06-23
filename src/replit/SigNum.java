package replit;

import java.util.Scanner;

public class SigNum {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
sign(n);

    }
    public static void sign(int n){
        if(n>0){
            System.out.println(1);
        }else if(n<0){
            System.out.println(-1);
        }else {
            System.out.println(0);
        }
    }
}
