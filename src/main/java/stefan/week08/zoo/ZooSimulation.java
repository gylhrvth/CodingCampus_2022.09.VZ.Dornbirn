package stefan.week08.zoo;


public class ZooSimulation {


    public static void main(String[] args) {

        Zoo myZoo = new Zoo("Wildpark", 1963);


        Gehege alpenwiese = new Gehege("Alpenwiese");
        Gehege ried = new Gehege("Ried");
        Gehege terrarium = new Gehege("Terrarium");

        Tier tier1 = new Tier("Kuh", "Milka");
        Tier tier2 = new Tier("Roadrunner", "Strauß");
        Tier tier3 = new Tier("Cobra", "Schlange");
        Tier tier4 = new Tier("Skorpion", "Scorpionidae");
//
//        Futter f1 = new Futter("Grass", 20, 120);
//        Futter f2 = new Futter("Maus", 5, 6);
//        Futter f3 = new Futter("Maus", 12, 5);


        Pfleger p1 = new Pfleger("Sandra");
        Pfleger p2 = new Pfleger("Alex");
        Pfleger p3 = new Pfleger("Thomas");
        Pfleger p4 = new Pfleger("Tim");

        Aufgaben futtern = new Aufgaben("Futtert");
        Aufgaben putzen = new Aufgaben("Putzt");
        Aufgaben krontroliert = new Aufgaben("krontroliert");
        Aufgaben beobachten = new Aufgaben("beobachten");


        terrarium.addTier(tier4);
        terrarium.addTier(tier3);
        alpenwiese.addTier(tier1);
        ried.addTier(tier2);


        myZoo.addGehege(alpenwiese);
        myZoo.addGehege(ried);
        myZoo.addGehege(terrarium);

        myZoo.addMitarbeiterliest(p1);
        myZoo.addMitarbeiterliest(p2);
        myZoo.addMitarbeiterliest(p3);
        myZoo.addMitarbeiterliest(p4);
        System.out.println(myZoo.printGehegelist());


        alpenwiese.addAufgaben(futtern);
        ried.addAufgabe(putzen);
        ried.addAufgaben(beobachten);
        alpenwiese.addAufgabe(krontroliert);
        terrarium.addAufgabe(putzen);
        terrarium.addAufgaben(krontroliert);


        p3.addGehege(terrarium);
        p2.addGehege(ried);
        p1.addGehege(alpenwiese, terrarium, ried);
        p4.addGehege(terrarium, alpenwiese);




        for (int i = 1; i <= 5; i++) {
            System.out.println();
            System.out.println();
            System.out.println("=== Day" +i + " ===");

            myZoo.resetGehegeStatus();
            myZoo.simulate();

            System.out.println();
        }

        //System.out.print(f1.getFuttername() + "\t" + f1.getEinheit() + "kg\t" + f1.getPreis() + "Euro");

//        List<Tier> tierliest = new ArrayList<>();
//        tier1.setFutter(f1, 20);
//        tier2.setFutter(f2, 4);

//        tierliest.add(tier1);
//        tierliest.add(tier2);
//        // tierliest.add(tier3);


    }

}

