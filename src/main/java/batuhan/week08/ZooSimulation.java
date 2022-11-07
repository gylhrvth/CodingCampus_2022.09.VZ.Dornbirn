package batuhan.week08;



import java.util.HashMap;
import java.util.Map;

public class ZooSimulation {

    public static void main(String[] args) {
        Map<Animalfeed, Double> futterPriceMap = new HashMap<>();

//        Animalfeed f = new Animalfeed("Kitkat", 3, 500);
//        futterPriceMap.put(f, 30.5);
//
//        double priceFromMap = futterPriceMap.get(f);

        Zoo zoo1 = new Zoo("Wildpark Feldkirch", 1999);
        Zookeeper lukas = new Zookeeper("Lukas");
        Gehege afrika = new Gehege("Afrika");
        Animals lion = new Animals("Lion", "Leo");
        Animalfeed food = new Animalfeed("FLeisch",10.99,10);


        lion.setFood(food, 10.99);



        Animals elephant = new Animals("Elephant", "Benjamin");
        Animalfeed fooda = new Animalfeed("Obst",1.99,10);
        elephant.setFood(fooda,1.99);
        zoo1.addgehegelist(afrika);

        Gehege reptiel = new Gehege("Reptielien");
        Animals crocodil = new Animals("Crocodil", "Kroko");
        zoo1.addgehegelist(reptiel);
        Gehege arktis = new Gehege("Arktis");
        Animals pinguin = new Animals("Pinguin", "Pingu");
        zoo1.addgehegelist(arktis);




        afrika.putAnimal(lion);
        afrika.putAnimal(elephant);
        reptiel.putAnimal(crocodil);




        zoo1.printStuktur();


    }
}
