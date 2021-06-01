package day_34_void_methods;

public class FirstMethod {
    public static void main(String[] args) {
        displayMessage();   //call the method
        displayMessage();
        displayMessage();
        for(int i=1; i<=100; i++){
            System.out.print(i+" - ");
            displayMessage();
        }
    }
    public static void displayMessage(){         //first custom reusable method

        System.out.println("Hello B22 Friends");
    }
}
