package franz.week04;

public class Letters2 {

    public static void main(String[] args) {
        printChar();

    }

    private static void printChar() {
        String text = lukas.data.Texts.getSimpleText();
        char[] splititnext = text.toCharArray();
        int[] count = new int[65535];

        for (char currentChar : splititnext) {
            count[currentChar]++;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                System.out.println((char) i + ":" + count[i]);
            }
        }
    }

    }


