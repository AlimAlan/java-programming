package day_55_abstraction.exersize_example;

public class Running extends Exercise{

    @Override
    public void perform() {
        System.out.println("Perfoming Running exercise");
    }

    /**
     *
     * @param minutes how long is exercize is performed
     * @return  we are assuming avg num of calories while running is 13
     */

    @Override
    public int getCaloriesCount(int minutes) {
        return minutes*13;
    }
}
