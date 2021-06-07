package day_50_inheritance;

/**
 * Sub class
 * child class
 * Derived class
 */
public class Teacher extends Person {
    int teacherID;
    public void teach(String topic){
        System.out.println("Teacher is teaching "+topic);
    }
}
