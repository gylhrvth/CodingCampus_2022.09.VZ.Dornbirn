package michel.week03;

import java.util.Arrays;

public class CopyArray {                                    // FEHLER WAR KLAMMERN DER FOR SCHLEIFE FALSCH GESETZT GG
    public static void main(String[] args) {
        int[] original = new int[10];                       // Erstellt ein "Array" mit 4 "Schubladen"

        for (int i = 0; i < original.length; i++) {         // original.length ist die anzahl der "Schubladen"
            original[i] = 10 * (i + 1);                     // Erstellt den Ausgabewert für "Schubladen" 1-4 (0-3 daher +1)
        }

        int[] copy = makeACopy(original);                   // Erstellt einen neuen "Array" mit der kopie aufgerufen durch die Funktion makeACopy(original)

        copy[1] = -100;                                     //Mit diesem Wert wird geprüft ob die Kopie auch wirklich ein eigenes Array ist

        System.out.println("Original: " + Arrays.toString(original));
        System.out.println("Kopie   : " + Arrays.toString(copy));
    }

    public static int[] makeACopy(int[] original) {
        int[] copy = new int[10];                           // Erstellen eines Arrays mit 4 Plätzen 0-3

        for (int i = 0; i < original.length; i++) {         // Befüllen der neuen Plätze
            copy[i] = original[i];                          // mit den Werten von original i
        }

        return copy;
    }
}
