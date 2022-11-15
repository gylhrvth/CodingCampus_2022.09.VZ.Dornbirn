package batuhan.wwek08.car;

public class Engine {
    private String motor;
    private boolean starEngine;
    private boolean stopEngine;
    private int kw;



    public Engine(String motor,int kw) {
        this.motor = motor;
        starEngine = true;
        stopEngine = false;
        this.kw=kw;


    }

    public int getKw() {
        return kw;
    }

    public void setStarEngine(boolean starEngine) {
        this.starEngine = starEngine;
    }

    public void setStopEngine(boolean stopEngine) {
        this.stopEngine = stopEngine;
    }
    public boolean getStartEngine(){
        return  starEngine;
    }
    public boolean getStopEngine(){
        return  stopEngine;
    }

    public String getMotor() {
        return motor;
    }

    public String toString(){

        return "Ein neuer " + motor + " wurde eingebaut\n";
    }
    public void istmeinMotoran(){
        if (getStartEngine()){
            System.out.println("Motor ist an.");
        }
        else {
            System.out.println("Motor ist aus");
        }
    }

}




