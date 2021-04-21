package officeHours;

public class NumberDevisibleBy235 {
    public static void main(String[] args) {
        int number=65;
        boolean by2= number%2==0;
        boolean by3=number%3==0;
        boolean by4=number%4==0;

        System.out.println(number+"is divisible by 2: "+by2);
        System.out.println(number+ " is devisible by 3: "+ by3);


    }

}
