package berna.week01;

public class Counting { // some examples of counting with loops
    public static void main(String[] args) {
        System.out.println();
        System.out.println("1.exercise: count from 0 to 10 (incl) and print all numbers");
        System.out.println();


        for (int i = 0; i <= 10; ++i) { // ++i is the very short form of i=i+1
            System.out.print(i + ",");
        }


        System.out.println("\n");
        System.out.println("use while instead for");

        int j = 0;
        while (j <= 10) {
            System.out.print(j + ",");
            ++j;
        }

        System.out.println("\n");
        System.out.println("2.exercise: count from 0 to 10 (excl) and print all numbers ");
        System.out.println();

        for (int i = 0; i <= 9; ++i) {
            System.out.print(i + ",");
        }

        System.out.println("\n");
        System.out.println("3.1 exercise: count from 0 to 10 (incl) and print only even numbers");
        System.out.println();

        for (int i = 1; i <= 10; ++i) {

            if (i % 2 == 0) {       // % is the modulus-operator and gives the rest of a division, if rest=0, then the number is even
                System.out.print(i + ",");
            }
        }


        System.out.println("\n");
        System.out.println("3.2 exercise: count from 0 to 10 (incl) and use only even counters");
        System.out.println();

        int k = 1;
        while (k <= 10) {

            if (k % 2 == 0) {
                System.out.print(k + ",");
            }
            ++k;
        }


        System.out.println("\n");
        System.out.println("3.2 again, easier way");
        System.out.println();

        for (int i = 0; i <= 10; i = i + 2) {
            System.out.print(i + ",");
        }

        System.out.println("\n");
        System.out.println("4.exercise: count backwards from 10 to -10 (incl)  ");
        System.out.println();

        for (int i = 10; i >= -10; i = i - 1) { //start with ten, as long as i is greater than -10, calculate i-1
            System.out.print(i + ",");
        }

        System.out.println("\n");
        System.out.println("DONE");
        System.out.println("\n");
    }
}
