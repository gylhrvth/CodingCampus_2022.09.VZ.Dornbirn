package patric.BlackJackConsole;

public class Main {

    public static void main(String[] args) {
        //Say Hello to the user
        System.out.println("***** Welcome to BlackJack-21-Console *****");

        //Create and Start the Game
        Game blackjack = new Game();

//        System.out.println(Suit.CLUB);
//        System.out.println(Rank.ACE + " has a value of " + Rank.ACE.rankValue);

        //Test out the Card class
        //Create a testCard - Ace of Clubs
//        Card testCard = new Card(Suit.CLUB, Rank.ACE);
//        System.out.println(testCard);

        //Make some cards and a deck
        Deck testDeck = new Deck(true);
//        Card aCard = new Card(Suit.CLUB, Rank.QUEEN);
//        Card bCard = new Card(Suit.DIAMOND, Rank.ACE);
//        Card cCard = new Card(Suit.SPADE, Rank.SIX);
//        //Add the cards to the Deck
//        testDeck.addCard(aCard);
//        testDeck.addCard(bCard);
//        testDeck.addCard(cCard);
        //Print deck
        System.out.println(testDeck);

    }
}
