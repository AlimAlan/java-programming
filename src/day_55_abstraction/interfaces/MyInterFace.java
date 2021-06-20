package day_55_abstraction.interfaces;

public interface MyInterFace {
    public abstract void learn();
}
interface MyInterface2{

}
class MyClass implements MyInterFace, MyInterface2{

    @Override
    public void learn() {
        System.out.println("Learning in MyClass");
    }
}
class Main{
    public static void main(String[] args) {
     //   MyInterFace myInterFace=new MyInterFace() ;  ERROR cannot create object of interface
        MyClass myClass=new MyClass();

    }
}
