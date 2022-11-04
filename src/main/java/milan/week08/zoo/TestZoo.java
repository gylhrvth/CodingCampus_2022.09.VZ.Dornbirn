package milan.week08.zoo;

public class TestZoo {
    public static void main(String[] args) {

        Zoo zoo1 = new Zoo("Tiergarten Dornbirn");
        zoo1.setYearFounding(2022);
        Gehege alpenwiese = new Gehege("Alpenwiese");
        Gehege ried = new Gehege("Ried");
        Gehege terrarium = new Gehege("Terrarium (warm)");
        Gehege affenKaefig = new Gehege("Affenkäfig");
        zoo1.addGehegeToList(ried);
        zoo1.addGehegeToList(alpenwiese);
        zoo1.addGehegeToList(terrarium);
        zoo1.addGehegeToList(affenKaefig);
        Tier tier1 = new Tier("Rijska", "Kuh");
        Tier tier2 = new Tier("Garmond","Storch");
        Tier tier3 = new Tier("Hugo", "Storch");
        Tier tier4 = new Tier("Idaxis", "Storch");
        Tier tier5 = new Tier("Samba", "Orang-Utan");
        Tier tier6 = new Tier("Glubschaugi","Pfeilgiftfrosch");
        terrarium.addAnimalToList(tier6);
        affenKaefig.addAnimalToList(tier5);
        ried.addAnimalToList(tier2);
        ried.addAnimalToList(tier3);
        ried.addAnimalToList(tier4);
        alpenwiese.addAnimalToList(tier1);
        System.out.println(zoo1.printStructureList());
        Futter trockenfutter = new Futter("Trockenfutter", 4.99);
        Futter nassfutter = new Futter("Nassfutter", 7.99);
        Futter gras = new Futter("Gras", 0.05);
        Futter insekt = new Futter("Insekt", 0.9);
        tier6.setNahrung(insekt);
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
        System.out.println(zoo1.printFoodStatistic());
        Pfleger milan = new Pfleger("Milan");
        Aufgabe kehren = new Aufgabe("kehren");
        Aufgabe fuettern = new Aufgabe("fuettern");
        Aufgabe wasserAuffuellen = new Aufgabe("Wasser auffüllen");
        Aufgabe scheibenPutzen = new Aufgabe("Scheiben putzen");



    }
}
