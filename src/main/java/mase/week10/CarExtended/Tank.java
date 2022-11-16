package mase.week10.CarExtended;

public class Tank  {
    public int actualTankcapacity;
    public int maxTankCapacity;
    private String model;




    public Tank(String model, int tankcapacity) {
        this.model = model;
        this.maxTankCapacity = tankcapacity;
        actualTankcapacity = maxTankCapacity;


    }

    public int getActualTankcapacity() {
        return actualTankcapacity;
    }

    public void setActualTankcapacity(int actualTankcapacity) {
        this.actualTankcapacity = actualTankcapacity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxTankCapacity() {
        return maxTankCapacity;
    }

    public void setMaxTankCapacity(int maxTankCapacity) {
        this.maxTankCapacity = maxTankCapacity;
    }

    @Override
    public String toString() {
        return "Tank -> + Model" + model + "Kapazität Max: " + maxTankCapacity + "l, Aktueller Stand: " + actualTankcapacity+"l";
    }
}
