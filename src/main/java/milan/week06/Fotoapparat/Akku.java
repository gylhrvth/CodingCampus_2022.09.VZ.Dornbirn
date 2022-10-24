package milan.week06.Fotoapparat;

public class Akku {

    private int maxBatCapacity;
    private int leftOverCapacity;


    public Akku(int maxBatCapacity) {

        leftOverCapacity = maxBatCapacity;
        this.maxBatCapacity = maxBatCapacity;

    }

    public int getLeftOverCapacity() {
        return leftOverCapacity;
    }

    public void setLeftOverCapacity(int leftOverCapacity) {
        this.leftOverCapacity = leftOverCapacity;
    }

    public int getMaxBatCapacity() {
        return maxBatCapacity;
    }

    public void setMaxBatCapacity(int maxBatCapacity) {
        this.maxBatCapacity = maxBatCapacity;
    }
}

