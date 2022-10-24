package fatima.week06.Camera;

public class Objective {
    private int focalLengthMin;
    private int focalLengthMax;
    private double aperture;

    public Objective(int focalLengthMin, int focalLengthMax, double aperture) {
        this.focalLengthMin = focalLengthMin;
        this.focalLengthMax = focalLengthMax;
        this.aperture = aperture;
    }

    public int getFocalLengthMin() {
        return focalLengthMin;
    }

    public void setFocalLengthMin(int focalLengthMin) {
        this.focalLengthMin = focalLengthMin;
    }

    public int getFocalLengthMax() {
        return focalLengthMax;
    }

    public void setFocalLengthMax(int focalLengthMax) {
        this.focalLengthMax = focalLengthMax;
    }

    public double getAperture() {
        return aperture;
    }

    public void setAperture(double aperture) {
        this.aperture = aperture;
    }

    @Override
    public String toString() {
        return "Objective: \n" + "focal length: " + focalLengthMin + "-" + focalLengthMax + " mm\n" +
                "aperture: " + aperture;
    }
}
