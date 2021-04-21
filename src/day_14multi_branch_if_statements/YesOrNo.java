package day_14multi_branch_if_statements;

public class YesOrNo {
    public static void main(String[] args) {
        System.out.println("Are you sure you want to delete this file?");
        char selection = 'y';
        boolean answer=true;
        if (selection== 'y'){
        System.out.println("your file will be deleted");

            }else{
            System.out.println("File deletion cancelled");
            answer=false;

        }
        System.out.println("Did file get deleted? - "+answer);

    }

}
