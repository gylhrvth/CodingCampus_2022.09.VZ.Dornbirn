package mase.week01;

public class forLoops {
    public static void main(String[] args) {
        loopPatternChars("x", 10);
        System.out.println("--------------");
        loopSquare("x ", 10);
        System.out.println("--------------");
        loopRectangle("x", 10, 3);
        System.out.println("--------------");
        loopTriangle("x ", 4);
        System.out.println("--------------");
        loopTriangleBack("x ", 5);
    }

    public static void loopPatternChars(String x, int size) {
        for (int i = 0; i <= 10; i++) {
            System.out.print(x);
        }
        System.out.println();
    }

    public static void loopSquare(String x, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(x );
            }
            System.out.println();
        }
    }
    public static void loopRectangle(String Letter, int rows, int size){
        for (int i = 0; i < size ; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(Letter);
            }
            System.out.println();
        }

    }
    public static void loopTriangle(String Letter, int rows){
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < i +1 ; j++) {
                System.out.print(Letter);
            }

            System.out.println();
        }
    }
    public static void loopTriangleBack(String Letter, int size){
        for (int i = size; i >= 1 ;i--) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(Letter);

            }
            System.out.println();
        }
            }


    }



