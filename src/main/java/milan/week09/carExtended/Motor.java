package milan.week09.carExtended;

import java.util.Random;

public class Motor {
    private static Random ran = new Random();

    private String model;
    private String hersteller;
    private boolean status;

    private int kmStand;

    public Motor(String model) {
        this.model = model;
        kmStand = 0;
        status = true;

    }

    public void addKmToKmStand(int kilometer) {
        kmStand += kilometer;
        statusUpdate();
    }

    public void statusUpdate() {
        if (kmStand > ran.nextInt(30000000)) {
            setStatus(false);
            System.out.println("Achtung!!!! Motorschaden nach " + kmStand + " km.");
        }
    }

    public void setStatus(boolean status) {
        this.status = status;
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

    public boolean getStatus() {
        return status;
    }
}
