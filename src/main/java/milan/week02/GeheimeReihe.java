package milan.week02;

public class GeheimeReihe {

    public static void main(String[] args) {

        System.out.println("====");
        printGeheimeReihe();
        System.out.println("====");
    }

    public static void printGeheimeReihe() {

        double wert = 1;
        for (int i = 0; i < 10; i++) {
            wert = (wert / 2) + (1 / wert);
            System.out.println(wert);

        }
    }
}
