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

        for(int j = rows; j >= 1; j--) {
            for (int i = 1; i <= j; i++)
            {
                System.out.print(f);
            }
            System.out.println();

        }

    }




        public static void main(String[] args) {
        printTriangleBottomLeft("x", 5);
        System.out.println("\n");
        printTriangleTopLeft("x",5);
        System.out.println("\n");
    }
}
