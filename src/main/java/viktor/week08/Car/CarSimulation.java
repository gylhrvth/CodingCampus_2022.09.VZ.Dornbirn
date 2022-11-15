package viktor.week08.Car;

import java.util.ArrayList;
import java.util.List;

public class CarSimulation {

    public static void main(String[] args) {

        List<Car> list = new ArrayList<>();

        RepairStation repairStation = new RepairStation("Repaire Station",1000);

        Car ford = new Car("Mustang", 20.0, 400, Car.Antriebsart.BENZIN, 1500);
        Car chevrolet = new Car("Corvett", 25.0, 500, Car.Antriebsart.BENZIN, 1450);
        Car pontiac = new Car("Firebird", 30.0, 500, Car.Antriebsart.BENZIN, 1800);
        /*int drive1 = ford.drive(2);

        System.out.println("Ich fahre jetzt " + drive1 + " km.\n");

        int drive2 = ford.drive(30);
        System.out.println("Ich fahre jetzt " + drive2 + " km.\n");

        int drive3 = ford.drive(50);
        System.out.println("Ich fahre jetzt " + drive3 + " km.\n");

        int drive4 = ford.drive(60);
        System.out.println("Ich fahre jetzt " + drive4 + " km.\n");
        */

        list.add(ford);
        list.add(chevrolet);
        list.add(pontiac);

        boolean text = false;

        for (Car car : list) {

            if (text) {
                System.out.println("-----------------------------------------------------------");
                System.out.println("Now starts the next car!\n");
                text = false;
            }

            System.out.printf("Your tank size (l): %21.2f%n", car.getTankInhalt());
            System.out.println();

            while (car.checkTankContant()) {
                int drive = car.drive(20);

                if(!car.defekt()) {
                    System.out.printf("%s has driven%20d km %n", car.getModell(), drive);
                }else{
                    System.out.printf("%s has driven%20d km %n", car.getModell(), drive);
                    System.out.println("Motor ist defekt!");
                    repairStation.addNewEngineToCar();    // hier wird ein neuer Motor eingebaut
                    break;
                }
                System.out.println();
            }
            car.refill(); // nach dem Motor-Tausch wird das Auto voll betankt und kann weiterfahren
            text = true;
        }
    }
}

