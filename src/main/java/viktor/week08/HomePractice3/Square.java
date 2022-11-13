package viktor.week08.HomePractice3;

public class Square implements Geometry {

    private double sideA;

    public Square(double sideA){

        this.sideA = sideA;
    }

    @Override
    public double calculateCircumference(){

        return 4 * sideA;
    }

    @Override
    public double calculateArea(){

        return sideA * sideA;
    }
}
