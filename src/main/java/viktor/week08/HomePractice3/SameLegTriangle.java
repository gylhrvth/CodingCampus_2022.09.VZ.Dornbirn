package viktor.week08.HomePractice3;

public class SameLegTriangle implements Geometry{

    private double sideA;
    private double sideB;

    public SameLegTriangle(double sideA, double sideB){
        this.sideA = sideA;
        this.sideB = sideB;
    }


    @Override
    public double calculateCircumference(){
        return 2 * sideA + sideB;
    }

    @Override
    public double calculateArea(){
        double h = Math.sqrt( (sideA*sideA) - (sideB/2 * sideB/2) );
        return (sideB * h) / 2;
    }
}
