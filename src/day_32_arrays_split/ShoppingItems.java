package day_32_arrays_split;

public class ShoppingItems {
    public static void main(String[]args){
        String []items={"Shoes","Jacket","Gloves","Airpods","Ipad","iphone case"};
        double[]prices = {99.99, 150.0,9.99,250.0,439.50,39.99};
        int[]itemIDs   = {12345, 12346,12347,12348,12349,12350};

        System.out.println("---------FIND THE INDEX OF 'Gloves' in items array-------");
        int indexOfGloves=0;
        for (int i=0; i<items.length; i++) {
            if (items[i].equals("Gloves")) {
                //  System.out.println(i+"-"+items[i]);
                System.out.println("Gloves found at index " + i);
                //  break;
            }
            }
            System.out.println("----------Set boolean to true if 'IPAD' is found ");
            boolean IpadExists = false;
        //    for(int i=0;i<items.length; i++){
          //      if(items[i].equals("Ipad")){
            //        IpadExists=true;

        for(String item: items) {
            if (item.equalsIgnoreCase("ipad")) {
                IpadExists = true;
                break;
            }
        }
                    System.out.println("Ipad Exists "+ IpadExists);
        if(IpadExists){
            System.out.println("We bought the Ipad");
        }else{
            System.out.println("We forgot the Ipad");

        }
        System.out.println("*****Print a report of each shopping item*****");
        System.out.println(items[0]+" $"+prices[0]);
        for(int i=0; i<items.length; i++) {
            System.out.println(items[i] + " - $" + prices[i] + " -# " + itemIDs[i]);
        }
        System.out.println("****LOOK FOR 'JACKET' in items and print all details");
        for(int i=0;i<items.length; i++){
            if(items[i].equals("Jacket")){
                System.out.println(items[i]+" - $ "+prices[i]+" - # "+itemIDs[i]);
                break;
            }
        }
        }


        }






