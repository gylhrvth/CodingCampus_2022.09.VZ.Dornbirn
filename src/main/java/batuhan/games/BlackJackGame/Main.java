package batuhan.games.BlackJackGame;

public class Main {
    public static void main(String[] args) {
        //Say hi to the user
        System.out.println("Welcome to Blackjack");

        //Create and start the Game
        Game blackjack = new Game();

        Dealer myDealer = new Dealer();
        System.out.println("The Dealer s name is: " + myDealer.getName());
       //Test out Card class
        //Create a testCard - Ace of Clubs
        Deck testDeck = new Deck();
        testDeck.addCard(new Card(Suit.CLUB, Rank.ACE));
        testDeck.addCard(new Card(Suit.CLUB, Rank.ACE));
        testDeck.addCard(new Card(Suit.CLUB, Rank.ACE));
        testDeck.addCard(new Card(Suit.CLUB, Rank.ACE));
        Hand testHand = new Hand();
        testHand.takeCardFromDeck(testDeck);
        testHand.takeCardFromDeck(testDeck);
        testHand.takeCardFromDeck(testDeck);
        testHand.takeCardFromDeck(testDeck);
        System.out.println("The value of this hand is: " + testHand.calculatedValue());



    }
}
