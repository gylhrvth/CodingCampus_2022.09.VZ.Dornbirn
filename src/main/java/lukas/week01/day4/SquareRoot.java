package lukas.week01.day4;

public class SquareRoot {
    public static void main(String[] args) {
        double goal = 1297419;
        double min = 0;
        double max = goal;

        for (int i = 0; i < 100; i++) {
            double half = (min + max) / 2;
            double square = half * half;
            if (square >= goal) {
                max = half;
            } else {
                min = half;
            }

            double offset = Math.abs(100 - 100.0f/goal*square);
            if(offset <= 0.01) {
                System.out.println(i);
            } else {
                System.out.println();
            }
        }

        System.out.println("min: " + min + " max: " + max);
    }
}
