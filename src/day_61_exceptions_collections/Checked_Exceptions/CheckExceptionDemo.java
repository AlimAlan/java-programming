package day_61_exceptions_collections.Checked_Exceptions;

public class CheckExceptionDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("About to sleep for 5 seconds");

        try{
            Thread.sleep(5000); //causes an InterruptedExceptions, which is a checked exception - checked exception
        }catch (InterruptedException e){
            e.printStackTrace(); //only prints when exceptions happened
        }

        //Declaring using throws keyword
        Thread.sleep(5000);
    }
}