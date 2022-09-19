package gyula.week02;

public class Leibniz {
    public static void main(String[] args) {
        leibniz2(0.00000001);
    }

    public static void leibniz2(double precision){
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

    }

    public static void leibniz(){
        int neg = -4;
        double piValue = 0;
        for (int i = 0; i < 200000; i++) {
            neg = neg * -1;
            piValue += neg / (2 * i + 1.0);
        }
        System.out.println("Pi ~ " + piValue);
    }
}
