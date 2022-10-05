package patric.week04;


import lukas.data.Texts;

public class BuchstabenZählen {
    public static void main(String[] args) {
        String lukas = Texts.getSimpleText();
        zahlenzaehler(lukas);
        System.out.println(lukas);
        // System.out.println(zahlenzaehler(lukas)[97]);         //zählt nur klein a=97 im text.
        printSymbols(zahlenzaehler(lukas));
    }

    public static int[] zahlenzaehler(String text) {

        int[] arr = new int[65535];
        for (int i = 0; i < text.length(); i = i + 1) {
            arr[text.charAt(i)] += 1;
        }
        return arr;

    }

    public static void printSymbols(int[] symbolsArr) {
        int symbolsPerLine = 20;
        for (char c = 32; c < symbolsArr.length; c++) {
            if (!(symbolsArr[c] == 0)) {
                System.out.print(c + " : " + symbolsArr[c] + " , ");
                symbolsPerLine-=1;
                if (symbolsPerLine==0) {
                    System.out.println();
                    symbolsPerLine = 20;
                }
            }
        }
        System.out.println();
    }




}
