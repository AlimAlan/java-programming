package day_48_constructors;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private String groupName;
    private List <String> membersNames=new ArrayList<>();

    //constructor that accepts a name

    public Group(String groupName){
        this.groupName=groupName;
    }

    public void  addMember(String newMember){
        membersNames.add(newMember);

    }
    public void removeMember(String memberName){
        membersNames.remove(memberName);
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupName='" + groupName + '\'' +
                ", membersNames=" + membersNames +
                '}';
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public List<String> getMembersNames() {
        return membersNames;
    }

    public void setMembersNames(List<String> membersNames) {
        this.membersNames = membersNames;
    }





}
