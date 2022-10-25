package milan.week06.Fotoapparat;

public class NoBatteryLeftExecption extends Exception{

    private int leftBattery;

    public NoBatteryLeftExecption(int leftBattery){
        super ("Achtung, Akkustand ist niedrig!");
        this.leftBattery = leftBattery;
    }

    public NoBatteryLeftExecption(String message, int leftBattery){
        super (message);
        this.leftBattery = leftBattery;
    }

    public int getLeftBattery() {
        return leftBattery;
    }
}
