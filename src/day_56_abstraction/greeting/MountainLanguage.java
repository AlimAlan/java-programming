package day_56_abstraction.greeting;

public class MountainLanguage implements Greeting{

    @Override
    public void hi() {
        System.out.println("Salamatsyzby");
    }

    @Override
    public void bye() {
        System.out.println("Salamatta Kalynyz");
    }
}
