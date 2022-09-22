package patric.week02;

public class NativeDataTypes {

    public static void main(String[] args) {
        Faktorial(20);
        System.out.println();
        FaktorialErweitert(20);
        counting(100, (float) 0.1);
        ShareAndReign();
        leibniz();
        Nilakantha();
    }

    public static void Faktorial(int faktorial_end) {
        System.out.println("\n");
        System.out.println("exercise:1 ");
        System.out.println("\n");

        long result = 1;
        for (int i = 1; i <= faktorial_end; i++) {
            result = result * i;
            System.out.println(result);
        }


    }


    public static void FaktorialErweitert(int faktorial_end) {
        System.out.println("\n");
        System.out.println("exercise:2 ");
        System.out.println("\n");

        long result = 1;
        for (int i = 1; i <= faktorial_end; i++) {
            result = result * i;
            System.out.printf("%20d %n", result);
        }


    }


    public static void counting(int count_to, float step) {
        for (float i = 0; i <= count_to; i = i + step) {
            System.out.printf("%5.1f %n", i);
        }


    }

    public static void ShareAndReign() {


        for (int i = 0; i <= 20; i++) {
            int result1 = i / 5;
            float result2 = i / 5.0f;

            System.out.printf("result1: %-14d result2:%8.2f %n", result1, result2);
        }
    }



        public static void LeibnizV2(String[] args) {
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



    public static void Nilakantha(){
        int vorzeichen = -1;
        double piValue = 0.0;
        double sum=0;

        for (int i = 2; i < 100; i += 4) {
            vorzeichen *= 1.0;

            piValue += vorzeichen * 4.0 / i;
            System.out.println(piValue);
        }
    }


}