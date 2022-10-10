package viktor.week02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadUserInputIntV4 {

    public static int readUserInputIntegerV4(int minValue, int maxValue){
        Scanner sc = new Scanner(System.in);

        int value = Integer.MIN_VALUE;

        while(value == Integer.MIN_VALUE) {

            try {

                System.out.println("Geben Sie eine Ganzzahl ein:");
                value = sc.nextInt();
                if (value < minValue) {
                    System.out.println("Die Zahl muss größer gleich " + minValue + " sein.");
                    value = Integer.MIN_VALUE;
                }else if (value > maxValue) {
                    System.out.println("Die Zahl muss kleiner gleich " + maxValue + " sein.");
                    value = Integer.MIN_VALUE;
                }
            } catch (InputMismatchException ime) {
                System.out.println("Es ist keine Zahl");
            }
            sc.nextLine();

        }
        return value;
    }


    public static void main(String[] args) {

        System.out.println(readUserInputIntegerV4(1,10));



    }
}
