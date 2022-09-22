package alp.week02;

public class PrimitiveDatenTypen {
    public static void main(String[] args) {
        /*
        printFaktorial(20);
        System.out.println();
        printFaktorialErweitert(20);
        System.out.println();
        zaehlenDezimal(100);
        System.out.println();
        zaehlenDezimalErweitert(100);
        System.out.println();
        teilenHerrschen(20);
        System.out.println();
        teilenHerrschen2(20);
        System.out.println();
        leibnizReihe(1000000);
        System.out.println();
         */
        nilakanthaReihe(100);
        System.out.println();

    }

    public static void printFaktorial(int count) {
        long result = 1;
        for (int i = 1; i <= count; i++) {
            result = result * i;
            System.out.println(i + "! = " + result);
            {

            }
        }


    }

    public static void printFaktorialErweitert(int count) {
        long result = 1;
        for (int i = 1; i <= 20; i++) {
            result = result * i;
            System.out.printf("%2d! = %19d%n", i, result); // %2d(rechtsbündig) steht für die zahl links vom = // %19d sorgt dafür dass 19zahlen platz haben rechts vom =
           // System.out.println();                        // %-2d(linksbündig) d-steht für zahl, s-steht für string(text)
                                                            // %n steht für zeilenumbruch. entweder mit println oder mit %n kann man zeilenumbruch machen
        }


    }

    public static void zaehlenDezimal(int count) {
        for (int i = 1; i <= 1000; i++) {
            System.out.println(i / 10f);
        }
        for (float i = 0; i <= 100; i += 0.1f) {
            System.out.println(i);

        }

    }

    public static void zaehlenDezimalErweitert(int count) {
        for (float i = 0; i <= count; i += 0.1f) {
            System.out.printf("%5.1f", i);
            System.out.println();

        }
    }

    public static void teilenHerrschen(int count) {
        for (int i = 0; i <= count; i++) {
            System.out.println(i / 5);


        }
    }

    public static void teilenHerrschen2(float count) {
        for (float i = 0; i <= count; i++) {
            System.out.println(i / 5);
        }

    }

    public static void leibnizReihe(int count) {
        double pi=0;
        boolean jump = true;
        for (int i = 1; i <= count; i= i+2) {
            if (jump){
                pi=pi + 4f / i;
                jump=false;
            } else {
                pi=pi - 4f / i;
                jump=true;
            }
        }
        System.out.println(pi);
    }

    public static void nilakanthaReihe(int count) {
        // ++i bedeutet: i = i + 1
        // operation += bedeutet: operation = operation, es ist eine kürzere schreibweise.

    double summePi = 3;
    int base = 2;
    int vorzeichen = 1;
        for (int i = 1; i <= count ; i = i+1) {
            summePi +=  vorzeichen * 4.0 / (base * (base + 1) * (base + 2));
            vorzeichen *= -1; // das sich die vorzeichen ändern, einmal plus einmal minus.
            base += 2; // um zwei erhöhen bei jeder klammer.

            System.out.println(summePi);
        }
    }
}
