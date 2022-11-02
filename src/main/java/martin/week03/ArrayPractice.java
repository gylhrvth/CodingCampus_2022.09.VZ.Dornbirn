package martin.week03;

import martin.week01.MethodenUndSchleifen;
import martin.week02.UserInput;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayPractice {
    private static final Random rand = new Random();
    public static final String ANSI_WBG = "\u001B[7m";

    public static void main(String[] args) {
        MethodenUndSchleifen.head("#", "Number Array");
        int arrayLength0 = UserInput.readUserInputInt(100, -1, "Geben sie bitte die Länge des Arrays an. ");
        System.out.println();
        int[] array1 = numberArrayForw(arrayLength0);
        int[] array2 = numberArrayBackw(arrayLength0);
        System.out.printf("Forward  Array 1: %s%n", Arrays.toString(array1));
        System.out.printf("Backward Array 2: %s%n%n", Arrays.toString(array2));
        MethodenUndSchleifen.head("#", "Kopie");
        int arrayChoice = UserInput.readUserInputInt(3, 0, "Geben sie an ob Array 1 oder 2 kopiert werden soll. (1/2) ");
        System.out.println();
        int[] array3;
        if (arrayChoice == 1) {
            array3 = makeACopy(array1);
            //array1[0] = -100;
            System.out.printf("Array 1   : %s%n", Arrays.toString(array1));
        } else {
            array3 = makeACopy(array2);
            //array2[0] = -100;
            System.out.printf("Array 2   : %s%n", Arrays.toString(array2));
        }
        System.out.printf("Copy Array: %s%n%n", Arrays.toString(array3));
        MethodenUndSchleifen.head("#", "Random Number Array");
        int arrayLength1 = UserInput.readUserInputInt(100, 9, "Geben sie bitte die Länge des Zufalls Arrays an. ");
        int[] arrayRandom1 = randArray(arrayLength1, 0, 101);
        System.out.print("Unterpunkt 1: ");
        printArrayForEach(arrayRandom1);
        System.out.print("Unterpunkt 2: ");
        printArrayForI(arrayRandom1);
        System.out.print("Unterpunkt 3: ");
        System.out.printf("[%d, %d, %d]%n", arrayRandom1[1], arrayRandom1[4], arrayRandom1[9]);
        System.out.print("Unterpunkt 4: ");
        printArrayEveryOther(arrayRandom1);
        System.out.println();
        MethodenUndSchleifen.head("#", "Random Number Array Crazy Range");
        int arrayLength2 = UserInput.readUserInputInt(101, -1, "Geben sie bitte die Länge des Zufalls Arrays an. ");
        System.out.println();
        int[] arrayRandom2 = randArray(arrayLength2, -50, 51);
        System.out.printf("Crazy Random Array: %s%n%n", Arrays.toString(arrayRandom2));
        MethodenUndSchleifen.head("#", "Random Number Array Zählen");
        int arrayLength3 = UserInput.readUserInputInt(100, -1, "Geben sie bitte die Länge des Zufalls Arrays an. ");
        int[] arrayRandom3 = randArray(arrayLength3, 0, 101);
        System.out.println(Arrays.toString(arrayRandom3));
        System.out.printf("Anzahl Werte über 30 = %d.%n%n", getArrayValuesFromTo(arrayRandom3, 31, Integer.MAX_VALUE));
        MethodenUndSchleifen.head("#", "Random Number Array Summe");
        int arrayLength4 = UserInput.readUserInputInt(100, -1, "Geben sie bitte die Länge des Zufalls Arrays an. ");
        int[] arrayRandom5 = randArray(arrayLength4, 0, 101);
        System.out.println(Arrays.toString(arrayRandom5));
        System.out.printf("Summe des Array = %d.%n%n", getArraySum(arrayRandom5));
        MethodenUndSchleifen.head("#", "Random Number Array Min/Max/Avg");
        int arrayLength6 = UserInput.readUserInputInt(100001, -1, "Geben sie bitte die Länge des Zufalls Arrays an. ");
        System.out.println();
        int[] arrayRandom6 = randArray(arrayLength6, 0, 101);
        System.out.printf("Random Number Array Min/Max/Avg Liste = %s%n", Arrays.toString(arrayRandom3));
        System.out.printf("Das Minimum ist %d, das Maximum ist %d und der Durchschnitt ist %.2f.%n%n", getArrayMinimum(arrayRandom3), getArrayMaximum(arrayRandom3), getArrayAverage(arrayRandom3));
        MethodenUndSchleifen.head("#", "Bubblesort mit Zahlen");
        int arrayLength7 = UserInput.readUserInputInt(1001, -1, "Geben sie bitte die Länge des Zufalls Arrays an. ");
        System.out.println();
        int[] arrayRandom7 = randArray(arrayLength7, 0, 101);
        System.out.printf("Bubblesort mit Zahlen Liste Zufall  = %s%n", Arrays.toString(arrayRandom7));
        int[] arraySorted1 = makeACopy(arrayRandom7);
        algBubbleSort(arraySorted1);
        System.out.printf("Bubblesort mit Zahlen Liste Sortiert= %s%n", Arrays.toString(arraySorted1));
        MethodenUndSchleifen.head("#", "2D-Array");
        int arrayRows1 = UserInput.readUserInputInt(1001, -1, "Geben sie bitte die Zeilenanzahl  des 2D Arrays an. ");
        int arrayColumns1 = UserInput.readUserInputInt(1001, -1, "Geben sie bitte die Spaltenanzahl des 2D Arrays an. ");
        int[][] array2DRandom = rand2DArray(arrayRows1, arrayColumns1, 0, 101);
        print2DArray(array2DRandom,false);
        System.out.println(Arrays.toString(get2DArraySum(array2DRandom, UserInput.readUserInputBool("j=Zeilensumme, n=Spaltensumme"))));
        MethodenUndSchleifen.head("#", "Pascal Dreieck");
        print2DArray(pascalTriangle(UserInput.readUserInputInt(50, -1, "Wie groß soll das Pascaldreieck sein? ")), true);
        MethodenUndSchleifen.head("#", "Formular Generieren (Anw. von Pascal Dreieck)");
        int binomGroesse = UserInput.readUserInputInt(Integer.MAX_VALUE, 0, "Geben sie bitte n, für die Binomeberechnung (a+b)^n, an. ");
        System.out.println(generateBinomeFunktion(binomGroesse) + "\n");
        MethodenUndSchleifen.head("#", "patric/week08/TicTacToe");
        TicTacToe();

    }

    public static int[] numberArrayForw(int length) {
        int[] numArrayForw = new int[length];
        for (int i = 0; i < length; i++) {
            numArrayForw[i] = i + 1;
        }
        return numArrayForw;
    }

    public static int[] numberArrayBackw(int length) {
        int[] numArrayBackw = new int[length];
        for (int i = 0; i < length; i++) {
            numArrayBackw[i] = length - i;
        }
        return numArrayBackw;
    }

    public static int[] makeACopy(int[] original) {
        int[] copy = new int[original.length];
        //System.arraycopy(original, 0, copy, 0, original.length);
        // TODO: 27.09.2022 Create a for-i loop to copy each element by element
        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }
        return copy;
    }

    private static void printArrayForEach(int[] arrayName) {
        System.out.print("[");
        boolean firstLine = true;
        for (int j : arrayName) {
            if (firstLine) {
                firstLine = false;
            } else {
                System.out.print(", ");
            }
            System.out.print(j);
        }
        System.out.println("]");
    }

    private static void printArrayForI(int[] arrayName) {
        System.out.print("[");
        boolean firstLine = true;
        for (int i = 0; i < arrayName.length; i++) {
            if (firstLine) {
                firstLine = false;
            } else {
                System.out.print(", ");
            }
            System.out.print(arrayName[i]);
        }
        System.out.println("]");
    }

    private static void printArrayEveryOther(int[] arrayName) {
        System.out.print("[");
        boolean firstLine = true;
        for (int i = 1; i < arrayName.length; i = i + 2) {
            if (firstLine) {
                firstLine = false;
            } else {
                System.out.print(", ");
            }
            System.out.print(arrayName[i]);
        }
        System.out.println("]");
    }

    public static int[] randArray(int size, int minRandom, int maxRandom) {
        int[] randArray = new int[size];
        for (int i = 0; i < size; i++) {
            int randNum = rand.nextInt(maxRandom - minRandom) + minRandom;
            randArray[i] = randNum;
        }
        return randArray;
    }

    public static int getArrayValuesFromTo(int[] arrayName, int min, int max) {
        int values = 0;
        for (int currentValue : arrayName) {
            if (currentValue >= min && currentValue <= max) {
                values += 1;
            }
        }
        return values;
    }

    public static int getArraySum(int[] arrayName) {
        int sum = 0;
        for (int currentValue : arrayName) {
            sum += currentValue;
        }
        return sum;
    }

    public static int getArrayMinimum(int[] arrayName) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arrayName.length; i++) {
            if (arrayName[i] < min) min = arrayName[i];
        }
        return min;
    }


    public static int getArrayMaximum(int[] arrayName) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arrayName.length; i++) {
            if (arrayName[i] > max) {
                max = arrayName[i];
            }
        }
        return max;
    }

    public static double getArrayAverage(int[] arrayName) {
        if (arrayName.length == 0) return 0;
        double avg = 0;
        for (int i = 0; i < arrayName.length; i++) {
            avg = avg + arrayName[i];
        }
        avg = avg / arrayName.length;
        return avg;
    }

    public static void algBubbleSort(int[] sortArray) {
        for (int j = 0; j < sortArray.length; j++) {
            for (int i = 0; i + 1 < sortArray.length; i++) {
                if (sortArray[i] > sortArray[i + 1]) {
                    int k = sortArray[i];
                    sortArray[i] = sortArray[i + 1];
                    sortArray[i + 1] = k;
                }
            }
        }
    }

    public static int[][] rand2DArray(int rows, int columns, int minRandom, int maxRandom) {
        int[][] randArray = new int[rows][columns];
        for (int w = 0; w < rows; w++) {
            for (int h = 0; h < columns; h++) {
                int randNum = rand.nextInt(maxRandom - minRandom) + minRandom;
                randArray[w][h] = randNum;
            }
        }
        return randArray;
    }


    public static void print2DArray(int[][] arrayName, boolean printPhatValues) {
        if (!printPhatValues) {
            for (int[] currentArray : arrayName) {
                System.out.println(Arrays.toString(currentArray));
            }
        } else {
            for (int[] currentArray : arrayName) {
                System.out.print("[");
                boolean firstLine = true;
                for (int j : currentArray) {
                    if (firstLine) {
                        firstLine = false;
                    } else {
                        System.out.print(" ");
                    }
                    System.out.printf("%7d", j);
                }
                System.out.println("]");
            }
            System.out.println();
        }
    }

    public static int[] get2DArraySum(int[][] arrayName, boolean rowTrueElseColumn) {
        int columns = arrayName.length;
        int rows = arrayName[0].length;
        int[] sum;
        int[] line;
        if (rowTrueElseColumn) {
            sum = new int[columns];
            for (int column = 0; column < columns; column++) {
                line = arrayName[column];
                sum[column] = getArraySum(line);
            }
        } else {
            sum = new int[rows];
            for (int row = 0; row < rows; row++) {
                line = new int[columns];
                for (int column = 0; column < columns; column++) {
                    line[column] = arrayName[column][row];
                }
                sum[row] = getArraySum(line);
            }
        }
        return sum;
    }

    public static int[][] pascalTriangle(int size) {
        int[][] pascal = new int[size][size];
        for (int row = 0; row < size; row++) {
            Arrays.fill(pascal[row], 1);
        }
        for (int i = 1; i < size; i++) {
            for (int j = 1; j < size; j++) {
                pascal[i][j] = pascal[i - 1][j] + pascal[i][j - 1];
            }
        }
        return pascal;
    }

    public static String generateBinomeFunktion(int n) {
        String formel = "(a+b)^" + n + " = a^" + n;
        int[][] zahlTab = pascalTriangle(n + 1);
        for (int i = 1; i < n; i++) {
            formel += " + ";
            if (zahlTab[n - i][i] > 1) {
                formel += zahlTab[n - i][i];
            }
            formel += "a";
            if (n - i > 1) {
                formel += "^" + (n - i);
            }
            formel += "b";
            if (i > 1) {
                formel += "^" + i;
            }
        }
        formel += " + b^" + n;
        return formel;
    }

    public static void TicTacToe() {
        int[] row1 = {11, 12, 13};
        int[] row2 = {21, 22, 23};
        int[] row3 = {31, 32, 33};
        int[][] spielfeld = {row1, row2, row3};
        boolean neuerZug;
        boolean spieler1win = false;
        boolean spieler2win = false;
        boolean spieler1AmZug = true;
        int posRow;
        int posCol;
        int spielerSymbol;
        int[] sumSpalten = new int[3];
        int[] sumZeilen = new int[3];
        int sumDiag1;
        int sumDiag2;
        Scanner sc = new Scanner(System.in);
        System.out.printf("%sInitialisere TicTacToe%n%sJeweiliger Spieler plaziert seine Zahl.%n", "\u001B[31m", "\u001B[0m");
        print2DArray(spielfeld, false);
        spielfeld = new int[3][3];
        for (int i = 0; i < 10; i++) {
            neuerZug = true;
            sumZeilen = get2DArraySum(spielfeld, true);
            sumSpalten = get2DArraySum(spielfeld, false);
            sumDiag1 = spielfeld[0][0] + spielfeld[1][1] + spielfeld[2][2];
            sumDiag2 = spielfeld[0][2] + spielfeld[1][1] + spielfeld[2][0];
            System.out.println("Sum Spalten: " + Arrays.toString(sumSpalten));
            System.out.println("Sum Zeilen : " + Arrays.toString(sumZeilen));
            System.out.println(spielfeld[2][0]);

            if (spieler1win) {
                System.out.printf("%sGratuliere Spieler 1.%s", "\u001B[31m", "\u001B[0m");
                break;
            }
            if (spieler2win) {
                System.out.printf("%sGratuliere Spieler 2.%s", "\u001B[31m", "\u001B[0m");
                break;
            }
            if (spieler1AmZug) {
                spieler1AmZug = false;
                spielerSymbol = 1;
            } else {
                spieler1AmZug = true;
                spielerSymbol = 2;
            }
            while (neuerZug) {
                posRow = UserInput.readUserInputInt(3, 0, "Gibt bitte die Zeile an.");
                posCol = UserInput.readUserInputInt(3, 0, "Gibt bitte die Spalte an.");
                if (spielfeld[posRow - 1][posCol - 1] > 0) {
                    System.out.println("Feld ist Belegt, bitte wähle ein anderes.");
                } else {
                    spielfeld[posRow - 1][posCol - 1] = spielerSymbol;
                    neuerZug = false;
                }
                print2DArray(spielfeld, false);
            }
        }
        if (!spieler1win && !spieler2win) {
            System.out.println("Unentschieden :c");
        }
    }

    public static boolean arrayRowColumnDiagEqualTo(int[][] abfrageArray, int equalToWhat) {
        boolean allEqual = false;
        int[] diagArray1 = new int[abfrageArray.length];
        int[] diagArray2 = new int[abfrageArray.length];
        int[] equalArray = new int[abfrageArray.length];
        Arrays.fill(equalArray, equalToWhat);
        int row;
        int column;
        int diagonal;
        for (int i = 0; i < abfrageArray.length; i++) {
            for (int j = 0; j < abfrageArray[i].length; j++) {
                System.out.println("test");
            }
        }
        return allEqual;
    }
}