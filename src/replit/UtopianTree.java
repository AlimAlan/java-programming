package replit;

/**
 * The Utopian Tree grows exactly 1 cm for the first three years,
 * and after that it grows by 2 cm every year. Show 10 years of growth of the Utopian Tree.
 */
public class UtopianTree {
    public static void main(String[] args) {
        int treesize = 0;
        int year = 0;
        for (int i = 1; i <=10; i++) {

            if(i<=3){
                treesize++;
                System.out.println("year : "+i+" - growth "+treesize);
                System.out.println(treesize);
            }else if(i>3){
                treesize+=2;
                System.out.println("year : "+i+" - growth "+treesize);
                System.out.println(treesize);

            }
        }

    }
}

