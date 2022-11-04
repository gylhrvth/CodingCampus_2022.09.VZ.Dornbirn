package batuhan.games.BlackJackGame;




//Contains the suits of Card,Names
public enum Suit {
    CLUB("Club"),
    DIAMOND("Diamonds"),
    HEART("Hearts"),
    SPADE("Spades");
    String suitName;

    Suit(String suitName){
        this.suitName =  suitName;
    }
    public String toSting(){
        return suitName;
    }
}
