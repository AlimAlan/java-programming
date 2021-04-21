package day_15_logicalops_switch_ternary;

public class AndOperatorPractice {
    public static void main(String[] args) {
        boolean onSale=true;
        boolean freeShipping = true;
        String itemName="Wooden Spoon";

        if(onSale&&freeShipping){
            System.out.println("Adding to cart - "+itemName);
        }else {
            System.out.println("Continue shopping for good deals on-"+itemName);

        }
        if(freeShipping&&onSale&&itemName.equals("Wooden spoon")){
            System.out.println("Add to cart - "+itemName);

        }else{
            System.out.println("Continue shopping for good deals - "+itemName);

        }

    }
}
