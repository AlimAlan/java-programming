package day_50_inheritance;

public class Cat extends Animal{
    public void jump(){
        System.out.println("cat is jumping .......");
    }
    @Override
    public void speak(){
        System.out.println("cat is saying => Meow...");
    }
}
