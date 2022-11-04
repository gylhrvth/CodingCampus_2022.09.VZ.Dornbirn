package milan.week08.zoo;

public class Aufgabe {

    private String aufgabe;
    private int priorität;

    public Aufgabe(String aufgabe) {
        this(aufgabe, 0);
    }

    public Aufgabe(String aufgabe, int priorität) {
        this.aufgabe = aufgabe;
        this.priorität = priorität;
    }

    public String getAufgabe() {
        return aufgabe;
    }

    public void setAufgabe(String aufgabe) {
        this.aufgabe = aufgabe;
    }

    public int getPriorität() {
        return priorität;
    }

    public void setPriorität(int priorität) {
        this.priorität = priorität;
    }
}
