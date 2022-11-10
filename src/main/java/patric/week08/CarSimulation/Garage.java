package patric.week08.CarSimulation;

import java.util.Vector;

public class Garage {
    public static void main(String[] args) {
        Vector<Car> myGarage = new Vector<>();

        myGarage.add(new Car("BMW", "318", 100, 50, "Verbrenner", 1700));
        myGarage.add(new Car("Audi", "Q8", 300, 80, "Verbrenner", 2200));


        for (Car c : myGarage) {
            System.out.println(c.getHersteller() + " "+c.getModel());
            while(c.getAktuellerTankFuellstand() > 0) {
                int drivenKM = c.drive(150);
                if(drivenKM != 150) {
                    System.out.println("Sollte tanken!!!");
                }
                System.out.println("Gefahrene KM: "+drivenKM+" Tankinhalt: "+c.getAktuellerTankFuellstand());
            }
        }

    }
}




