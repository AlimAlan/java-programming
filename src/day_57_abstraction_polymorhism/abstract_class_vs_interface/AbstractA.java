package day_57_abstraction_polymorhism.abstract_class_vs_interface;

/**
 * Both abstract class and interface are used to achieve abstraction in java
 */
public abstract class AbstractA {
    int num1;
    private double price;
    public static int count;
    public final String type="abstract";
    public static final String LANGUAGE="java";

    public AbstractA(){         //Abstract classes can have constructors
        System.out.println("AbstractA constructor");
    }

    public abstract void absMethodA();     //abstract methods cannot be private.static or final

    public void methodB(){
        System.out.println("methodB called");
    }
    public static void staticMethodC(){
        System.out.println("static methodC is called");
    }


}
