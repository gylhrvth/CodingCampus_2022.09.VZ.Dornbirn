package franz.week08.Zoo;

public class Zoosimulator {
    public static void main(String[] args) {
        Zoo wildpark = new Zoo("Wildpark", 2010);


        Animal TimTiger = wildpark.searchAndCreateAnimal("Tigergehege", "Tim Tiger", "Tiger");
        Animal EmilElefant = wildpark.searchAndCreateAnimal("Elefantenhaus", "Emil Elefant", "Elefant");
        Animal PeterPinguin = wildpark.searchAndCreateAnimal("Pinguhaus", "Peter Pinguin", "Pinguin");
        Animal RogerRabe = wildpark.searchAndCreateAnimal("Rabennest", "Roger Rabe", "Rabe");
        Animal KarlKlasterkuh = wildpark.searchAndCreateAnimal("Kuwaid", "Karl Klaster Kuh", "Kuh");

        wildpark.serachAndCreatePfleger("Theo Tigerpfleger", "Tigergehege", "Elefantenhaus", "Pinguhaus", "Rabennest", "Kuwaid");
        wildpark.serachAndCreatePfleger("Erich Elefantenpfleger", "Tigergehege", "Elefantenhaus", "Pinguhaus", "Rabennest", "Kuwaid");
        wildpark.serachAndCreatePfleger("Paul Pingupfleger", "Tigergehege", "Elefantenhaus", "Pinguhaus", "Rabennest", "Kuwaid");
        wildpark.serachAndCreatePfleger("Reiner Rabenpfleger", "Tigergehege", "Elefantenhaus", "Pinguhaus", "Rabennest", "Kuwaid");

        wildpark.printStructure();

        System.out.println("YXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYX");

        for (int i = 1; i <= 7; i++) {
            System.out.println("SimulateDay: " + i + ". Tag");
            wildpark.simulatDay();
            System.out.println("\n");

        }
    }


}