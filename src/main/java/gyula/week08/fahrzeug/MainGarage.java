package gyula.week08.fahrzeug;

import java.util.Vector;

public class MainGarage {
    public static void main(String[] args) {
        Vector<Fahrzeug> garage = new Vector<>();

        garage.add(new Fahrzeug("Santa's Schlitten", "Nordpol Inc."));
        garage.add(new MotorisiertesFahrzeug("Alfa", "Alfa Romeo", 80));
        garage.add(new ElektroFahrzeug("E-Bike", "KTM", 15, 1));


        for (Fahrzeug f : garage){
            System.out.println(f);
        }
    }
}
