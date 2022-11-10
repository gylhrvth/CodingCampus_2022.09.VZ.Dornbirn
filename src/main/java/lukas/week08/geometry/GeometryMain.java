package lukas.week08.geometry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GeometryMain {
    public static void main(String[] args) {
        List<Geometry> geometries = new ArrayList<>();

        Square mySquare = new Square(10);
        geometries.add(mySquare);

        geometries.add(new Rectangle(10, 20));
        geometries.add(new SameLegTriangle(15, 20));

        Collections.shuffle(geometries);

        calculate(geometries);
    }

    public static void calculate(List<Geometry> geos) {
        for (Geometry geo : geos) {
            //Ausgabe des eigentlichen Klassennamens
            //System.out.println(geo.getClass().getName());

            if(geo instanceof Rectangle) {
                System.out.println("Ich bin ein Rectangle");
            } else if(geo instanceof Square) {
                System.out.println("Ich bin ein Square");
            } else if(geo instanceof SameLegTriangle) {
                System.out.println("Ich bin ein SameLegTriangle");
            }

            System.out.println("Area: " + geo.calculateArea());
            System.out.println("Circumference: " + geo.calculateCircumference());
        }
    }
}
