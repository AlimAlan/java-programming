package day_57_abstraction_polymorhism.polymorphism;

public class Cat extends Animal{
    @Override
    public void makeNoise() {
        System.out.println("cat is making noise <meow meow>");
    }
}
