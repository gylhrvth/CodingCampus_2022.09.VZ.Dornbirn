package franz.week08.Cars;


import java.util.Vector;

public class Garage {
    public static void main(String[] args) {
        Vector<Car> mygarage = new Vector<>();


        mygarage.add(new Car("Mazda", "3", 45, "Diesel", 1250, new Engine("v8", 100
        )));
        mygarage.add(new SelfRepairingCar("VW", "Touran", 55, "Diesel", 1520, new Engine("w12", 77)));

        mygarage.add(new AeroDynamicCar("Dacia", "Logan", 50, "Benzin", 1250, new Engine("v6", 200)));
        mygarage.add(new CrapCar("Mercedes", "X350d", 75, "Elektro", 1700, new Engine("E- Motor", 250)));

        for (Car c : mygarage) {
            System.out.println(c.getHersteller() + "  " + c.getModel());
            while (Math.round(c.getAktuellerTankFuellstand()) > 0 && !c.isEngineDefect()) {
                int drivenKM = c.drive(55);
                if (drivenKM != 55) {

                    if (c.isEngineDefect()) {
                        System.out.println("Ja! Motor defekt");
                    } else {
                        System.out.println("Dein Tank ist leer; GEHE tanken! Du bist " + drivenKM + " km gefahren.");
                        float aktuelleMenge = c.Refuel(60);
                        System.out.printf("Du konntest:%.3f l tanken. ", aktuelleMenge);
                    }

                }
                System.out.println("Gefahren Km: " + drivenKM + " Tankinhalt: " + c.getAktuellerTankFuellstand());
            }

        }


        Engine e = new Engine("Krasser Motor", 500);
        Engine oldEngine = mygarage.firstElement().changeEngine(e);
        System.out.println(oldEngine.getName());
    }

}

