package batuhan.games.BlackJackGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {

    private ArrayList<Card> deck;

    public Deck() {
        deck = new ArrayList<Card>();
    }

    public void addCard(Card card) {
        deck.add(card);
    }

    public String toSting() {
        //A string to hold everything we`re going to return
    String output = "";


    //for each Card"card" in the deck


        for (Card card: deck){
            //add the card and the escape charater fpr a new line
            output += card;
            output += "\n";

        }
        return output;

    }

    public Deck (boolean makeDeck){
        deck = new ArrayList<Card>();
        if (makeDeck){
            //go through all the suits
            for (Suit suit : Suit.values()){
                //go through all the ranks
                for (Rank rank : Rank.values()){
                    //add a new Ca rd containing each iterations suit and rank
                deck.add(new Card(suit, rank));
                }
            }
        }
    }

    public void shuffle(){
//        ArrayList<Card> shuffled = new ArrayList<Card>();
        //iterate through the size of the deck, so deck , so each card can be pulled
//        while (deck.size()>0){
//            //Select a random index to pull
//            int cardToPull = (int)(Math.random() * (deck.size()-1));
//            //Add this random card to the new shuffled deck
//            shuffled.add(deck.get(cardToPull));
//            //Remove the pulled card form the original deck
//            deck.remove(cardToPull);
//        }
     Collections.shuffle(deck,new Random());

//        deck = shuffled;
    }


    public Card takeCard(){
        //take a copy of the first card from the deck
        Card cardToTake = new Card((deck.get(0)));
        //Remove the card from the deck
        deck.remove(0);
        //Give the card back
        return cardToTake;
    }
}
