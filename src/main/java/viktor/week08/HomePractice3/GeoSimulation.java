package viktor.week08.HomePractice3;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

public class GeoSimulation {

    public static void calculate(Vector<Geometry> list) {

        for (Geometry geo : list) {

            if (geo instanceof Rectangle) {
                System.out.println("Rectangle: ");
            } else if (geo instanceof SameLegTriangle) {
                System.out.println("Same leg triangle: ");
            } else if (geo instanceof Square) {
                System.out.println("Square: ");
            }
            double cf = geo.calculateCircumference();
            double area = geo.calculateArea();
            System.out.printf("Circumference: %10.3f%n",cf);
            System.out.printf("Area: %19.3f%n",area);
            System.out.println();
        }
    }


    public static void main(String[] args) {

        Vector<Geometry> geos = new Vector<>();

        Rectangle rectangle = new Rectangle(10, 20);
        SameLegTriangle slt = new SameLegTriangle(10, 5);
        Square square = new Square(100);

        geos.add(rectangle);
        geos.add(slt);
        geos.add(square);

        calculate(geos);

    }


}

