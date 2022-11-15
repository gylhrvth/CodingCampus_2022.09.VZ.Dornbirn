package martin.week09;

import martin.week10.Engine;
import martin.week10.Tank;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class CarSimulation {
    public static final Random rand = new Random();
    public static final String[] schoenLeben = {
            "sich ein Eis gekauft.",
            "die Vögel an einer Raststätte beobachtet.",
            "seine Eltern angerufen.",
            "ein schönes Lied im Radio gehört.",
            "sich gefreut, dass es heute was leckeres zu Essen gab.",
            "jemanden im Krankenhaus besucht.",
            "Blut gespendet.",
            "einen Zoo besucht.",
            "vor dem Abbiegen geblinkt.",
            "jemandem Notstarthilfe gegeben.",
            "mehreren Leuten den Vorrang gegeben.",
            //"Fahrerflucht begangen.",
            "jemanden per Anhalter mitgenommen."};

    public static void main(String[] args) {
        List<Car> Audlis = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            Audlis.add(makeRandCar());
        }

        Engine aduilE1 = new Engine(EngineType.GAS, 69, 95);
        Tank aduilT1 = new Tank(52);
        Audlis.add(new Car(aduilE1, aduilT1,
                1400, "PlAu", "Aduil C4"));
        for (Car car : Audlis) {
            printCarKenndaten(car);
        }
        System.out.println();

        for (int i = 0; i < 20; i++) {
            driveAll(Audlis);
            System.out.println();
        }
    }

    public static Engine makeRandEngine() {
        EngineType[] enTypes = EngineType.values();
        int enTy = rand.nextInt(EngineType.values().length);
        return new Engine(
                enTypes[enTy],
                100 + rand.nextInt(700, 900),
                50 + rand.nextInt(0, 50)
        );
    }

    public static Tank makeRandTank() {
        return new Tank(70 +
                rand.nextInt(0, 70));
    }

    public static Car makeRandCar() {
        return new Car(
                makeRandEngine(),
                makeRandTank(),
                1000 + rand.nextInt(0, 500),
                "Audli",
                "Audli A" + rand.nextInt(0, 3));
    }

    public static void printCarKenndaten(Car car) {
        System.out.println(car.getModell() + ":" + car.getId() + " kW:" + car.getKW() +
                " Tank: " + car.tankInhalt() + "l Gew.:" + car.getGewicht() +
                " Engine: " + car.getEnType());
    }

    public static void driveAll(List<Car> allCarToDrive) {
        for (Car car : allCarToDrive) {
            int wieSchoen = rand.nextInt(schoenLeben.length);
            int kmToDrive = rand.nextInt(10, 100);
            int canDrive = car.drive(kmToDrive);
            System.out.print("\u001B[33mEin " + car.getModell() + ":" + car.getId());
            if ((canDrive >= kmToDrive) && car.getEnWorks()) {
                System.out.print(" ist " + canDrive + " km gefahren\u001B[0m");
                car.engineBreaks(kmToDrive);
            } else {
                System.out.print(" wollte " + kmToDrive + "km fahren. ");
                if (!car.getEnWorks()) {
                    System.out.print("Aber der Motor sprang' nicht an.\u001B[0m");
                    break;
                } else {
                    System.out.println("Musste aber nach " +
                            canDrive + "km anhalten\u001B[0m");
                    car.engineBreaks(canDrive);
                }
            }
            if (car.needRefill(10) && car.getEnWorks()) {
                System.out.print("\u001B[34m, hat dann " +
                        car.refill(rand.nextInt(45, 95)) +
                        "L nachgetankt\u001B[0m und ");
            } else {
                System.out.print(" und hat ");
            }
            System.out.println("\u001B[35m" + schoenLeben[wieSchoen] + "\u001B[0m");
        }
    }
}