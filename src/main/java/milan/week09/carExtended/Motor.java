package milan.week09.carExtended;

import java.util.Random;

public class Motor {
    protected static Random ran = new Random();

    private String model;
    private String hersteller;
    private boolean statusNotDefect;
    private boolean statusRunning;
    private int kWLeistung;

    protected int kmStand;

    public Motor(String model, int leistung) {
        this.model = model;
        kmStand = 0;
        statusNotDefect = true;
        statusRunning = false;
        this.kWLeistung = leistung;
    }

    public void addKmToKmStand(int kilometer) {
        kmStand += kilometer;
        statusUpdate();
    }

    public void statusUpdate() {
        if (kmStand > ran.nextInt(30000000)) {
            setStatusNotDefect(false);
            System.out.println("Achtung!!!! Motorschaden nach " + kmStand + " km.\n" + "!!!Bitte zur RepairStation gehen!!!");
        }
    }

    public void setStatusNotDefect(boolean statusNotDefect) {
        this.statusNotDefect = statusNotDefect;
    }
    public void setStatusRunning(boolean statusRunning) {
        this.statusRunning = statusRunning;
    }

    public int getKmStand() {
        return kmStand;
    }

    public String getHersteller() {
        return hersteller;
    }

    public String getModel() {
        return model;
    }

    public boolean getStatusNotDefect() {
        return statusNotDefect;
    }
    public boolean getStatusRunning() {
        return statusRunning;
    }

    public int getkWLeistung() {
        return kWLeistung;
    }

    public void getMotorStatusText() {
        if (!getStatusNotDefect()) {
            System.out.println("Motor ist defekt!!!");
        } else {
            System.out.println("Motor läuft einwandfrei!!!");
        }
    }

    public Motor clone() {
        Motor m = new Motor(model, kWLeistung);
        return m;
    }
}
