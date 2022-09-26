package berna.week02;

public class LeibnizV2 {
    public static void main(String[] args) {
        leibniz();
    }

    public static void leibniz(){
        int vorzeichen = -1;
        double piValue = 0.0;

        for (int i = 1; i < 10000; i += 2) {
            vorzeichen *= -1;

            piValue += vorzeichen * 4.0 / i;
            System.out.println(piValue);
        }
    }
}
