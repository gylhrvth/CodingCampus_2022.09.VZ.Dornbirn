package milan.week08.zoo;

import java.util.Arrays;

public class TestZoo {

    public static void main(String[] args) {

        Tag montag = new Tag();
        Zoo zoo1 = new Zoo("Tiergarten Dornbirn");
        zoo1.setYearFounding(2022);
        Gehege alpenwiese = new Gehege("Alpenwiese");
        Gehege ried = new Gehege("Ried");
        Gehege terrarium = new Gehege("Terrarium");
        Gehege affenKaefig = new Gehege("Affenkäfig");
        zoo1.addGehegeToList(ried);
        zoo1.addGehegeToList(alpenwiese);
        zoo1.addGehegeToList(terrarium);
        zoo1.addGehegeToList(affenKaefig);

        //Tier erstellung:
        Tier tier1 = new Tier("Rijska", "Kuh");
        Tier tier2 = new Tier("Garmond","Storch");
        Tier tier3 = new Tier("Hugo", "Storch");
        Tier tier4 = new Tier("Idaxis", "Storch");
        Tier tier5 = new Tier("Samba", "Orang-Utan");
        Tier tier6 = new Tier("Glubschaugi","Pfeilgiftfrosch");
        Tier tier7 = new Tier("Slytherin","Schlange");
        Tier tier8 = new Tier("Gideon", "Schimpanse");
        Tier tier9 = new Tier("Marla", "Silberrücken-Gorilla");
        Tier tier10 = new Tier("Brutus", "Wolf");
        Tier tier11 = new Tier("Carla", "Marder");
        Tier tier12 = new Tier("Farul", "Marder");
        Tier tier13 = new Tier("Spikee", "Skorpion");
        Tier tier14 = new Tier("Gustav", "Ziege");

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

        System.out.println(zoo1.printStructureList());

        //Futter anlegen:
        Futter trockenfutter = new Futter("Trockenfutter", 4.99);
        Futter nassfutter = new Futter("Nassfutter", 7.99);
        Futter gras = new Futter("Gras", 0.05);
        Futter insekt = new Futter("Insekt", 0.09);

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
        //System.out.println(zoo1.printFoodStatistic());
        System.out.println("------------------------");

        //Pfleger anlegen:
        Pfleger milan = new Pfleger("Milan");
        Pfleger marie = new Pfleger("Marie");
        Pfleger hans = new Pfleger("Hans");

        //Pfleger zum Gehege:
        milan.addGehege(terrarium);
        milan.addGehege(ried);
        marie.addGehege(alpenwiese);
        hans.addGehege(affenKaefig);
        hans.addGehege(ried);
        zoo1.addPflegerToList(milan);
        zoo1.addPflegerToList(marie);
        zoo1.addPflegerToList(hans);

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

        //Arbeitsauftrag erteilen:
        zoo1.zooSimulation();


        System.out.println(ried.getStatusText());
        System.out.println(affenKaefig.getStatusText());
        System.out.println(terrarium.getStatusText());
        System.out.println(alpenwiese.getStatusText());
        montag.endOfDay(zoo1);
        System.out.println(ried.getStatusText());
        System.out.println(affenKaefig.getStatusText());
        System.out.println(terrarium.getStatusText());
        System.out.println(alpenwiese.getStatusText());
        milan.getToTheChoppa();
        marie.getToTheChoppa();
        hans.getToTheChoppa();
        System.out.println(ried.getStatusText());
        System.out.println(affenKaefig.getStatusText());
        System.out.println(terrarium.getStatusText());
        System.out.println(alpenwiese.getStatusText());

    }
}
