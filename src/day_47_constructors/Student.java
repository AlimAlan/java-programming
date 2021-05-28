package day_47_constructors;

public class Student {
    private String name;
    private int age;
    //no args constructor
    public Student(){
        System.out.println("No Args constructor");

    }
    //constructor overloaded
    public Student(String name){
        System.out.println("Name param constructor | name= "+name);
    }
    //constractor with age
    public Student(int age){
        System.out.println("Age param constructor | age "+age);
    }
    //constractor with name and age
    public Student(String name, int age){
        System.out.println("Constructor with age and name "+name+" - "+age);
    }
}
