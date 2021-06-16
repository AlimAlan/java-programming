package Practice;

public class PalNumber {
    public static void main(String[] args) {
        int num=12321;
        int temp=num;
        int reverse=0;
        while (temp!=0){
            int lastDigit=temp%10;        //1
           reverse=(reverse*10)+lastDigit;
           //0*10+1=1
            //1*10+2=12;
            //12*10+3=120+3=123
            //123*10+2=1230+2=1232
            //1232*10+1=12321

            temp=temp/10; //1232

        }
        System.out.println(reverse==num);
    }
}
