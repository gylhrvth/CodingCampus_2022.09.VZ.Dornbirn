package patric.week08.cameraObscura;

import java.util.Objects;

public class MemoryCard {

    private String model;
    private long capacity;
    private long used;

    private Camera usedInCamera;

    public MemoryCard(String model, long capacity){
        this(model, capacity, 0);
    }

    public MemoryCard(String model, long capacity, long used){
        this.model = model;
        this.capacity = capacity;
        this.used = used;

        usedInCamera = null;
    }

    @Override
    public String toString() {
        return "MemoryCard{" +
                "model='" + model + '\'' +
                ", capacity=" + capacity +
                ", used=" + used +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MemoryCard that = (MemoryCard) o;
        if (capacity != that.capacity) return false;
        if (used != that.used) return false;
        return Objects.equals(model, that.model);
    }

    @Override
    public int hashCode() {
        int result = model != null ? model.hashCode() : 0;
        result = 31 * result + (int) (capacity ^ (capacity >>> 32));
        result = 31 * result + (int) (used ^ (used >>> 32));
        return result;
    }

    void setUsedInCamera(Camera usedInCamera) {
        this.usedInCamera = usedInCamera;
    }

    Camera getUsedInCamera() {
        return usedInCamera;
    }
}
