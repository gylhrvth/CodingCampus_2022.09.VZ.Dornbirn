package patric.week08.CarSimulation;

import gyula.week08.fahrzeug.ElektroFahrzeug;

import java.util.Random;
import java.util.Vector;

import static patric.week08.CarSimulation.Antriebsart.*;

public class Garage {
    public static void main(String[] args) {
        Vector<Car> myGarage = new Vector<>();

        myGarage.add(new Car("BMW", "318", 100, 50, GAS, 1700));
        myGarage.add(new Car("Audi", "Q8", 300, 80, ELEKTRO, 2200));
        myGarage.add(new Car("Hyndai", "Tuscon", 104, 60, DIESEL, 1700));
        myGarage.add(new Car("Mini", "One", 45, 40, BENZIN, 500));
        Random random = new Random();

        for (Car c : myGarage) {
            System.out.println(c.getHersteller() + " " + c.getModel());
            int kilmotersToDrive = 5000;
            while (kilmotersToDrive > 0) {
                int aktuellerTankFuellstand = c.getAktuellerTankFuellstand();
                int kmToDrive = random.nextInt(300);
                int drivenKM = c.drive(kmToDrive);
                kilmotersToDrive -= drivenKM;
                System.out.println("Soll KM: " + kmToDrive + " Gefahrene KM: " + drivenKM + " Tankinhalt: " + aktuellerTankFuellstand + " " + c.getAntriebsart() + " -> " + c.getAktuellerTankFuellstand());
                if (drivenKM != kmToDrive) {
                    System.out.println("Sollte tanken!!!");
                    c.refill();
                }
            }
        }

    }
}




