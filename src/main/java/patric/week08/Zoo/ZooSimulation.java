package patric.week08.Zoo;

import java.util.Map;

public class ZooSimulation {

    public static void main(String[] args) {

        System.out.println();

        Zoo myZoo = new Zoo("Tiergarten Dornbirn", 2022);

        Gehege myGehege1 = new Gehege("Alpenwiese");
        Gehege myGehege2 = new Gehege("Ried");
        Gehege myGehege3 = new Gehege("Terrarium (warm)");

        myZoo.putGehegeToZoo(myGehege1);
        myZoo.putGehegeToZoo(myGehege2);
        myZoo.putGehegeToZoo(myGehege3);

        Gehege wasserwelt = new Gehege("Wasserwelt");
        Gehege riedNeu = new Gehege("Ried Neu");
        myZoo.putGehegeToZoo(wasserwelt);
        myZoo.putGehegeToZoo(riedNeu);

        myZoo.removeGehegeFromZoo(myGehege2);

        //Futter Erstellung
        Futter kitkat = new Futter("KitKat", "500g Dose", 1.79);
        Futter trocken = new Futter("Trockenfutter", "300g Pack", 3.99);
        Futter flocken = new Futter("Fischflocken", "5g", 0.09);
        Futter heu = new Futter("Heu", "1 Ballen", 20.0);
        Futter besucher = new Futter("Zoo Besucher", "Stk", 0.0);

        //Gehege hinzufügen mit Liste
        //Gehege neuRied = myZoo.getGehegeList().get(myZoo.getGehegeList().size() - 1);

        Tier tier1 = new Tier("Alfredo", "Gecko");
        Tier tier2 = new Tier("Rijska", "Kuh");
        Tier tier3 = new Tier("Hugo", "Storch");
        Tier tier4 = new Tier("Gustaf", "Fisch");
        wasserwelt.putTierToGehege(tier4);
        Tier tier5 = new Tier("Idaxis", "Storch");
        Tier tier6 = new Tier("Schorscherl", "Fisch");
        Tier tier7 = new Tier("Oarsch", "Gecko");
        Tier tier8 = new Tier("Ossi", "Kuh");
        Tier tier9 = new Tier("Buschla", "Kuh");


        riedNeu.putTierToGehege(tier5);
        myGehege1.putTierToGehege(tier2);
        myGehege1.putTierToGehege(tier5);
        myGehege1.putTierToGehege(tier6);
        riedNeu.putTierToGehege(tier3);
        myGehege3.putTierToGehege(tier1);
        myGehege3.putTierToGehege(tier7);
        myGehege1.putTierToGehege(tier8);
        myGehege1.putTierToGehege(tier9);

        myGehege1.removeTierFromGehege(tier6);
        wasserwelt.putTierToGehege(tier6);

        myGehege1.removeTierFromGehege(tier5);






//        System.out.println("Wieviel kostet die Tiernahrung");
//        double overallPrice = 0;
//        //für jedes Tier:
//        overallPrice += tier1.getFutterToTier().getEinheitPreis() * tier1.getAmountOfFutter();
//        overallPrice += tier2.getFutterToTier().getEinheitPreis() * tier2.getAmountOfFutter();
//        overallPrice += tier3.getFutterToTier().getEinheitPreis() * tier3.getAmountOfFutter();
//        overallPrice += tier4.getFutterToTier().getEinheitPreis() * tier4.getAmountOfFutter();
//        overallPrice += tier5.getFutterToTier().getEinheitPreis() * tier5.getAmountOfFutter();
//        overallPrice += tier6.getFutterToTier().getEinheitPreis() * tier6.getAmountOfFutter();

//        List<Tier> tierList = new ArrayList<>();
//        tierList.add(tier1);
//        tierList.add(tier2);
//        tierList.add(tier3);
//        tierList.add(tier4);
//        tierList.add(tier5);
//        tierList.add(tier6);
//
//        //Futter wird als Schlüssel verwendet
//        //der Wert ist die Menge vom Futter
//        Map<Futter, Double> futterAmountMap = new HashMap<>();
//
//        for(Tier t : tierList) {
//            Futter currentFutter = t.getFutterToTier();
//            Double currentSumOfTierFutter = futterAmountMap.get(currentFutter);
//            if(currentSumOfTierFutter == null) {
//                currentSumOfTierFutter = t.getAmountOfFutter();
//            } else {
//                currentSumOfTierFutter += t.getAmountOfFutter();
//            }
//            futterAmountMap.put(currentFutter, currentSumOfTierFutter);
//        }

        Map<Futter, Double> futterAmountMap = myZoo.calculateFoodMap();

        System.out.println("Tagesbedarf Futter:");
        System.out.println();
        for (Futter f : futterAmountMap.keySet()) {
            System.out.println(f.getName() + ": " + futterAmountMap.get(f) + " x " + f.getEinheit());
        }

        /*
        System.out.println("Heu: "+ futterAmountMap.get(heu)+" x "+heu.getEinheit());
        System.out.println("Trocken: "+ futterAmountMap.get(trocken)+" x " +trocken.getEinheit());
        System.out.println("Flocken: "+ futterAmountMap.get(flocken)+" x "+flocken.getEinheit());
        System.out.println("Kitkat: "+ futterAmountMap.get(kitkat)+" x "+kitkat.getEinheit());
         */

//        for(Map.Entry<Futter, Double> futterEntry: futterAmountMap.entrySet()) {
//            System.out.println("Futter: "+futterEntry.getKey().getName()+ ", Gesamtverbrauch: "+futterEntry.getValue());
//        }
        System.out.println();
        System.out.println("Preis für Futter pro Tag: " + myZoo.calculateFoodPricePerDay() + " €");
        System.out.println();

        // TODO: 08.11.2022 Hier brauche ich noch ein zusätzlicher Pfleger 
        Pfleger pf1 = new Pfleger("Hansi", "Storch");
        Pfleger pf2 = new Pfleger("Jürgen", "Fisch");

        pf1.putAufgabeToPfleger("Käfig reinigen");
        pf1.putAufgabeToPfleger("Müll lehren");
        pf1.putAufgabeToPfleger("Futter bestellen");

        pf2.putAufgabeToPfleger("Futter nachfüllen");
        pf2.putAufgabeToPfleger("Tiere waschen");
        pf2.putAufgabeToPfleger("Tiere streicheln");

        myGehege1.putPflegerToGehege(pf1);
        myGehege2.putPflegerToGehege(pf2);
        myGehege3.putPflegerToGehege(pf1);
        riedNeu.putPflegerToGehege(pf2);
        wasserwelt.putPflegerToGehege(pf2);

        myZoo.printListWithGehege();

        for (int tag = 1; tag <= 10; tag++) {
            System.out.println();
            System.out.println();
            System.out.println("==== TAG " + tag + " ====");

            myZoo.simulate();
        }

    }
}