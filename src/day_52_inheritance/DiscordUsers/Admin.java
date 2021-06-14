package day_52_inheritance.DiscordUsers;

public class Admin extends GeneralUser{

    public Admin(){
        super();    //call super/generaluser class no args constructor
        System.out.println("Admin class constructor");

    }
    public Admin(String name, int ID){
        //super("Admin",name, ID);    //public User
        System.out.println("Admin class 2 args constructor");

    }


    @Override
    public String toString(){

        return "Admin{" +
                "role='" + getRole() + '\'' +
                ", name='" + getName() + '\'' +
                ", ID=" + getID() +
                '}';
    }
}
