package day_53_inheritance.final_keyword;

public class FinalRunner {
    public static void main(String[] args) {
        System.out.println(TestData.ADMIN_USERNAME);
        final int SSN=325246277;
        //TestData.ADMIN_USERNAME = "change"; ERROR: cannot change value of final variable
        //final int SSN = 432123433;
        //SSN = 12334545; ERROR: variable is final

    }
}
