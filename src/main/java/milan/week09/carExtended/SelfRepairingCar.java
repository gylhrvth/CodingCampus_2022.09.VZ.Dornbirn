package milan.week09.carExtended;

public class SelfRepairingCar extends Car{

    public SelfRepairingCar(Motor motor, String modell, String hersteller, double gewicht) {
        super(motor, modell, hersteller, gewicht);
    }

    @Override
    public void carSimulation(int kilometerZumZiel) {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\nDer " + getModell() + " fährt los!\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        int kmSumme = 0;
        while (kmSumme < kilometerZumZiel) {
            int kmProEttape = drive(kilometerZumZiel);
            if (kmProEttape < kilometerZumZiel) {
                kmSumme += kmProEttape;
                if (kmSumme < kilometerZumZiel) {
                    System.out.println("Nach " + kmProEttape + " km war der " + getSpeicherName() + " leer. (Zurückgelegte Gesamtstrecke: " + kmSumme + " km).");
                    addKmToKmStand(kmProEttape);
                    if (!getStatus()) {
                        System.out.println("+++++++++++++++++++++++++++++++++++++\nDer Motor ging kaputt. Das SelfRepairingCar hat ihn aber wieder repariert!!!\n+++++++++++++++++++++++++++++++++++++");
                        motor.setStatusNotDefect(true);
                    }
                    refuelCar();
                } else {
                    addKmToKmStand(kilometerZumZiel - (kmSumme - kmProEttape));
                    System.out.println("Nach " + (kilometerZumZiel - (kmSumme - kmProEttape)) + " km wurde das Ziel erreicht. (Zurückgelegte Gesamtstrecke: " + kilometerZumZiel + " km).\n");
                    if (!getStatus()) {
                        motor.setStatusNotDefect(true);
                    }
                }
            } else {
                System.out.println("Nach " + kilometerZumZiel + " km wurde das Ziel erreicht.\n");
                break;
            }

        }
    }
}
