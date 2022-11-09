package milan.week08.zoo;

import java.util.Arrays;

public class TestZoo {

    public static void main(String[] args) {

        Zoo tgDornbirn = new Zoo("Tiergarten Dornbirn");
        tgDornbirn.setYearFounding(2022);
        Gehege alpenwiese = new Gehege("Alpenwiese");
        Gehege ried = new Gehege("Ried");
        Gehege terrarium = new Gehege("Terrarium");
        Gehege affenKaefig = new Gehege("Affenkäfig");
        tgDornbirn.addGehegeToList(ried);
        tgDornbirn.addGehegeToList(alpenwiese);
        tgDornbirn.addGehegeToList(terrarium);
        tgDornbirn.addGehegeToList(affenKaefig);

        //Tier erstellung:
        Tier tier1 = new Tier("Rijska", "Kuh", 25);
        Tier tier2 = new Tier("Garmond", "Storch", 10);
        Tier tier3 = new Tier("Hugo", "Storch", 8);
        Tier tier4 = new Tier("Idaxis", "Storch", 12);
        Tier tier5 = new Tier("Samba", "Orang-Utan", 35);
        Tier tier6 = new Tier("Glubschaugi", "Pfeilgiftfrosch", 5);
        Tier tier7 = new Tier("Slytherin", "Schlange", 15);
        Tier tier8 = new Tier("Gideon", "Schimpanse", 15);
        Tier tier9 = new Tier("Marla", "Silberrücken-Gorilla", 40);
        Tier tier10 = new Tier("Brutus", "Wolf", 33);
        Tier tier11 = new Tier("Carla", "Marder", 20);
        Tier tier12 = new Tier("Farul", "Marder", 22);
        Tier tier13 = new Tier("Spikee", "Skorpion", 8);
        Tier tier14 = new Tier("Gustav", "Ziege", 9);

        //Tier zum Gehege:
        terrarium.addAnimalToList(tier13);
        terrarium.addAnimalToList(tier7);
        terrarium.addAnimalToList(tier6);
        affenKaefig.addAnimalToList(tier5);
        affenKaefig.addAnimalToList(tier8);
        affenKaefig.addAnimalToList(tier9);
        ried.addAnimalToList(tier11);
        ried.addAnimalToList(tier12);
        ried.addAnimalToList(tier2);
        ried.addAnimalToList(tier3);
        ried.addAnimalToList(tier4);
        alpenwiese.addAnimalToList(tier1);
        alpenwiese.addAnimalToList(tier10);
        alpenwiese.addAnimalToList(tier14);

        System.out.println(tgDornbirn.printStructureList());

        //Futter anlegen:
        Futter trockenfutter = new Futter("Trockenfutter", 4.99);
        Futter nassfutter = new Futter("Nassfutter", 7.99);
        Futter gras = new Futter("Gras", 0.05);
        Futter insekt = new Futter("Insekt", 0.09);

        //Futter zur Liste:
        tgDornbirn.addFutterToList(trockenfutter);
        tgDornbirn.addFutterToList(nassfutter);
        tgDornbirn.addFutterToList(gras);
        tgDornbirn.addFutterToList(insekt);


        //Futter zum Tier:

        tier7.setNahrung(insekt);
        tier6.setNahrung(insekt);
        tier7.setMenge(0.3);
        tier6.setMenge(0.02);
        tier5.setNahrung(trockenfutter);
        tier5.setMenge(3);
        tier1.setNahrung(gras);
        tier1.setMenge(100);
        tier2.setNahrung(nassfutter);
        tier2.setMenge(0.3);
        tier3.setNahrung(trockenfutter);
        tier3.setMenge(0.35);
        tier4.setNahrung(trockenfutter);
        tier4.setMenge(0.28);
        System.out.println("------------------------");
        //System.out.println(tgDornbirn.printFoodStatistic());
        System.out.println("------------------------");

        for (int i = 1; i <= 20; i++) {
            Tier t = new Tier("Croc " + i, "Krokodil", 40);
            alpenwiese.addAnimalToList(t);
            t.setNahrung(trockenfutter);
            t.setMenge(0.8);
        }

        //Pfleger anlegen:
        Pfleger milan = new Pfleger("Milan");
        Pfleger marie = new Pfleger("Marie");
        Pfleger hans = new Pfleger("Hans");


        //Ärzte anlegen:
        TierArzt johanna = new TierArzt("Johanna");
        TierArzt peter = new TierArzt("Peter");
        TierArzt klaus = new TierArzt("Klaus");

        //Ärzte zum Zoo:
        tgDornbirn.addTierArztToList(johanna);
        tgDornbirn.addTierArztToList(peter);
        tgDornbirn.addTierArztToList(klaus);


        //Pfleger zum Gehege:
        milan.addGehege(terrarium);
        milan.addGehege(ried);
        marie.addGehege(alpenwiese);
        hans.addGehege(affenKaefig);
        hans.addGehege(ried);
        tgDornbirn.addPflegerToList(milan);
        tgDornbirn.addPflegerToList(marie);
        tgDornbirn.addPflegerToList(hans);

        //Aufgaben anlegen:
        Aufgabe beobachten = new Aufgabe("beobachtet");
        Aufgabe kehren = new Aufgabe("kehrt");
        Aufgabe fuettern = new Aufgabe("fuettert");
        Aufgabe wasserAuffuellen = new Aufgabe("füllt Wasser");
        Aufgabe scheibenPutzen = new Aufgabe("putzt die Scheiben");
        Aufgabe wasserFiltern = new Aufgabe("filtert das Wasser");

        //Aufgaben zum Gehege:
        ried.addToDos(fuettern);
        ried.addToDos(beobachten);
        ried.addToDos(wasserAuffuellen);
        alpenwiese.addToDos(fuettern);
        alpenwiese.addToDos(beobachten);
        alpenwiese.addToDos(wasserAuffuellen);
        affenKaefig.addToDos(fuettern);
        affenKaefig.addToDos(beobachten);
        affenKaefig.addToDos(wasserAuffuellen);
        affenKaefig.addToDos(kehren);
        terrarium.addToDos(scheibenPutzen);
        terrarium.addToDos(fuettern);
        terrarium.addToDos(beobachten);
        terrarium.addToDos(wasserAuffuellen);
        terrarium.addToDos(wasserFiltern);

        // Zoo Simulation

        for (int i = 1; i <= 10; i++) {
            System.out.println("Tag " + i + " im Zoo\n");
            tgDornbirn.zooSimulation();
        }

        tgDornbirn.printFoodStatistic();

    }
}
