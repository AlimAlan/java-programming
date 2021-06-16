package day_54_abstraction;

public class School {
    public static void main(String[] args) {
        //Student
        OnlineStudent onlineStudent=new OnlineStudent();
        onlineStudent.attendClass();
        CampusStudent campusStudent=new CampusStudent();
        campusStudent.attendClass();

    }
}
