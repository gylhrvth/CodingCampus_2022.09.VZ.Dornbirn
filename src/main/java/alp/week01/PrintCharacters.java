package alp.week01;

public class PrintCharacters {

    public static void main(String[] args) {
        printchars("x",5);
        System.out.println();
        printsquare("a",10);
        System.out.println();

    }

    public static void printchars(String x, int size) {
        for (int i =0; i< size; ++i) {
            System.out.print(x);
        }
        System.out.println();
    }

    public static void printsquare(String x, int length) {
        for (int rows = 0; rows < length; rows++){
            for (int i = 0; i< length; i++){
                System.out.print(x);
            }
            System.out.println();
        }

    }
        {

        }
    }
