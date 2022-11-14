package viktor.week08.HomePractice;

import java.util.Vector;

public class MainGarage {

    public static void main(String[] args) {

        Vector<Fahrzeug> garage = new Vector<Fahrzeug>();

        Fahrzeug ford = new MotFahrzeug("1000","Ford",400.0);
        Fahrzeug eBike = new ElektroFahrzeug("2000","KTM",460.0,20.0);
        Fahrzeug ducati = new Fahrzeug("3000","Ducati");

        garage.add(ford);
        garage.add(eBike);
        garage.add(ducati);

        for(Fahrzeug f : garage){
            System.out.println(f);
        }
    }
}
