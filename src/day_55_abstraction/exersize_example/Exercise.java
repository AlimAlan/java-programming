package day_55_abstraction.exersize_example;

public abstract class Exercise {
    public void start(){       //non abstract method
        System.out.println("Warming up and starting the exercise");

    }

    /**
     * abstract method-method without body/implementation, just signature
     * purpose: letting sub classes implement/override their own way
     */
    public abstract void perform();

    /**
     *  another abstract method that concrete sub classes will override/implement
     * @param minutes how long is exercize is performed
     * @return number of calories burned/used
     */
    public abstract int getCaloriesCount(int minutes);

}
