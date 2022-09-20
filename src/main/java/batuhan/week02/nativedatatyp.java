package batuhan.week02;

public class nativedatatyp {
    public static void main(String[] args) {
//        factorCalc(10);
//        smallSteps();
//        smallSteps2();
//        splittSteps();
        leinbnizReihe();
        NilakanthaReihe();
    }

    //
//    static void factorCalc(int f) {
//        int result = 1;
//        for (int i = 1; i <= f; i++) {
//            result = result * i;
//
//            System.out.printf(" resut %10d%n", result);
//        }
//        System.out.println();
//    }
//
//
//    static void smallSteps() {
//        for (float f = 0.1f; f <=100f; f += 0.1f) {
//            System.out.println(f);
//            System.out.printf("Formatiert: %18.1f\n", f);
//
//        }
//        System.out.println();
//    }
//
//    public static void smallSteps2() {
//        for (int i = 1; i <= 1000 ; i++) {
//            System.out.println(i / 10f);
//        }
//        System.out.println();
//    }
//    static void splittSteps() {
//        for (int i = 0; i <= 20; i++) {
//            int result = i / 5;
//            float result2 = i / 5.0f;
//            System.out.printf("count = %2d" ,i);
//            System.out.printf("   count / 5 = %2d",result);
//            System.out.printf("   count / 5.0 = %2.1f%n", result2);
//
//
//        }
//    }
    static void leinbnizReihe() {
        int neg = -4;
        double pi = 0;
        for (int i = 0; i <= 100000; i++) {
            neg = neg * -1;
            pi += neg / (i * 2 + 1.0);

        }
        System.out.println(pi);
    }

    static void NilakanthaReihe() {
        double nenner = 0;
        int neg = -4;
        double pi = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                nenner = i * (i + 1.0) * (i + 2.0);
                neg = neg * -1;
                pi += neg / nenner;
            }



        }
        System.out.print(3 + pi);


    }


}





