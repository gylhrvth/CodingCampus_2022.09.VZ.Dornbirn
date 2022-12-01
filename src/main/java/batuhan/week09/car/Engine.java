package batuhan.week09.car;

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


    public boolean getStartEngine(){
        return  starEngine;
    }


    public String getMotor() {
        return motor;
    }

    public String toString(){

        return "Ein neuer " + motor + " wurde eingebaut\n";
    }
    public void istmeinMotoran(){
        if (getStartEngine()){
            System.out.println("Der Motor wird eingeschaltet.");
        }
        else {
            System.out.println("Der Motor wird ausgeschaltet");
        }
    }

}




