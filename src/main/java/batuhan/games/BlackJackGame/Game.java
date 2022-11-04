package batuhan.games.BlackJackGame;

public class Game {
    //Create variables used by the Game class
    private Deck deck,discarded;
    private Player player;
    private Dealer dealer;
    private int wins , losses , pushes;

    //Constructor for Game,creates our variables and starts the Game
    public Game(){
        //Create a deck with 52 Cards
       deck = new Deck(true);
        //Create a new empty Deck
        discarded = new Deck();

        //Create the People
        dealer = new Dealer();
        player = new Player();



        //Shuffle the deck and stard the first round
        deck.shuffle();
        startRound();
    }
    //This method will handle the logic for each round
    private void startRound(){

        //Give the player two cards

        dealer.getHand().takeCardFromDeck(deck);
        dealer.getHand().takeCardFromDeck(deck);

        //Give the player two Cards
        player.getHand().takeCardFromDeck(deck);
        player.getHand().takeCardFromDeck(deck);

        //Print their hands

        dealer.printFirstHand();
        player.printHand();

        if (dealer.hasBlackJack()){
            //show the dealer has Blackjack
            dealer.printHand();

            //CCheck iof the player also has BlackJack
            if (player.hasBlackJack()){
                System.out.println("You both have 21 - Push.");
                pushes++;
                startRound();
            }
            else {
                System.out.println("Dealer has BlackJack.\n You lose.");
                dealer.printHand();
                losses++;
                startRound();
            }
        }
        //CHeck if player has Blackjack to start
        //If we got to this pont, we already know the dealer didn`t have blackjack
        if (player.hasBlackJack()){
            System.out.println("You have Blackjack! \n You win");
            wins++;
            startRound();
            player.makeDecision(deck,discarded);
        }

    }
}
