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

        public static void main(String[] args) {
        printTriangleBottomLeft("x", 4);

    }
}
