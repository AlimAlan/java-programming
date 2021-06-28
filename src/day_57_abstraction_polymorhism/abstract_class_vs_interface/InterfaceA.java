package day_57_abstraction_polymorhism.abstract_class_vs_interface;

/**
 * Both abstract class and interface are used to achieve abstraction in java
 *
 * MARKER INTERFACE -> interface without any methods or variables. we can use this for polymorphism,
 * or to mark the class as capable of whatever
 */
public interface InterfaceA {    //before java 8 interface was pure abstraction,only abstract methods were allowed is automatically added, so it is optional to type it: void absMethodD(int num) is enough
     //constants
    public static final String TYPE="interface";
    double MAX_COUNT=500;   //this is also public static final

    public abstract void absMethodD(int num);

    /**
     * starting from java 8(jdk 1.8)
     * interface can have static and default methods
     */

    public static void staticMethodE(String str){     //starting from java 8, static and default methods are allowed in interfaces
        System.out.println("staticMethodE is called with str -"+str);

    }
    public default void defaultMethodF(){    //default method is a method with a body in interface
        System.out.println("defaultMethodE is called");
    }
}

