package martin.week01.schleifen;

public class AufgabeRewind {
    public static void main(String[] args) {
        int i = 10; {
            while (i >= -10) {
                System.out.println(i);
                i = i - 1;
            }
        }
    }
}
