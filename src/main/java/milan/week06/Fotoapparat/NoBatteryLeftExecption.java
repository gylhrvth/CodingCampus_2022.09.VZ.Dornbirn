package milan.week06.Fotoapparat;

public class NoBatteryLeftExecption extends Exception{

    private int leftBattery;

    public NoBatteryLeftExecption(int leftBattery){
        this.leftBattery = leftBattery;
    }

    public int getLeftBattery() {
        return leftBattery;
    }
}
