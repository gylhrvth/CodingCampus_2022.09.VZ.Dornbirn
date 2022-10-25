package patric.week07.Datenklasse;



import java.util.Random;

public class ObjektData {
    public static Random random = new Random();

    public static void main(String[] args) {

        int[] array3 = new int[random.nextInt(100)];
        for (int i = 0; i < array3.length; i++) {
            int randomNr = random.nextInt(100) - 50;
            array3[i] = randomNr;
        }

        patric.week07.Datenklasse.DatenklasseUebung array = new patric.week07.Datenklasse.DatenklasseUebung(new int[]{23, 24, 19, 30, 10, 11, 99, 88});

        patric.week07.Datenklasse.DatenklasseUebung a2 = new patric.week07.Datenklasse.DatenklasseUebung(new int[]{58, 60, 4, 6, 10, 23, 9});

        patric.week07.Datenklasse.DatenklasseUebung a3 = new patric.week07.Datenklasse.DatenklasseUebung(array3);


        System.out.println(array);
        System.out.println(a2);
        System.out.println(a3);


    }

}
