package bernadette.week01;

public class CountingWithFunction {

    public static void main(String[] args) {
        printChars ("X", 10 );
        printSquare( "X",10, 10 );
        printRect("X", 10, 3);
        printTriangleBottomLeft("x", 4);
        printTriangleTopLeft("X", 5);
        printTriangleBottomRight("x", 5);
        printEmptySquare("x", 10);
        printSlash("X", 3, true);
        printSlash("y", 4, false);
    }

    public static void printChars(String letter, int amount) {
        int c = 0;
        while (c < amount) {
            System.out.print(letter);
            ++c;
        }
        //System.out.println();

    }


    // 2. Aufgabe: Quader mit variabler Größe und mit angegebenem Zeichen

    public static void printSquare(String letter, int column, int rows) {
        System.out.println();
        System.out.println("2.exercise: ");
        int c = 0;
        while (c < rows) {

            for (int i = 0; i < column; ++i) {
                System.out.print(letter);
            }

            System.out.println();
            ++c;
        }
        System.out.println("\n");

    }

    // 3. Aufgabe: Viereck mit variabler Größe und mit angegebenem Zeichen

    public static void printRect(String letter, int column, int rows) {
        System.out.println();
        System.out.println("3.exercise: ");
        int c = 0;
        while (c < rows) {

            for (int i = 0; i < column; ++i) {
                System.out.print(letter);
            }

            System.out.println();
            ++c;
        }
        System.out.println();

    }

    // 4. Aufgabe: Dreieck mit variabler Größe und mit angegebenem Zeichen

    public static void printTriangleBottomLeft(String letter, int rows) {
        System.out.println();
        System.out.println("4.exercise: ");
        for (int d = 1; d <=  rows; ++d){
            printChars (letter, d );
            System.out.println();
        }
    }

    // 5. Aufgabe: Dreieck mit variabler Größe und mit angegebenem Zeichen
    public static void printTriangleTopLeft(String letter, int rows) {
        System.out.println();
        System.out.println("5.exercise: ");
        for (int d = 0; d <= rows ;++d ){
            printChars (letter, rows - d );
            System.out.println();
        }
    }
    // 5.4 Aufgabe: printTriangleBottomRight("x", 5);
    public static void printTriangleBottomRight(String letter, int rows) {
        System.out.println();
        System.out.println("5.4.exercise: ");
        for (int d = 0; d < rows ; d++) {
                printChars (" ", rows - d );
                printChars (letter, d+1);
                System.out.println();
            }
    }

    // 6. Aufgabe: emptysquare:  printEmptySquare("x", 10);
    public static void printEmptySquare(String letter, int rows) {
        System.out.println();
        System.out.println("6.exercise: ");

        printChars (letter, rows);
        System.out.println();

        for (int e = 0; e < rows -2 ; ++e){

            int space = rows - 2;
            System.out.print(letter);
            for (int f=0; f < space; ++f){
                System.out.print(" ");
            }
            System.out.println(letter);
        }

        printChars (letter, rows );
        System.out.println();
    }
    // 7. Aufgabe: Diagonale von variabler Größe, angegebene Zeichen,weiters soll der Parameter backslash angegeben werden können. Wenn backslash wahr ist, soll die Diagonale von rechts Unten nach Links Oben gehen, ansonsten umgekehrt.
    public static void printSlash(String letter, int rows, boolean choice ) {
        System.out.println();
        System.out.println("7.exercise: ");

        if (choice) {
            System.out.println(choice);

            for (int w = 0; w < rows; ++w) {

                for (int f = 0; f < w; ++f) {
                    System.out.print(" ");
                }
                System.out.println(letter);
            }
        } else  {
            System.out.println(choice);
            for (int w = rows; w > 0  ; --w) {

                for (int f = 0; f < w; ++f) {
                    System.out.print(" ");
                }
                System.out.println(letter);
            }
        }
    }
    // 8. Aufgabe: Dreieck von variabler Höhe, Höhe ist immer ungerade!


}

