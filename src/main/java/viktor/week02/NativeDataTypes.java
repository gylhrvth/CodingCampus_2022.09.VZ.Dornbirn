package viktor.week02;

public class NativeDataTypes {

    public static void faktorial(){

        long result=1;
        for(long i = 1; i <= 20; i++){
            result *= i;
        }
        System.out.println("20! = " + result);
    }

    public static void main(String[] args) {
        faktorial();



    }

}
