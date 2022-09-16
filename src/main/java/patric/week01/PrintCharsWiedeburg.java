package patric.week01;



public class PrintCharsWiedeburg {

    public static void main(String[] args) {
        PrintChars("x",10);
        System.out.println();
        PrintSquare("x",10);
        System.out.println();



    }


    public static void PrintChars(String text, int length) {
        for (int i = 0; i < length; i++) {
            System.out.print(text);

        }
        System.out.println();

    };


    public static void PrintSquare(String text, int length) {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j <length ; j++) {
                System.out.print(text);

            }
            System.out.println();

        }
    };

























}