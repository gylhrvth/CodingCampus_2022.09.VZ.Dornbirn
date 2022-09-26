package milan.week02;

import java.util.Scanner;

public class TaschenrechnerV2 {

    public static void main(String[] args) {

        // Liest ersten Float
        float num1 = readFloat("Bitte gebe erste Zahl an:");
        // Liest Operator
        //readOperator();
        // Liest zweiten Float
        float num2 = readFloat("Bitte gebe zweite Zahl an:");

        System.out.printf("%f %f\n", num1, num2);

    }

    public static float readFloat(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        while (true) {
            if (sc.hasNextFloat()) {
                return sc.nextFloat();
            } else {
                System.out.println(message);
                sc.nextLine();
            }
        }
    }


}