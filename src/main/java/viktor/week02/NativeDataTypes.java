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

    public static void leibniz(){

        double result= 4;
        int neg = 1;

        for(int j = 1;j <= 200000; j++){
            neg = neg * -1;
            result += neg * 4/(2 * j + 1.0);
        }
        String t ="Pi ~";
        System.out.printf("%15s %10.20f%n",t,result);

        }

    public static void nilakantha(){
         double result = 3;
         int neg = -1;
         for(int i=1; i<=100; i+=2){
                 neg = neg * -1;
                 result+= neg * 4.0/((i+1)*(i+2)*(i+3));
         }
        System.out.println("Nilakantha PI ~:" + result);

    }



    public static void main(String[] args) {
        faktorial();
        System.out.println("\n");
        taskThree();
        System.out.println("\n");
        taskFour();
        System.out.println("\n");
        leibniz();
        System.out.println("\n");
        nilakantha();





        }

        }





