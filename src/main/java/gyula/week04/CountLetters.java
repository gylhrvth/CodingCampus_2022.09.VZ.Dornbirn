package gyula.week04;

public class CountLetters {
    public static void main(String[] args) {
        String text = lukas.data.Texts.getSimpleText();

        int[] count = countLettersInText(text);
        printStatistic(count);
    }

    public static int[] countLettersInText(String input){
        int[] count = new int[Character.MAX_VALUE + 1];

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            ++count[c];
        }

        return count;
    }

    public static void printStatistic(int[] stats){
        for (int i = 0; i < stats.length; i++) {
            if (stats[i] > 0) {
                //System.out.println((char)i + " (" + i +"): " + stats[i]);
                String charName;
                if (i < 33){
                    charName = Character.getName(i);
                } else {
                    charName = Character.toString((char)i);
                }
                System.out.printf("%5d | (%5d) %s%n", stats[i], i, charName);
/*
                System.out.printf("%5d | (%5d) %s%n", stats[i], i,
                        i < 33 ? Character.getName(i) : (char)i);
 */
            }
        }
    }
}
