package stefan.Test;

public class Schachbrett {
    public static void main(String[] args) {


        int number1 = 100;
        int number2 = 100;
        for (
                int i = 0;
                i < number1; i++) {
            for (int j = 0; j <= number2; j++) {
                System.out.print((i + j) % 2 == 1 ? "#" : '_');


            }
            System.out.println();
        }

    }
}