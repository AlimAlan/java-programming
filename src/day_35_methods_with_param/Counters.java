package day_35_methods_with_param;

public class Counters {
    public static void main(String[] args) {
        count(6);
        count(7);
        count(2);
        int num=99;
        count(num);
        String word="wooden spoon";
        count(word.length());
        printAge(1991);
        int bithYear=2001;
        printAge(bithYear);
    }
    public static void count(int num){
        for(int i=0; i<=num; i++){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void printAge(int year){
        int age=2021-year;
            System.out.println("Birth year: " + age);
        }
    }

