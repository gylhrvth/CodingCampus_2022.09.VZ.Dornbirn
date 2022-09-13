package fatima.week01;

public class Counting {
    public static void main(String[] args) {
        for (int i = 1; i < 10; ++i) {
            System.out.print(i);
            if (i == 1) {
                System.out.print("st");
            } else if (i == 2) {
                System.out.print("nd");
            } else if (i == 3) {
                System.out.print("rd");
            } else {
                System.out.print("th");
            }
            System.out.println(" Hello World!");
        }
    }
}
