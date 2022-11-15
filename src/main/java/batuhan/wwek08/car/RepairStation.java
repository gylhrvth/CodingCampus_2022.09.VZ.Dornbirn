package batuhan.wwek08.car;

public class RepairStation {
    private String exchangeengine;
    private Car kunde;
    private Engine motor;

    public RepairStation(String exchangeengine){
        this.exchangeengine = exchangeengine;
        this.motor = motor;

    }


    public String getExchangeengine(Car kunde) {
        return motor.toString();
    }

    public String toSting(){
        return "Dein Auto hat einen Motorschaden \n";
    }



}
