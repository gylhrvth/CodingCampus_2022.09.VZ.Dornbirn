package franz.week02;

public class Example {
    public static void main(String[] args) {
        chars("x", 5);
        System.out.println("\n");
        square("x", 5, 5);
    }

    private static void chars(String string , int size) {
        for (int i = 0; i <size ; i++) {
            System.out.print(string);
        }
    }
    private static void square(String string, int size, int shouted){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <shouted ; j++) {
                System.out.print(string);

            }System.out.println("");
        }
    }

}
