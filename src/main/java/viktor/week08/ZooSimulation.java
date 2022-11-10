package viktor.week08;

public class ZooSimulation {

    public static void main(String[] args) {

        System.out.println("\n");

        Zoo myZoo = new Zoo("Tiergarten Dornbirn", 2022);

        Gehege terrarium = myZoo.putGehegeToZoo("Terrarium");
        Gehege feldkirch = myZoo.putGehegeToZoo("Feldkirch-Wildpark");
        Gehege alpenwiese = myZoo.putGehegeToZoo("Alpenwiese");
        Gehege ried = myZoo.putGehegeToZoo("Ried");


        Tier tier1 = myZoo.putTierToGehege("Alpenwiese","Rijska","Kuh");
        Tier tier2 = myZoo.putTierToGehege("Ried","Garmond","Storh");
        Tier tier3 = myZoo.putTierToGehege("Ried", "Hugo","Storh");
        Tier tier4 = myZoo.putTierToGehege("Terrarium","Idaxis","Storh");
        Tier tier5 = myZoo.putTierToGehege("Feldkirch-Wildpark","Jack","Wildkatze");



        myZoo.putPflegerToGehege("Stefan","Alpenwiese","Ried");

        //Tier löschen
        feldkirch.removeTier(tier5);
        ried.removeTier(tier2);
        ried.removeTier(tier3);

        //Tier in einem anderen Gehege anlegen
        terrarium.putTierToGehege("Jack","Wildkatze");


        myZoo.printListWithEnclosures();

        System.out.println("-----------------------------------------------");
        System.out.println("Simulation:");
        for(int i=1; i <=5; i++){
            System.out.println(i+".Arbeitstag beginnt" );
            myZoo.simulateDay();
            terrarium.showAnimal();
            System.out.println();
        }

    }
}
