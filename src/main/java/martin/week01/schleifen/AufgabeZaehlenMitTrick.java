package martin.week01.schleifen;

public class AufgabeZaehlenMitTrick {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 10) {
            if (i % 2 == 0) {
            System.out.println(i + " ist eine gerade Zahl.");
            }
            ++i;
        }
    }
}
