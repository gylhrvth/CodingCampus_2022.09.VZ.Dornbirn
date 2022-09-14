package stefan.week01;

import org.w3c.dom.Text;

public class CountingWithFunktionen {
    public static void main(String[] args) {
        printChars("x", 10);
        System.out.println();
        printSquare("a ", 10);
        System.out.println();
        printRect("c",10, 3);
        System.out.println();
        printTriangleBottomLeft("b",5);
        System.out.println();
        printTriangleTopRight("d",5);
        System.out.println();
        printTriangleTpoRight("e",5);
    }



    public static void printChars(String text, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(text);
        }
        System.out.println();

    }


    public static void printSquare(String text, int size){

        for (int i = 0; i < size; i++){
            for (int y = 0; y  <  size; y++){
                System.out.print(text);
            }
            System.out.println();
        }
    }


    public static void printRect(String text, int size, int to){
            for (int i = 0; i < to; i++){
                for (int c = 0; c < size; c++){

                        System.out.print(text);

                }
                System.out.println();
            }

    }

    public static void printTriangleBottomLeft(String text, int size){
        for (int i = 0; i < size; i++){
             for (int b = 0; b <=i; ++b){
                System.out.print(text);
            }
            System.out.println();
        }

    }



    public static void printTriangleTopRight(String text, int size){
        for (int i = size; i >= 1; --i){
            for (int d = 1; d  <= i; ++d){
                System.out.print(text);
            }
            System.out.println();
        }

    }

    public static void printTriangleTpoRight(String text, int size){
        for (int i=size; i>= 1; --i){
            for (int e =0;e<=1  +i; ++e){
                System.out.print(" ");

            }
            for (int k=0; k<i+1; k++){
                System.out.print(text);
            }
            System.out.println();
        }
    }
}
