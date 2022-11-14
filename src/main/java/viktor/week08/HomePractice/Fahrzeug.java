package viktor.week08.HomePractice;

public class Fahrzeug {

    private String id;
    private String producer;

    public Fahrzeug(String id, String producer) {
        this.id = id;
        this.producer = producer;
    }

    @Override
    public String toString() {
        return "ID: " + id + " " + producer;
    }


}
