package day_15_logicalops_switch_ternary;

public class UsedCarSelector {
    public static void main(String[] args) {
        double budget=5000;
        String model="toyota";
        double carPrice=4500;

        if(carPrice<=budget &&model.equals("toyota")||model.equals("honda")){
            System.out.println("Ready to purchase model ="+model+" price="+carPrice);

        }else{
            System.out.println("Not interested in model = "+model);

        }
    }
}
