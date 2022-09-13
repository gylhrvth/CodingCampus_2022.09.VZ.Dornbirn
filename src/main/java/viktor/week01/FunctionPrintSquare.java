package viktor.week01;

public class FunctionPrintSquare {

    public static void PrintSquare(String f, int n){
        for(int j =1; j <= n; j++) {
            for (int i = 1; i <= n; i++) {
                System.out.print(f);
            }
            System.out.println(f);
        }

    }

    public static void main(String[] args) {
        PrintSquare("x", 10);


    }
}
