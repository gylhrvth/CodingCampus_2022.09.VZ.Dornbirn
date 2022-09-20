package viktor.week02;

public class NativeDataTypes {

    public static void faktorial() {
            long result=1;
            for (long i = 1; i <= 20; i++) {
                result *= i;
                System.out.printf("%2d! = %20d%n", i, result);
            }
        }

        public static void taskThree(){
        for(int i=0; i<=1000; i++){
            System.out.printf("%5.1f%n",i/10f);
        }
    }

    public static void taskFour(){
        for(int i = 0; i <= 20; i++){
            System.out.println("Zähler: "+i);
            System.out.println("Div:"+i/5);
            System.out.println("Div mit float:"+i/5f);
            System.out.println("\n");
        }
    }





    public static void main(String[] args) {
        faktorial();
        System.out.println("\n");
        taskThree();
        System.out.println("\n");
        taskFour();
        System.out.println("\n");

        float f = 5f;
        System.out.println(f);




    }



}
