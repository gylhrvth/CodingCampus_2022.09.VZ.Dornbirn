package batuhan.wwek08.car.week08zoo;



import java.util.HashMap;
import java.util.Map;

public class ZooSimulation {

    public static void main(String[] args) {
        Map<Animalfeed, Double> futterPriceMap = new HashMap<>();


        Zoo zoo1 = new Zoo("Wildpark Feldkirch", 1999);

        Zookeeper lukas = new Zookeeper("Lukas");
        Zookeeper ahmet = new Zookeeper("Ahmet");
        Gehege afrika = new Gehege("Afrika");
        Animalfeed food = new Animalfeed("FLeisch",10.99,10);
        Animalfeed fooda = new Animalfeed("Obst",1.99,10);
        Animalfeed food_fisch = new Animalfeed("Fisch",6.99,10);


        Animal lion = new Animal("Lion", "Leo", food, 10.99);

        afrika.putAnimal(lion);
        Animal elephant = new Animal("Elephant", "Benjamin", fooda,1.99);
        afrika.putAnimal(elephant);
        zoo1.addgehegelist(afrika);
        lukas.timeToEat(lion,false);
        Gehege reptiel = new Gehege("Reptielien");
        Animal crocodil = new Animal("Crocodil", "Kroko", food,2.0);
        zoo1.addgehegelist(reptiel);
        reptiel.putAnimal(crocodil);
        Gehege arktis = new Gehege("Arktis");
        Animal pinguin = new Animal("Pinguin", "Pingu", food_fisch, 0.5);
        zoo1.addgehegelist(arktis);
        arktis.putAnimal(pinguin);

        zoo1.printStuktur();
        System.out.println("Its monday, 8:30 in the morning....");
        System.out.println("Zookeper Lukas is coming!");
        System.out.println(lukas.timeToEat(elephant,true));
        System.out.println(lukas.timeToEat(lion,false));
        System.out.println(lukas.timeToClean(afrika,elephant,false));
        System.out.println(ahmet.timeToEat(crocodil,false));
        System.out.println(ahmet.timeToClean(arktis,pinguin,true));


        Map<Animalfeed, Double> foodAmoutMap = zoo1.calculateFoodMap();

        System.out.println();
        System.out.println();
        System.out.println("== Futterbedarf ==");
        Double sumPreis = 0.0;
        for (Animalfeed f : foodAmoutMap.keySet()) {
            Double price = f.getPrice() * foodAmoutMap.get(f);
            sumPreis += price;
            System.out.println(f.getFood() + " mit Preis " + f.getPrice() + " mit Bedarf von " + foodAmoutMap.get(f) + " und Gesamtpreis " + price);
        }
        System.out.println("Total Kosten pro Tag sind: " + sumPreis);


        afrika.watchFavAnimal(lukas);




    }


}
