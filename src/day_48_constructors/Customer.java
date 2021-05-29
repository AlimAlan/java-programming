package day_48_constructors;

public class Customer {
    private String name;
    private int ID;

    public Customer(){
        System.out.println("No args constructor");
        name="new customer";
        ID=-1;
    }
    //add a constructor where we can assign name and ID;


    public Customer(String name, int ID) {
        System.out.println("2 args constructor");
        this.name = name;
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
