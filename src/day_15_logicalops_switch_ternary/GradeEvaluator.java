package day_15_logicalops_switch_ternary;

public class GradeEvaluator {
    public static void main(String[] args) {
        char grade = 'A';
        if (grade == 'A' || grade == 'B' || grade == 'C') {
            System.out.println("You Passed Exam");
    }else if(grade=='D'){
            System.out.println("Quality for retake");
        }else if(grade=='E'){
          System.out.println("Fail");
        }else{
          System.out.println("Invalid grade");

}
    }
}
