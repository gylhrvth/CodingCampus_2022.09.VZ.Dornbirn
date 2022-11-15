package michel.week09.AufgabeCarSimulationExtended;

public class Tank {
    private String tankModel;

    private int tankMaxCapacity;

    private int actualTankCapacity;

    public Tank(String tankModel, int tankCapacy) {
        this.tankModel = tankModel;
        this.tankMaxCapacity = tankCapacy;
        this.actualTankCapacity = tankMaxCapacity;
    }




    public int getActualTankCapacity() {
        return actualTankCapacity;
    }

    public void setActualTankCapacity(int actualTankCapacity) {
        this.actualTankCapacity = actualTankCapacity;
    }

    public String getTankModel() {
        return tankModel;
    }

    public void setTankModel(String tankModel) {
        this.tankModel = tankModel;
    }

    public int getTankMaxCapacity() {
        return tankMaxCapacity;
    }

    public void setTankMaxCapacity(int tankMaxCapacity) {
        this.tankMaxCapacity = tankMaxCapacity;
    }
    @Override
    public String toString() {
        return "Tank -> " + "Model: " + tankModel  + ", Kapazität Max: " + tankMaxCapacity + " l, Aktueller Füllstand: " + actualTankCapacity + " l";
    }
}
