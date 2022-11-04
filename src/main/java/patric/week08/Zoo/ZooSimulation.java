package patric.week08.Zoo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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


        //Gehege hinzufügen mit Liste
        //Gehege neuRied = myZoo.getGehegeList().get(myZoo.getGehegeList().size() - 1);

        Tier tier1 = new Tier("Alfredo", "Gecko");
        Tier tier2 = new Tier("Rijska", "Kuh");
        Tier tier3 = new Tier("Hugo", "Storch");
        Tier tier4 = new Tier("Gustaf", "Fisch");
        wasserwelt.putTierToGehege(tier4);
        Tier tier5 = new Tier("Idaxis", "Storch");
        Tier tier6 = new Tier("Schorscherl", "Fisch");
        riedNeu.putTierToGehege(tier5);
        myGehege1.putTierToGehege(tier2);
        myGehege1.putTierToGehege(tier5);
        myGehege1.putTierToGehege(tier6);
        riedNeu.putTierToGehege(tier3);
        myGehege3.putTierToGehege(tier1);

        myGehege1.removeTierFromGehege(tier6);
        wasserwelt.putTierToGehege(tier6);

        myGehege1.removeTierFromGehege(tier5);

        //Futter Erstellung
        Futter kitkat = new Futter("KitKat", "500g Dose", 0.79);
        Futter trocken = new Futter("Trockenfutter", "300g Pack", 1.99);
        Futter flocken = new Futter("Fischflocken", "5g", 0.09);
        Futter heu = new Futter("Heu", "1Ballen", 5.0);

        tier2.setFutter(heu, 10);
        tier3.setFutter(trocken, 5);
        tier6.setFutter(flocken, 10);
        tier5.setFutter(trocken, 10);
        tier4.setFutter(flocken, 3);
        tier1.setFutter(kitkat, 3);


//        System.out.println("Wieviel kostet die Tiernahrung");
//        double overallPrice = 0;
//        //für jedes Tier:
//        overallPrice += tier1.getFutterToTier().getEinheitPreis() * tier1.getAmountOfFutter();
//        overallPrice += tier2.getFutterToTier().getEinheitPreis() * tier2.getAmountOfFutter();
//        overallPrice += tier3.getFutterToTier().getEinheitPreis() * tier3.getAmountOfFutter();
//        overallPrice += tier4.getFutterToTier().getEinheitPreis() * tier4.getAmountOfFutter();
//        overallPrice += tier5.getFutterToTier().getEinheitPreis() * tier5.getAmountOfFutter();
//        overallPrice += tier6.getFutterToTier().getEinheitPreis() * tier6.getAmountOfFutter();

        List<Tier> tierList = new ArrayList<>();
        tierList.add(tier1);
        tierList.add(tier2);
        tierList.add(tier3);
        tierList.add(tier4);
        tierList.add(tier5);
        tierList.add(tier6);

        //Futter wird als Schlüssel verwendet
        //der Wert ist die Menge vom Futter
        Map<Futter, Double> futterAmountMap = new HashMap<>();

        for(Tier t : tierList) {
            Futter currentFutter = t.getFutterToTier();
            Double currentSumOfTierFutter = futterAmountMap.get(currentFutter);
            if(currentSumOfTierFutter == null) {
                currentSumOfTierFutter = t.getAmountOfFutter();
            } else {
                currentSumOfTierFutter += t.getAmountOfFutter();
            }
            futterAmountMap.put(currentFutter, currentSumOfTierFutter);
        }

        System.out.println("Heu: "+ futterAmountMap.get(heu)+" kg");
        System.out.println("Trocken: "+ futterAmountMap.get(trocken)+" kg");
        System.out.println("Flocken: "+ futterAmountMap.get(flocken)+" kg");
        System.out.println("Kitkat: "+ futterAmountMap.get(kitkat)+" kg");

//        for(Map.Entry<Futter, Double> futterEntry: futterAmountMap.entrySet()) {
//            System.out.println("Futter: "+futterEntry.getKey().getName()+ ", Gesamtverbrauch: "+futterEntry.getValue());
//        }

        System.out.println("Preis für Futter pro Tag: " + myZoo.calculateFoodPricePerDay()+" €");



        myZoo.printListWithGehege();
    }
}