package viktor.week08;

import patric.week08.Zoo.Tier;

//public class ZooSimulation {

//    public static void main(String[] args) {

//        System.out.println("\n");
//
//        Zoo myZoo = new Zoo("Tiergarten Dornbirn", 2022);
//
//        Gehege myGehege1 = new Gehege("Alpenwiese");
//        Gehege myGehege2 = new Gehege("Ried");
//        Gehege myGehege3 = new Gehege("Terrarium (warm)");
//
//        myZoo.putGehegeToZoo(myGehege1);
//        myZoo.putGehegeToZoo(myGehege2);
//        myZoo.putGehegeToZoo(myGehege3);
//        myZoo.putGehegeToZoo(new Gehege("Feldkirch Wildpark"));
//
//        myZoo.removeGehegeFromZoo(myGehege2);
//        myZoo.putGehegeToZoo(new Gehege("Ried"));
//
//        Tier tier1 = new Tier("Alfred", "Storch",100,50,60);
//        Tier tier2 = new Tier("Hugo", "Storch",100,50,60);
//        Tier tier3 = new Tier("Rijksa", "Kuh",100,50,60);
//
//        myGehege1.putTierToGehege(tier1);
//        myGehege1.putTierToGehege(tier3);
//
//        myGehege3.putTierToGehege(tier2);
//
//        myZoo.printListWithEnclosures();
//        System.out.println("\n");
//
//        //Futter anlegen
//        Futter f = new Futter("Kern", "kg", 1.5);
//        Futter f2 = new Futter("Obst", "kg", 1.8);
//        //Tier futtern
//        System.out.println("Tagesversorgung: ");
//        myZoo.putFoodToAnimal(f, 300);
//        myZoo.putFoodToAnimal(f2, 100);
//
//        myZoo.showAllFoods();
//        System.out.println("\n");
//
//        Pfleger p = new Pfleger("Stefan");
//        Pfleger p2 = new Pfleger("Daniel");
//
//        /* Andere Idee - Aufgaben dem Pfleger geben
//        String[] tasks = new String[]{"Rasen mähen", "Müll entsorgen", "Futter bestellen", "Waschen"};
//
//
//        for(String task : tasks) {
//            p.putTasksToMaintener(task);
//        }*/
//
//        p.putTasksToMaintener("Rasen mähen");
//        p.putTasksToMaintener("Müll entsorgen");
//        p.putTasksToMaintener("Futter bestellen");
//
//        p2.putTasksToMaintener("Futter bestellen");
//        p2.putTasksToMaintener("Käfig reparieren");
//        p2.putTasksToMaintener("Heke gießen");
//
//
//
//        myGehege1.putMaintenerToGehege(p);
//        myGehege3.putMaintenerToGehege(p2);
//        myZoo.printListWithEnclosures();
//
//
//        //System.out.println("\n");
//        //Test des Löschens der Tiere
//        //myGehege1.removeTierFromGehege(tier1);
//        //myGehege1.removeTierFromGehege(tier3);
//        //myZoo.printListWithEnclosures();
//
//
//    }
//}
