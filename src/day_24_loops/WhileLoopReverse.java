package day_24_loops;

public class WhileLoopReverse {
    public static void main(String[] args) {

        int count=5;
        while(count>=0){
            System.out.println(count+" Start Counting");
            --count;

        }
        System.out.println("Finish counting");



        int unreadSMS=10;
        while(unreadSMS>=1){
            System.out.println("I have total "+unreadSMS+" Unread messages");
            unreadSMS--;
        }
        System.out.println("reading SMS");


    }
}
