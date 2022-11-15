package viktor.week08.Car;

public class Tank {

    private double tankInhalt;

    public Tank(double tankInhalt){
        this.tankInhalt = tankInhalt;
    }

    public double getTankInhalt() {
        return tankInhalt;
    }

    @Override
    public String toString(){
        return "Tank: " + tankInhalt;
    }
}
