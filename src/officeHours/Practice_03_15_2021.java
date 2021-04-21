package officeHours;

public class Practice_03_15_2021 {
    public static void main(String[] args) {
        int a =5;
        int b= a++ +a-- + a*2+a+ ++a;
        System.out.println("a"+a);
        System.out.println("b"+b);


        int a1=200;
        int b1= -a++ +  --a *a-- % 2+a;
        System.out.println("a1 = " + a1);
        System.out.println("b1 = " + b1);


        int c=10;
        int d= c-5*2+c/2;
        System.out.println("c = " + c);
        System.out.println("d = " + d);

    }
}
