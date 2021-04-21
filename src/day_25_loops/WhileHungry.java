package day_25_loops;

public class WhileHungry {
    public static void main(String[] args) {
        int bananas=0;
        boolean isHungry=true;
        int countToFull=3;
        //while (isHungry || bananas <=countToFull)

        while (isHungry){
            bananas++;
            System.out.println("Eat Bananas  \uD83C\uDF4C "+bananas);
         //   isHungry=bananas==countToFull?false:true;
           if (bananas==countToFull) {
              isHungry=false;
            }

        }
        System.out.println("Had enough bananas. Lets get back to study");
    }

}
