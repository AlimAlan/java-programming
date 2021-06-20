package Practice;

public class NumPal {
    public static void main(String[] args) {
        int a=12321;
        int reverse=0;
        int temp=a;
        while (temp!=0){
            int lastDigit=temp%10;       //1
            reverse=(reverse*10)+lastDigit;     //12
            //0*10=0+1=1
            //1*10=10+2=12
            //12*10=120+3=123
            //123*10=1230+2=1232
            //1232*10=12320+1=12321
            temp=temp/10;
            //12321
            //1232
            //123
            //12
            //1

        }
        System.out.println(reverse==a);
    }

}
