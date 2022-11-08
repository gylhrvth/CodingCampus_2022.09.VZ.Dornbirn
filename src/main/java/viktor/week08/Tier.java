package viktor.week08;

public class Tier {

    private String name;
    private String gattung;


    public Tier(String name, String gattung) {
        this.name = name;
        this.gattung = gattung;
    }

    public String getName() {
        return name;
    }

   public void printStructure(){
       System.out.println("|                |---- Tier: " + name + " " + gattung);
   }

}
