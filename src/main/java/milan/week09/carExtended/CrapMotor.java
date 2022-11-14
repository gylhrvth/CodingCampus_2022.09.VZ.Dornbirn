package milan.week09.carExtended;

public class CrapMotor extends Motor {

    public CrapMotor(String model, int leistung) {
        super(model, leistung);
    }


    public void statusUpdate() {
        if (kmStand > ran.nextInt(15000000)) {
            setStatusNotDefect(false);
            System.out.println("Achtung!!!! Motorschaden nach " + kmStand + " km.\n" + "!!!Bitte zur RepairStation gehen!!!");
        }
    }

    @Override
    public Motor clone() {
        return new CrapMotor(getModel(), getkWLeistung());
    }
}

