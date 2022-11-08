package martin.week08;

public class Animal {
    private String name;
    private String gattung;

    public Animal() {
        name = "Wolpertinger";
        gattung = "Fabelwesen";
    }

    public Animal(String name, String gattung) {
        this.name = name;
        this.gattung = gattung;
    }

    @Override
    public String toString() {
        return String.format("%s, %s", name, gattung);
    }
}
