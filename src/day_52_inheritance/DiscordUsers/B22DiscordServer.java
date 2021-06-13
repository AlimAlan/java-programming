package day_52_inheritance.DiscordUsers;

public class B22DiscordServer {
    public static void main(String[] args) {
        GeneralUser user1=new GeneralUser();
        user1.setID(1234);
        user1.setName("John");
        user1.setRole("student");

        Admin admin1=new Admin();
        admin1.setID(12344);
        admin1.setName("Nancy");
        admin1.setRole("Admin");
        System.out.println(admin1);

    }

}
