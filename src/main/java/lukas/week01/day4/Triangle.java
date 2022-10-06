package lukas.week01.day4;

public class Triangle {
    public static void main(String[] args) {
        System.out.println("Change");
        printTriangle("x", 10);
    }

    private static void printTriangle(String text, int height) {
        //Zeile für Zeile
        for (int i = 0; i < height - 1; i++) {
            //Leerzeichen bis zum ersten "x"
            for (int j = 0; j < height - i - 1; j++) {
                System.out.print(" ");
            }
            //Erste "x"
            System.out.print(text);

            //Ab zeile 2
            if (i >= 1) {
                //Leerzeichen bis zum 2ten "x"
                for (int j = 0; j < i * 2 - 1; j++) {
                    System.out.print(" ");
                }
                //"x"
                System.out.print(text);
            }
            //Neue Zeile beginnt
            System.out.println();
        }

        //Boden
        for (int i = 0; i < height * 2 - 1; i++) {
            System.out.print(text);
        }
    }
}
