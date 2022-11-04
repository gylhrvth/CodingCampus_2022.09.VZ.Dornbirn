package patric.week08.cameraObscura;

import java.util.Objects;

public class Camera {
    private String manufacturer;
    private String model;
    private MemoryCard mCard;


    public Camera(String manufacturer, String model){
        this.manufacturer = manufacturer;
        this.model = model;
        mCard = null;
    }

    public boolean insertMemoryCard(MemoryCard mc){
        if (mCard != null && !mCard.equals(mc))  {
            System.out.println("A memory card has been inserted into the camera. Remove it, before insert an other one.");
            return false;
        }
        if (mc.getUsedInCamera() != null && !this.equals(mc.getUsedInCamera())){
            System.out.println("The memory car is in moment in use. Remove from " + mc.getUsedInCamera() + " before usage.");
            return false;
        }
        mCard = mc;
        mCard.setUsedInCamera(this);
        return true;
    }

    public MemoryCard removeMemoryCard(){
        MemoryCard result = mCard;
        if (mCard != null) {
            mCard.setUsedInCamera(null);
        }
        mCard = null;
        return result;
    }

    @Override
    public String toString() {
        return "Camera{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", mCard=" + mCard +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Camera camera = (Camera) o;

        if (!Objects.equals(manufacturer, camera.manufacturer))
            return false;
        if (!Objects.equals(model, camera.model)) return false;
        return Objects.equals(mCard, camera.mCard);
    }

    @Override
    public int hashCode() {
        int result = manufacturer != null ? manufacturer.hashCode() : 0;
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + (mCard != null ? mCard.hashCode() : 0);
        return result;
    }
}
