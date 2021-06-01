package day_41_arrayList;

import javax.accessibility.AccessibleIcon;
import java.util.ArrayList;

public class Cities {
    public static void main(String[] args) {
        //declare arrayList
        ArrayList<String>cities=new ArrayList<>();
        //add cities to arrayList  =>add methods
        cities.add("Washington DC");
        cities.add("New York");
        cities.add("Woodbridge");
        cities.add("LA");
        cities.add(0,"Ashgabat");
        System.out.print(cities);
        System.out.println();
        System.out.println("First city => "+cities.get(0));
        System.out.println("Last city => "+cities.get(4));
        System.out.println("last city => "+cities.get(cities.size()-1));
        System.out.println(cities.size());      //print count of items in arraylist

        int size=cities.size();
        System.out.println("there are "+size+" cities in the list");

        for (int i=0; i<cities.size()/2;i++){
            System.out.print(cities.get(i)+" ");
            System.out.println();
        }
        for(String each:cities){
            System.out.print(each+" ");
        }
        System.out.println();
        cities.remove(0);
        cities.remove("New York");
        System.out.println(cities);
        cities.clear();                //delete//remove all values from list

        System.out.println(cities);
        if(cities.isEmpty()){
            System.out.println("List is empty");
        }
        if(cities.size()==0){
            System.out.println("List is empty");
        }


    }
}
