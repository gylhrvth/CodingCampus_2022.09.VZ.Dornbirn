package gyula.week08.fahrzeug;

public class Fahrzeug {
    private String id;
    private String hersteller;

    public Fahrzeug(String id, String hersteller){
        this.id = id;
        this.hersteller = hersteller;
    }

    @Override
    public String toString() {
        return hersteller + " -> " + id;
    }

}
