package day_48_constructors;

import java.util.Arrays;

public class CybertekGroups {
    public static void main(String[] args) {
        Group group1=new Group("CyberNinjas");     //dependency injection.Group object creation depends on String name

        //print size of members
        System.out.println(group1.getMembersNames().size());
        group1.addMember("Meerim");
        group1.addMember("Kate");
        group1.addMember("Darus");
       group1.addMember("Daud");
       group1.addMember("Masha");
       group1.addMember("Sel");
       group1.addMember("Nancy");
       group1.addMember("Ivana");
       group1.addMember("Bahruz");

        System.out.println(group1.getMembersNames().size());
        System.out.println(group1.toString());

        Group group2=new Group("CyberCats");
        group2.setMembersNames(Arrays.asList("Stephen","Wakshum","Akrem","Bulent","Andreea","Andrei"));

        //print all members. not toString()
        System.out.println("group2 members = "+group2.getMembersNames());

        //use if statement to check if Akrem is in group2

        if(group2.getMembersNames().contains("Akrem")){
            System.out.println("Akrem is member of group2");
        }else {
            System.out.println("Akrem is not in group2");
        }



    }

}
