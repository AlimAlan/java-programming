package day_35_methods_with_param;

public class MethodsWithInputs {
    public static void main(String[] args) {
        displayValue(5);
        displayValue(9);
        int count=55;
        displayValue(count);
        greetByName("Timur");
        greetByName("Adilet");
        String name="Arstan";
        greetByName(name);
    }
    public static void displayValue(int nums){
        System.out.println("value is: "+nums);
    }
    public static void greetByName(String name){
        System.out.println("Hello "+name+" how are you today?");
    }
}
