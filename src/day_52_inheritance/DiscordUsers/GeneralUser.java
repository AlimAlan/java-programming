package day_52_inheritance.DiscordUsers;

public class GeneralUser {

    private String role;
    private String name;
    private int ID;

    public  GeneralUser(){
        System.out.println("User Constructor");

    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
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

    @Override
    public String toString() {
        return "GeneralUser{" +
                "role='" + role + '\'' +
                ", name='" + name + '\'' +
                ", ID=" + ID +
                '}';
    }
}
