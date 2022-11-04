package patric.week08.Zoo;

public class Gehege {

    private String description;

    public Gehege(String description) {
        this.description = description;
    }

    public String getGehege() {
        return description;
    }

    public void printGehege() {
        System.out.println("|    |-----Gehege: " + description);
    }

    @Override
    public String toString() {
        return "Gehege{" +
                "description='" + description + '\'' +
                '}';
    }
}
