package patric.week08.BlackJackConsole;

import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> deck;

    public Deck(boolean makeDeck) {
        deck = new ArrayList<Card>();
        if (makeDeck){
            //Go through all the suits
            for (Suit suit:Suit.values()){
                //Go through all the ranks
                for (Rank rank: Rank.values()){
                    //add a new card containing each iteration's suit and rank
                    deck.add(new Card(suit,rank));
                }
            }
        }
    }

    public void addCard(Card card) {
        deck.add(card);
    }

    public String toString() {
        //A string to hold everything we´re going return
        String output = "";

        //for each Card "card" in the Deck
        for (Card card : deck) {
            //add the card and the escape character for a new line
            output += card;
            output += "\n";
        }
        return output;
    }

}
