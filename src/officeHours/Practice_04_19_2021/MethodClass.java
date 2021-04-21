package officeHours.Practice_04_19_2021;

public class MethodClass {
    /*
    void ->   run a block of code, there is no return value
    Arrays.sort() -> takes an array, sorts it, doesn't return anything

    return ->  runs a block of code, but there is a return value
    Arrays.binarySearch()  -> takes an array and element, tries to find the elements, returns the index of element.
     */


    public static void main(String[] args) {


    }
    public static void methodOne(){
        System.out.println("One");
    }
    public static String methodTwo(){
        return "Two";
    }
    public static int methodThree(String word){
        return word.length();

    }
    public static boolean login(String username, String password){
        return true;
    }
}
