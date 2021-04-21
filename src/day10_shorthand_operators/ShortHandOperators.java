package day10_shorthand_operators;

public class ShortHandOperators {
    public static void main(String[] args) {
        int cars = 10;
        System.out.println("Cars in parking lot= "+cars);
        cars=cars+2;
        System.out.println("cars in parking lot = " + cars);
        cars+=5;
        System.out.println("cars in parking lot= "+cars);

        cars-=6;
        System.out.println("cars in the parking lot  = " + cars);

        cars=cars-1;
        System.out.println("cars = " + cars);
        cars-=1;
        System.out.println("cars = " + cars);


        int electricCars=13;
       // electricCars+=13;
        //cars=cars+electricCars;
        cars+=electricCars;


        System.out.println("electricCars = " + cars);

        String word = "JAVA";
        System.out.println("word = " + word);

        word = word+"programming";
        System.out.println("word = " + word);
        word+=" is fun";
        System.out.println("word = " + word);

        String selenium = " but selenium is more fun. ";
        selenium+="is more fun.";
        System.out.println("selenium = " + selenium);

        String selenium1 =  " but \"selenium\" is more fun. ";
        word+= selenium1;
        System.out.println("word = " + selenium1);

        word+=12345;
        System.out.println("word = " + word);


        char letter= 'A';
        System.out.println("letter = " + letter);

        letter += 3;
        System.out.println("letter = " + letter);

        letter += 1;
        System.out.println("letter = " + letter);

        double parkingFee=7.50;
        System.out.println("normal parking fee = " + parkingFee);
        //early bird fee is 50 off

        parkingFee/=2;
        System.out.println("early parking Fee is  = " + parkingFee);

        //weekend parking is free

        parkingFee-=parkingFee;
        System.out.println("weekend parking Fee = " + parkingFee);














    }
}
