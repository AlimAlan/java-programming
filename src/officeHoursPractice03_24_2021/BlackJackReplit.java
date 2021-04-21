package officeHoursPractice03_24_2021;
/*
In blackjack after the player asks to keep the house 4 things may happen.

        if the card total is bigger then 21 the player busts.

        if the house score is bigger then the player, the player loses .

        if the player score is equal to the house then they are a draw.

        if the player score is bigger then the house the player wins.

                player and house scores are represented by player and house int variables.

        check them using ifs to determine the result.
    }
    input:  8
            21

        output:
       player win
 */
import java.util.Scanner;
public class BlackJackReplit {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int cardTotal=scan.nextInt();
        int player=scan.nextInt();
        int houseScore=scan.nextInt();


        if(cardTotal>21){
            System.out.println("Player busts");
        }else if(houseScore>player){
            System.out.println("Player loses");
        }else if(player==houseScore){
            System.out.println("a draw");
        }else if(player>houseScore){
            System.out.println("player wins");
        }

    }
}