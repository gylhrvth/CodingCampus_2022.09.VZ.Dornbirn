package franz.week08.Cars;


import java.util.Vector;

public class Garage {
    public static void main(String[] args) {
        Vector<Car> mygarage = new Vector<>();

        mygarage.add(new Car("Mazda", "3", 135, 45, "Diesel", 1250));
        mygarage.add(new Car("VW", "Touran", 105, 55, "Diesel", 1520));

        for (Car c : mygarage) {
            System.out.println(c.getHersteller() + "  " + c.getModel());
            while (c.getAktuellerTankFuellstand() > 0) {
                int drivenKM = c.drive(145);
                if (drivenKM != 145) {
                    System.out.println("Dein Tank ist leer; GEHE tanken! Du bist " + drivenKM + " km gefahren.");
                }
                System.out.println("Gefahren Km: " + drivenKM + " Tankinhalt: " + c.getAktuellerTankFuellstand());
            }
        }

    }

}