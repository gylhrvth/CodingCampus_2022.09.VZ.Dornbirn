package viktor.week01;

public class FunctionPrintRectangle {

    public static void PrintRectangle(String f, int length, int rows){
        for(int j =1; j <= rows; j++) {
            for (int i = 0; i <= length; i++) {
                System.out.print(f);
            }
            System.out.println(f);
        }
    }

    public static void main(String[] args) {

        PrintRectangle("x",10, 3);

    }
}
