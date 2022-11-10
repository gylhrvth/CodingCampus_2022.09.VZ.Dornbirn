package patric.week08.CarSimulation;

import java.util.Random;
import java.util.Vector;

public class Garage {
    public static void main(String[] args) {
        Vector<Car> myGarage = new Vector<>();

        myGarage.add(new Car("BMW", "318", 100, 50, "Verbrenner", 1700));
        myGarage.add(new Car("Audi", "Q8", 300, 80, "Verbrenner", 2200));
        myGarage.add(new Car("Hyndai", "Tuscon", 104, 60, "Verbrenner", 1700));
        Random random = new Random();

        for (Car c : myGarage) {
            System.out.println(c.getHersteller() + " " + c.getModel());
            int kilmotersToDrive = 5000;
            while (kilmotersToDrive > 0) {
                int aktuellerTankFuellstand = c.getAktuellerTankFuellstand();
                int kmToDrive = random.nextInt(300);
                int drivenKM = c.drive(kmToDrive);
                kilmotersToDrive -= drivenKM;
                System.out.println("Soll KM: " + kmToDrive + " Gefahrene KM: " + drivenKM + " Tankinhalt: " + aktuellerTankFuellstand + " -> " + c.getAktuellerTankFuellstand());
                if (drivenKM != kmToDrive) {
                    System.out.println("Sollte tanken!!!");
                    c.refill();
                }
            }
        }

    }
}




