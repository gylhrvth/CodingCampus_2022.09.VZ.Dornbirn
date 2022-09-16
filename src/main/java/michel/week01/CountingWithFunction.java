package michel.week01;

import patric.week01.PrintCharacters;

import java.sql.SQLOutput;

public class CountingWithFunction {
    public static void main(String[] args) {

        /*printChars("x", 10);
        System.out.println();

        printSquare("x", 10);
        System.out.println();

        printRectangle("x", 10, 3);
        System.out.println();

        printTriangleBottomLeft("a", 4);
        System.out.println();

        printTriangleTopLeft("b", 5);
        System.out.println();

        printTriangleTopRight("c", 5);
        System.out.println();

        printTriangleBottomRight("d", 5);
        System.out.println();

        printEmtySquare("X", 10);
        System.out.println();

        printEmptySquare2("A", 3);
        System.out.println();

        printSlash("x", 3, true);
        System.out.println();
        printSlash("y", 4, false);
        System.out.println();

        printTriangle("x", 5);
        System.out.println();

        printRombus("X", 7);
        System.out.println();

        printx("x", 5);
        System.out.println();*/

        printchristmasTree();
        System.out.println();

    }

    /*public static void printChars(String x, int size) {
        for (int i = 0; i < size; ++i) {
            System.out.print(x);
        }
        System.out.println();
    }

    public static void printSquare(String x, int length) {
        for (int rows = 0; rows < length; rows++) {
            for (int i = 0; i < length; i++) {
                System.out.print(x);
            }
            System.out.println();
        }
    }

    public static void printRectangle(String x, int length, int hight) {
        for (int rows = 0; rows < hight; rows++) {
            for (int i = 0; i < length; i++) {
                System.out.print(x);
            }
            System.out.println();
        }
    }

    public static void printTriangleBottomLeft(String x, int rows) {
        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j <= i; ++j) {
                System.out.print(x);
            }
            System.out.println();
        }
    }

    public static void printTriangleTopLeft(String x, int rows) {
        for (int i = rows; i >= 1; --i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print(x);
            }
            System.out.println();
        }
    }

    public static void printTriangleTopRight(String x, int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                if (j < i) {
                    System.out.print(" ");
                } else {
                    System.out.print(x);
                }

            }
            System.out.println();
        }
    }

    /*   public static void printTriangleTopRight(String x, int rows){
           for (int i = rows; i > 0; --i) {
               for (int j = 1; j <= rows-i; ++j) {

                   System.out.print(" ");
               }
               for(int k = 0; k<i; ++k){
                   System.out.print(x);
               }
               System.out.println();
           }
       }
       public static void printTriangleBottomRight(String x, int rows){
           for (int i = 1; i <= rows; i++) {
               for (int j = 1; j < rows; j++) {
                   if(j <= rows -i){
                       System.out.print(" ");
                   }
                   else {
                       System.out.print(x);
                   }
               }
               System.out.println(x);
           }
       }

       public static void printTriangleBottomRight(String x, int rows){
           for(int i = 0; i < rows; ++i) {
               for (int j = 0; j < rows-i-1; ++j) {
                   System.out.print(" ");
               }
               for(int k = 0; k <= i; ++k){
                   System.out.print(x);
               }
               System.out.println();
           }
       }

    public static void printEmtySquare(String x, int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (i == 1 || i == size || j == 1 || j == size)
                    System.out.print(x);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void printEmptySquare2(String a, int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (i == 1 || i == size || j == size || j == 1)
                    System.out.print(a);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void printSlash(String x, int size, boolean isBackSlash) {
        if (isBackSlash) {
            printBackSlash(x, size);
        } else {
            printForwardSlash(x, size);
        }
    }

    private static void printBackSlash(String x, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    System.out.print(x);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void printForwardSlash(String x, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i + j == size - 1) {
                    System.out.print(x);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printTriangle(String x, int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < 2 * height - 1; j++) {
                if (i + j == height - 1) {
                    System.out.print(x);
                } else if (i == j - height + 1) {
                    System.out.print(x);
                } else if (i == height - 1) {
                    System.out.print(x);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

   public static void printRombus(String letter, int height) {

        int size = (height-1) / 2;

        for (int i = 0; i < height; i++) {  //number of rows
            for (int j = 0; j < height; j++) { //number columns
                if (j == size - i) {
                    System.out.print("x ");
                } else if (i == j - size) {
                    System.out.print("x ");
                } else if (j == i - size) {
                    System.out.print("x ");
                }
                else if (j + i == size *3){
                    System.out.print("x");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }


    public static void printx(String x, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    System.out.print(x);

                } else if (i + j == size - 1) {
                    System.out.print(x);
                }else {
                    System.out.print(" ");
                }
            }System.out.println();
        }

    }*/

    public static void printchristmasTree(){

    }
}



