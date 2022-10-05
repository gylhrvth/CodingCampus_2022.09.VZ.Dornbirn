package gyula.week04;

public class CharNames {
    public static void main(String[] args) {
        for (char c = 0; c < 128; c++) {
            System.out.println(Character.getName(c));
        }
    }
}
