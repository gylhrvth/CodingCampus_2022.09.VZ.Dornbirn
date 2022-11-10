package patric.week08.CarSimulation;

import java.util.Vector;

public class Garage {
    public static void main(String[] args) {
        Vector<Car> myGarage = new Vector<>();

        myGarage.add(new Car("BMW","318",100,50,"Verbrenner",2000));

        for (Car c:myGarage
             ) {
            System.out.println(c);

        }
    }
}




