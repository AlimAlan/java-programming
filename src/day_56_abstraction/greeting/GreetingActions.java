package day_56_abstraction.greeting;

public class GreetingActions {
    public static void main(String[] args) {
        MountainLanguage ml=new MountainLanguage();
        ml.bye();
        ml.hi();
        Greeting gt=new MountainLanguage();
        gt.bye();
        gt.hi();

        Japanese jp=new Japanese();
        jp.bye();
        jp.hi();
        gt=new Japanese();     //polymorphism
        gt.hi();
        gt.bye();   //polymorphism
    }
}
