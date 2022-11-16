package viktor.week08.Car;

public class Battery extends Tank{

    private double ladekabelLänge;

    public Battery(double tankInhalt, double ladekabelLänge){
        super(tankInhalt);
        this.ladekabelLänge = ladekabelLänge;
    }

    @Override
    public double getTankInhalt() {
        return super.getTankInhalt();
    }
}
