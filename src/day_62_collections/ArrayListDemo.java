package day_62_collections;
import java.util.*;
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> nums=new ArrayList<>();
        List<String>cities=new ArrayList<>();         //polymorphism
        Collection <String> school=new ArrayList<>();
        cities.add("Woodbridge");          //add method from Collection or List interface
        cities.add("Moscow");
        cities.add("Bishkek");
        cities.add("New York");
        System.out.println(cities);
        System.out.println("first city -> "+cities.get(0));
        System.out.println("Count city -> "+cities.size());

    }
}
