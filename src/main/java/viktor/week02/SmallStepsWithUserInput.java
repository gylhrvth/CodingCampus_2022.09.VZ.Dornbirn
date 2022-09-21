package viktor.week02;

import java.util.Scanner;

public class SmallStepsWithUserInput {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Geben Sie an, wie lange die Schleife laufen soll!");
        double p = sc.nextDouble();

        for(int i=0; i<=p*10; i++){
            System.out.printf("%5.1f%n",i/10f);
        }

    }
}
