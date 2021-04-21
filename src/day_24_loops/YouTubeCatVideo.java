package day_24_loops;

public class YouTubeCatVideo {
    public static void main(String[] args) throws InterruptedException {
        int seconds=0;
       // int video=157;
        while (seconds<=117){
            System.out.println("Watching Video On YouTube\uD83D\uDC08 - BBC"+seconds);
            seconds++;
            Thread.sleep(500);

        }
        System.out.println("Finished watching video, lets start another one");



     //   int count=5;
       // while(count>=10) {
           // System.out.println("start counting");
         //   count++;

       // }


    }
}
