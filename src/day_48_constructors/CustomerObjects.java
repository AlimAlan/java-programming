package day_48_constructors;

import java.util.ArrayList;
import java.util.List;

public class CustomerObjects {
    public static void main(String[] args) {
        Customer cs1=new Customer();
        System.out.println(cs1.toString());      //print with default values that are set in no args constructors

        cs1.setID(1);
        cs1.setName("Bob");
        System.out.println(cs1);
        Customer  cs2=new Customer("Mike", 2);
        System.out.println(cs2);
        Customer cs3=new Customer("Timur", 6);
        System.out.println(cs3);


        //array of Customers
        Customer[] todaysCustomers={cs1,cs2,cs3,new Customer("Bashir",449)};
      // System.out.println(todaysCustomers.toString());

        //arrayList of Customers objects

        List<Customer>customerList=new ArrayList<>();
        customerList.add(cs1);
        customerList.add(cs2);
        customerList.add(cs3);
        customerList.add(new Customer("Bashir",449));
        customerList.add(new Customer("Suleyman",3837));
        customerList.add(new Customer("Amina",363763));

        //print info of first customer object in array and arraylist

        System.out.println(todaysCustomers[0].toString());
        System.out.println(customerList.get(0).toString());
        System.out.println(customerList);     //print toString() info all Customers objects

        System.out.println("******FOR LOOP*****");

        for (Customer customer : customerList) {
            System.out.println(customer);
        }
        System.out.println("For Each Loop------------>");
        for (Customer each:customerList) {
            System.out.println(each);

        }

        //print only names of customers in the list
        System.out.println("*****NAMES OF CUSTOMERS*****");

        //forEach method and lambda expression
      customerList.forEach(each-> System.out.println(each.getName()));
        for (Customer each:customerList) {
            System.out.println(each.getName());
        }



    }
}
