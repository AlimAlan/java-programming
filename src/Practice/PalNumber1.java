package Practice;

public class PalNumber1 {
    public static void main(String[] args) {
        int number=1234321;
        int temp=number;
        int reverse=0;
        while (temp!=0){
            int lastDigit=temp%10;            //1
            reverse=(reverse*10)+lastDigit;        //
            temp=temp/10;
        }
        System.out.println(reverse==number);
    }
}
