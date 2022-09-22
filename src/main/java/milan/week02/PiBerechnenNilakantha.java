package milan.week02;

public class PiBerechnenNilakantha {

    public static void main(String[] args) {

        System.out.println("====");
        piBerechnen();
        System.out.println("====");
    }

    public static void piBerechnen() {
        int negativ = -4;
        double piValue = 3;
        for (int i = 0; i < 1000; i++) {
            negativ = negativ * -1;
            piValue = piValue + negativ / ((2.0 + (i * 2)) * (3 + (i * 2)) * (4 + (i * 2)));

        }
        System.out.println(piValue);
    }

}
