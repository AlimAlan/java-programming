package day_57_abstraction_polymorhism.abstract_class_vs_interface;

public class Runner {
    public static void main(String[] args) {
       // AbstractA absA=new AbstractA();     we cannot create object (instantiate) neither of them

        InterfaceA.staticMethodE("wooden spoon");
       ConcreteA.staticMethodC();

    }
}
