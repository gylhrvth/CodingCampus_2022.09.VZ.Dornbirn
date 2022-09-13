package viktor.week01;

public class FunctionPrintTrinangle {

    public static void printTriangleBottomLeft(String f, int rows){
        System.out.println(f);
        for(int j = 2; j <= rows; j++) {
            for (int i = 1; i <= j; i++) {
                System.out.print(f);
            }
            System.out.println();
         }

        }


       public static void printTriangleTopLeft(String f, int rows){

        for(int j = rows; j >= 1; j--) { // Wiederholung laut Zeile
            for (int i = 1; i <= j; i++) //string nebeneinander
            {
                System.out.print(f);
            }
            System.out.println(); //neue Zeile
        }
    }

    public static void printTriangleTopRight(String f, int rows) {

            for (int j = 1; j <= rows; j++) { // Anfang der zweiten Zeile
                for (int s = 1; s < j; s++) { // Leer-Zeichen schreiben
                    System.out.print(" ");
                }
                for (int k = 1; k <= rows - j + 1; k++) {
                    System.out.print(f);
                }
                System.out.println();
            }
    }


    public static void printTriangleTopRight2(String f, int rows) {
        for(int j = 1; j <= rows; j++) {
            for (int i = 1; i <= rows; i++) {
                if (i < j) {
                    System.out.print(" ");
                } else {
                    System.out.print(f);
                }
            }
            System.out.println();
        }
    }



        public static void main(String[] args) {
        printTriangleBottomLeft("x", 5);
        System.out.println("\n");
        printTriangleTopLeft("x",5);
        System.out.println("\n");
        printTriangleTopRight("x",5);
        System.out.println("\n");
        printTriangleTopRight2("T", 5);

    }
}
