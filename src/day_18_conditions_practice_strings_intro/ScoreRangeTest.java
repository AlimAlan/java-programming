package day_18_conditions_practice_strings_intro;

public class ScoreRangeTest {
    public static void main (String []args) {
        int score = 100;
        if(score>=1 && score<=40) {
            System.out.println ("D");

        }else if(score>=41 && score<=60){
            System.out.println("C");

        }else if(score>=61 && score<=91){
            System.out.println ("B");


        }else if (score>=91 && score<=101){
            System.out.println("A");

        }

    }
}
