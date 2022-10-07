package berna.week04;
import lukas.data.Texts;

public class CountLettersOfText {

    public static void main(String[] args) {
        //choose a text as input:
        String text = Texts.getSimpleText();
        // to count all characters of your input text:
        int[] countedchar =  countCharactersOfText(text);
        // print the result as a table:
        printCountedCharsOfText(countedchar);
    }

        // idea: create an array where each existing char character gets a counter = 0; as char characters are nothing else than numbers, these numbers are the index!
        // read in the text and if a character was found (e.g. "A"), the counter of "A" = +1
        // as a result, show only the characters found in the text


    public static int[] createAllCharsArray() {


        System.out.println("Min: " + (long) Character.MIN_VALUE);
        System.out.println("Max: " + (long) Character.MAX_VALUE);

        int[] counter = new int[Character.MAX_VALUE];
        for (int i = 0; i < counter.length; i++) {
            counter[i] = 0;
        }
        return counter;
    }
    public static int[] countCharactersOfText(String inputText) {


//        Scanner sc = new Scanner(System.in);
//        sc.nextLine();

        int[] counter = createAllCharsArray();  // a general array with all chars with counter 0

        char[] fulltext = inputText.toCharArray();  // get the individual characters of the inputText

        for (int i = 0; i < fulltext.length; i++) {
            ++counter[fulltext[i]];
            //fulltext[i]... if the letter A is at fulltext[i], fulltext[i]=65
            //counter[65] = counter +1
        }
        return counter;
    }

    public static void printCountedCharsOfText(int[] countedChars){
        for (int i = 0; i < countedChars.length; i++) {
            if (countedChars[i] > 0) {      //print only characters found in the text
                //if you want to see the char, the corresponding decimal number and the number of occurences
                // System.out.println("'" + (char) i + "' " + i + " : " + countedChars[i]);
                //for chars is ' ' equal to  " " of Strings)
                System.out.printf("%-2s: %3d %n", (char)i,countedChars[i]);

            }
        }
    }
}
