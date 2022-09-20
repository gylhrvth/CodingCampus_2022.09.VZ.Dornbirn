package patric.week01;

public class Faktorial {
    public static void main(String[] args) {
        int i,fact=1;
        int number=20;
        for(i= 1;i<= number; i++){
            fact=fact*i;
        }
        System.out.println("Factional of" +number+ "is"+fact);

    }
}
