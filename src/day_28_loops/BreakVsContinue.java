package day_28_loops;

public class BreakVsContinue {
    public static void main(String[] args) {

        for(int i=1; i<=5; i++ ){

            System.out.println(i);
            if(i==3) {


                break;
            }

            }
        for(int i =1; i<=5; i++){
            if(i==2 || i==4){
                continue;             //go to next    skip code below
            }
            System.out.print(i);
        }
        }

    }
