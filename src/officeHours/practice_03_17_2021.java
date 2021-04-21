package officeHours;

public class practice_03_17_2021 {
    public static void main(String[] args) {
        String name= "Canyon";
        double price, rating;
        boolean  gated, allowPets;
        switch ("Canyon"){
            case"Canyon":
                price = 201000;
                rating =4.8;
                gated = false;
                allowPets =false;
                break;
            case "Oaks":
                    price =75000;
                    rating = 3.5;
                    gated =true;
                    allowPets =true;
                    break;
            case "Hills":
                price =89000;
                rating =4.0;
                gated=true;
                allowPets=true;
                break;
            default:

                name = "Invalid name";
                price = 0;
                rating = 0;
                gated = false;
                allowPets = false;

        }
        System.out.println("name = " + name);
        System.out.println("price = " + price);
        System.out.println("rating = " + rating);
        System.out.println("gated = " + gated);
        System.out.println("allowsPets = " + allowPets);


    }
}
