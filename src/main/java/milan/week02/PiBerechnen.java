package milan.week02;

public class PiBerechnen {
    public static void main(String[] args) {


    piBerechnen1(0.00001);
    piBerechnen2();
    }

    public static void piBerechnen1(double precision){
        double piMax = 9999;
        double piMin = 0;
        int i = 0;
        while(piMax - piMin >= precision) {
            piMax = piMin + 4.0 / (4 * i + 1);
            piMin = piMax - 4.0 / (4 * i + 3);

            ++i;
        }
        System.out.printf("Pi ist in Intervall %12.10f %12.10f (diff: %12.10f)\n",
                piMin, piMax, piMax-piMin);
        //System.out.println(piMin + " " + piMax + " " + (piMax - piMin));

    }

    public static void piBerechnen2(){
        int negativ = -4;
        double piValue = 0;
        for (int i = 0; i < 100; i++) {
            negativ = negativ * -1;
            piValue += negativ / (2 * i + 1.0); // piValue += negativ, bedeutet: piValue = piValue + negativ
        }
        System.out.println("Pi ~ " + piValue);
    }
}
