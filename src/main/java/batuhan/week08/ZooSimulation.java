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
        Zookeeper ahmet = new Zookeeper("Ahmet");
        Gehege afrika = new Gehege("Afrika");
        Animals lion = new Animals("Lion", "Leo");
        Animalfeed food = new Animalfeed("FLeisch",10.99,10);
        lion.setFood(food, 10.99);
        afrika.putAnimal(lion);
        Animals elephant = new Animals("Elephant", "Benjamin");
        afrika.putAnimal(elephant);
        Animalfeed fooda = new Animalfeed("Obst",1.99,10);
        elephant.setFood(fooda,1.99);
        zoo1.addgehegelist(afrika);
        lukas.putEnclosure(afrika);

        lukas.timeToEat(lion,false);








        Gehege reptiel = new Gehege("Reptielien");
        Animals crocodil = new Animals("Crocodil", "Kroko");
        zoo1.addgehegelist(reptiel);
        ahmet.putEnclosure(reptiel);
        reptiel.putAnimal(crocodil);
        Gehege arktis = new Gehege("Arktis");
        Animals pinguin = new Animals("Pinguin", "Pingu");
        zoo1.addgehegelist(arktis);


        zoo1.printStuktur();
        System.out.println("Its monday, 8:30 in the morning....");
        System.out.println("Zookeper Lukas is coming!");
        System.out.println(lukas.timeToEat(elephant,true));
        System.out.println(lukas.timeToEat(lion,false));
        System.out.println(lukas.timeToClean(afrika,true));


    }
}
