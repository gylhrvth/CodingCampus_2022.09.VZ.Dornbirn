package gyula.week06;

public class IsLatin {
    public static void main(String[] args) {
        char[] eachChars = new char[1 + Character.MAX_VALUE];
        for (int c = 0; c < 1 + Character.MAX_VALUE; c++) {
            eachChars[c] = (char) c;
        }
        String longText = String.valueOf(eachChars);
        System.out.println(longText.replaceAll("\\P{IsLatin}", ""));
    }
}
