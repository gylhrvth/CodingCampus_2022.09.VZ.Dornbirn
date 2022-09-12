package martin.week01.schleifen;

public class AufgabeZaehlen {
    public static void main(String[] args) {
        System.out.print("For Zählen i");
        for(int i = 0; i <= 10; ++i){
            System.out.println("i = " + i);
        }

        System.out.println("While Zählen j");
        int j = 0;
        while (j <= 10){
            System.out.println("j = " + j);++j;
        }

    }
}