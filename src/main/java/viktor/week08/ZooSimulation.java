package viktor.week08;

public class ZooSimulation {

    public static void main(String[] args) {

        System.out.println("\n");

        Zoo myZoo = new Zoo("Tiergarten Dornbirn",2022);

        Gehege myGehege1 = new Gehege("Alpenwiese");
        Gehege myGehege2 = new Gehege("Ried");
        Gehege myGehege3 = new Gehege("Terrarium (warm)");

        myZoo.putGehegeToZoo(myGehege1);
        myZoo.putGehegeToZoo(myGehege2);
        myZoo.putGehegeToZoo(myGehege3);
        myZoo.putGehegeToZoo(new Gehege("Feldkirch Wildpark"));

        myZoo.removeGehegeFromZoo(myGehege2);
        myZoo.putGehegeToZoo(new Gehege("Ried"));

        Tier tier1 = new Tier("Alfred","Storch");
        Tier tier2 = new Tier("Hugo","Storch");
        Tier tier3 = new Tier("Rijksa","Kuh");

        myGehege1.putTierToGehege(tier1);
        myGehege1.putTierToGehege(tier3);

        myGehege3.putTierToGehege(tier2);

        myZoo.printListWithEnclosures();
        System.out.println("\n");
        //Test des Löschens der Tiere
        myGehege1.removeTierFromGehege(tier1);
        myGehege1.removeTierFromGehege(tier3);
        myZoo.printListWithEnclosures();






    }
}
