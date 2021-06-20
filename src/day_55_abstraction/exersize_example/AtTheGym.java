package day_55_abstraction.exersize_example;

public class AtTheGym {
    public static void main(String[] args) {
        Exercise exercise=new Running();       //polymorphism benefit of abstaction . later
        Running running=new Running();
        Swimming swimming=new Swimming();
        FreeWeight freeWeight=new FreeWeight();

        exercise.start();
        exercise.perform();
        System.out.println("Running 30 min -calories = "+exercise.getCaloriesCount(30));

        swimming.start();
        swimming.perform();
        System.out.println("swimming.getCaloriesCount(30) = " + swimming.getCaloriesCount(30));

        freeWeight.start();
        freeWeight.perform();
        System.out.println("Freeweight 30 mins - calories = " + freeWeight.getCaloriesCount(30) );

    }
}
