package batuhan.week08;

public class ZooSimulation {

    public static void main(String[] args) {
        Zoo zoo1 = new Zoo("Wildpark Feldkirch", 1999);
        Gehege afrika = new Gehege( "Afrika");
        Animals lion = new Animals("Lion","Leo");
        Animals elephant = new Animals("Elephant","Benjamin");
        zoo1.addgehegelist(afrika);

        Gehege reptiel = new Gehege("Reptielien");
        Animals crocodil = new Animals("Crocodil","Kroko");
        zoo1.addgehegelist(reptiel);
        Gehege arktis = new Gehege("Arktis");
        Animals pinguin = new Animals("Pinguin","Pingu");
        zoo1.addgehegelist(arktis);


        afrika.putAnimal(lion);
        afrika.putAnimal(elephant);
        reptiel.putAnimal(crocodil);
//        arktis.putAnimal(pinguin);

        /*
        afrika.setAnimalbreed("Lion");
        afrika.setAnimalname("Leo");
        reptiel.setAnimalbreed("Crocodile");
        reptiel.setAnimalname("Kroko");
        arktis.setAnimalbreed("Pinguin");
        arktis.setAnimalname("Pingu");
        */

        zoo1.printStuktur();

    }
}
