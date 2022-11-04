package batuhan.games.BlackJackGame;

import java.util.Scanner;

public class Player extends Person{
    Scanner input = new Scanner(System.in);

    //Creat a new Player
    public  Player(){
        super.setName("Player");
    }

    public void makeDecision(){
    }


    public boolean hasBlackJack(){
        if (this.getHand().calculatedValue() == 21){
            return true;
        }
        else {
            return false;


        }

    }
public void makeDecision(Deck deck,Deck discard){
        int decision =0;
        boolean getNum = true;

        //while were getting a number,,,
    while (getNum){
        try {
            System.out.println("Wolud you like to: \n1) Hit! \n2) Stand");
            decision = input.nextInt();
            getNum= false;
        }

        catch (Exception e){
            System.out.println("Invalid");
            input.next();

        }
        //we don´t close the scanner, beacuse we will need it later
    }
    System.out.println("you selected; "+ decision);

}
}

