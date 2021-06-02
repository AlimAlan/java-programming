package day_49_static_methods;

public class StaticMethods {

    int num=10;
    // static method=>what is outside of main method
   static int count=5;     //static method can use in another static method==>> not ERROR

public static void displayMessage(String message){
    System.out.println("message: "+message);
   // System.out.println("num = "+num);  ==>> this will not work   // num is instance variable, static cannot accept
    System.out.println(count);


}
public static void anotherStaticMethod(){
    System.out.println("another static method");
    displayMessage("wooden spoon");
}
//staticMethods.instanceMethod(); => no          we need to create object
    //static methods stm=new StaticMethods()
    //stm.instanceMethod();
public void instanceMethod(){
    System.out.println("instance method");
    System.out.println("nums "+num);
    System.out.println("count = "+count);

}

}
