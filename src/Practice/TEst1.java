package Practice;

public class TEst1 {
    public static void main(String[] args) {
        int num=123211;
        int reverse=0;
        int temp=num;

        while(temp>0){


            int lastDigit=temp%10;        //1
            reverse=(reverse*10)+lastDigit;      //2    //3
            //0*10+1

            temp=temp/10;
        }
        System.out.println(reverse==num);
        System.out.println(reverse);







    }
    }


