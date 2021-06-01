package day_41_arrayList;

import java.util.ArrayList;
import java.util.List;

public class UpdatingArrayList {
    public static void main(String[] args) {
        //cars list
        List<String>myCars=new ArrayList<>();
        myCars.add("Hyundai");
        myCars.add("Land Rover");
        myCars.add("Lexus");
        myCars.add("Tesla");
        myCars.add(0,"Porshe");
        myCars.add(1,"Cadillac");
        myCars.add(2,"Buggati");
        System.out.println(myCars.toString());
        String allCarsIn1St=myCars.toString();
        System.out.println("al carsIn1St = "+allCarsIn1St);
       myCars.set(0,"Mercedes");
        System.out.println("after set = "+myCars.toString());
        myCars.set(4, "Mazda");
        System.out.println("After set Mazda = "+myCars.toString());

        /**
         * How would you do that if myCars was array?
         * myCars[4]="Honda";
         */
        //find the index number of "Mazda";
        System.out.println("Index of Porshe => "+myCars.indexOf("Mazda"));
       int BuGGAti= myCars.indexOf("Buggati");
        System.out.println("BuGGAti = " + BuGGAti);
        myCars.set(BuGGAti, "BMW");              //change Buggati to BMW
        System.out.println("After set to BMW => "+myCars);
        System.out.println(myCars.indexOf("Hyundai"));

        myCars.set(myCars.indexOf("Hyundai"),"Ferrari");

        System.out.println(myCars);

        if(myCars.contains("Ferrari")){
            myCars.set(myCars.indexOf("Ferrari"), "Volvo");
        }else{
            System.out.println("Ferrari is not found");
        }
        System.out.println("after set Volvo => "+myCars.toString());

        for(int i=0; i<myCars.size();i++){
            if(myCars.get(i).equalsIgnoreCase("Cadillac")){
                myCars.set(i,"audi");
            }else if( myCars.get(i).equalsIgnoreCase("Mazda")){
                myCars.set(i, "Honda");
            }else if(myCars.get(i).equalsIgnoreCase("Mercedes")){
                myCars.set(i,"NIVA");
            }
        }
        System.out.println(myCars);





    }
}
