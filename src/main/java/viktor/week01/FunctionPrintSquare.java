package viktor.week01;

public class FunctionPrintSquare {

    public static void printSquare(String f, int n){
        for(int j =1; j <= n; j++) {
            for (int i = 1; i <= n; i++) {
                System.out.print(f);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        printSquare("x", 10);


    }
}
