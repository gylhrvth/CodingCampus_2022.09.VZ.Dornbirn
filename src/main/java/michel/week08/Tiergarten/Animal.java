package michel.week08.Tiergarten;

public class Animal {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGattung() {
        return gattung;
    }

    public void setGattung(String gattung) {
        this.gattung = gattung;
    }

    private String name;
    private String gattung;

    public Animal(String name, String gattung){
        this.name=name;
        this.gattung=gattung;
    }
    public String toString(){
        return name + ", " + gattung;
    }
}
