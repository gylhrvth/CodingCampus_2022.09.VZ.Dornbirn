package lukas.week01.day4;

public class Rehearsal {
    public static void main(String[] args) {
//        sayHallo();
//
//        String h = sayHallo2();
//        System.out.println(h);
//
//        System.out.println(sum(5, 5));

        int x = 10;
        int y = 5 * x;
        System.out.println(y);

        double z = 295.91;
        float a = 295.31f;

        //Typ umwandlung durch Casten
        int zGanz = (int) z;
        System.out.println(zGanz);

        //?Falsches? ergebnis
        double ergebnis = 10 / 9;

        long l = 200000000000000L;

        double d = 10L / 20.0;

        int largeInt1 = 1000000000;
        int largeInt2 = 1000000000;

        //Integer.MAX_VALUE
        //Integer.MIN_VALUE

        //Achtung überlauf
        int largeIntEnergiser = largeInt1 * largeInt2;
        System.out.println(largeIntEnergiser);

        long largeLongEnergiser = largeInt1 * (long) largeInt2;
        System.out.println(largeLongEnergiser);

        boolean trueOrFalse = true;

        boolean myValue;
        if(5 > 3) {
            myValue = true;
        } else {
            myValue = false;
        }

        myValue = 5 > 3;

        int x1 = 5 + 10;

        String text = "Wie geht es dir?";
        System.out.println(text.toLowerCase());
        System.out.println(text.toUpperCase());

        String text2 = 1 + 5 + text + " Lukas???????!!!!1111 " + (23 + 12) + myValue;
        System.out.println(text2);


    }

    public static void sayHallo() {
        System.out.println("Sag hallo");
    }

    public static String sayHallo2() {
        return "Say hallo";
    }

    public static int sum(int x, int y) {
        int z = x + y;
        return z;
    }
}
