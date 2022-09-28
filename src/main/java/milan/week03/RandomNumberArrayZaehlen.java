package milan.week03;

public class RandomNumberArrayZaehlen {

    public static void main(String[] args) {
        System.out.println("---------------------");
        System.out.println();
        int[] template = RandomNumberArray.createArrayWithRandomNum(20);
        System.out.println();
        System.out.println("---------------------");
        System.out.println();
        int grenze = 40;
        int anzahl = searchAndCount(grenze, template);
        System.out.print("Die Anzahl der Werte über: " + grenze + " beträgt: " +  anzahl);
        System.out.println();
        System.out.println();
        System.out.println("---------------------");
    }


    public static int searchAndCount(int grenze, int[] template) {
        int anzahl = 0;
        for (int j : template) {
            if (j > grenze) {
                anzahl++;
            }
        }
        return anzahl;
    }
}
