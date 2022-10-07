package fatima.week04;

public class CountLettersString {
    public static void main(String[] args) {
        String text = lukas.data.Texts.getSimpleText();
        System.out.println(text);
        int[] count = countLetters(text);

        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                System.out.println((char)i + ": " + count[i]);
            }
        }
    }

    public static int[] countLetters(String text) {
        int[] count = new int[Character.MAX_VALUE + 1];
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            ++count[c];
        }
        return count;
    }
}
