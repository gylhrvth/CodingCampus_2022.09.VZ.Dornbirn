package viktor.week01;

public class FunctionPrint {

    public static void printChars(String f, int n){
        for(int i=1; i <= n; i++)
        {
            System.out.print(f);
        }
    }

    public static void main(String[] args) {
        printChars("x",10);
        System.out.println();



    }
}
