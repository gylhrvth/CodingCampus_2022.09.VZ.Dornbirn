package batuhan.games.BlackJackGame;

public abstract class Person {
    private Hand hand;
    private String name;

    //Create a new Person

    public Person(){
        this.hand = new Hand();
        this.name = "";

    }
    public Hand getHand(){
        return this.hand;
    }
    public void setHand(Hand hand){
        this.hand = hand;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    //Prints a formatted version of the Person s Hand

    public void printHand(){
        System.out.println(this.name + "`s hand looks like this:");
        System.out.println(this.hand + " Valued at: " + this.hand.calculatedValue());
    }
}
