package patric.week01;

public class PrintCharacter2 {
    public static void main(String[] args) {
        printRectangle("x ", 10, 3);
        System.out.println();
        printTriangleBottomLeft("f ", 4);
        System.out.println();
        printTriangleTopLeft("z", 5);
        System.out.println();
       /* printTriangleBottomRight("o", 5);*/

    }


    public static void printRectangle(String x, int length, int hight) {
        for (int rows = 0; rows < hight; rows++) {
            for (int i = 0; i < 10; i++)
                System.out.print(x);
            {
                System.out.println();
            }
        }
    }


    public static void printTriangleBottomLeft(String x, int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(x);
            }
            System.out.println();

        }
    }


    public static void printTriangleTopLeft(String x, int rows) {
        for (int j = rows; j >= 1; j--) {
            for (int i = 1; i <= j; i++) {
                System.out.print(x);
            }
            System.out.println();

        }
    }

  /*  public static void printTriangleBottomRight(String x, int size) {
        for (int j = size; j >= 1; j--) {
            for (int i = 1; i <= j; i++) {
                System.out.print(x);
            }
            for (int k = 0; k < i + 1; k++) {
                System.out.println(x);
            }
            System.out.println();

        }
    }

*/
}













