package patric.week04;

public class Reverse {

    public static void main(String[] args) {
        Split();

    }

    public static void Split() {

        String source = "Alles verdreht!";

        for (String part : source.split(" ")) {
            System.out.print(new StringBuilder(part).reverse());
            System.out.print(" ");
        }
    }

}
