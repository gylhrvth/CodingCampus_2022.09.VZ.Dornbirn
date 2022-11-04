package batuhan.games.BlackJackGame;

public class Dealer extends Person{

    //Create a new Dealer


    public Dealer(){
        //Name the dealer "Dealer"

        super.setName("Dealer");
    }
    public boolean hasBlackJack(){
        if (this.getHand().calculatedValue() == 21){
            return true;
        }
        else {
            return false;


        }

    }


    //Prints the dealer` first hand, with one card face down.

    public void printFirstHand(){
        System.out.println("The dealer s hand looks like this:");
        System.out.println(super.getHand().getCard(0));
        System.out.println("The second card is face down.");
    }
}
