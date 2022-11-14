package batuhan.wwek08.car;

public class Engine {
    private String motor;
    private boolean startStop;



    public Engine(String motor) {
        this.motor = motor;

    }

  public boolean StartStop(){
        if (true){
            System.out.println("Das Auto wird gestartet!\n");

        }
        else {
            System.out.println("Das Auto wird abgeschaltet!\n");
        }
  return StartStop();
    }

    public String getMotor() {
        return motor;
    }

    public String toString(){

        return "Ein neuer " + motor + " wurde eingebaut\n";
    }

}




