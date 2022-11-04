package michel.week07;

import java.util.Random;
import java.util.Vector;

public class VectorExamples {
    public static Random rand = new Random();
    public static void main(String[] args) {

        Vector<Integer> one = generateRandomVector(20);
        Vector<Integer> two = generateRandomVector(20);

        System.out.println("================================================================================================================");
        System.out.println("Originaler Vector One: \n" + one);
        System.out.println("Gerade Zahlen im Vector One: " + evenNumbers(one));
        System.out.println("Die kleinste Zahl im Vector One: " + getMin(one));
        System.out.println("Die größte Zahl im Vector One: " + getMax(one));
        System.out.println("================================================================================================================");
        sortAscending(one);
        System.out.println("Vector One sortiert absteigend: \n" + one);
        sortAscending(two);
        System.out.println("\nVector Two sortiert absteigend: \n" + two);
        System.out.println("================================================================================================================");
        Vector<Integer> result = mergeVectors(one, two);
        System.out.println("Vector One+Two merged: \n" + result);
        System.out.println("Gerade Zahlen im Vector One+Two merged: " + evenNumbers(result));
        System.out.println("Die kleinste Zahl im Vector One+Two merged: " + getMin(result));
        System.out.println("Die größte Zahl im Vector One+Two merged: " + getMax(result));
        System.out.println("================================================================================================================");
        removeOddNumbers(result);
        System.out.println("Vector One+Two merged ohne ungeraden Zahlen: \n" + result);


    }

    private static Vector<Integer> generateRandomVector(int size) {
        Vector<Integer>result=new Vector<>();
        for (int i = 0; i < 20; i++) {
            result.add(rand.nextInt(0, 100));
        }
        return result;
    }

    private static Vector<Integer> mergeVectors(Vector<Integer> one, Vector<Integer> two) {
        Vector<Integer> result = new Vector<>();
        int indexOne = 0;
        int indexTwo = 0;
        while (indexOne < one.size() && indexTwo < two.size()) {
            if (one.get(indexOne) > two.get(indexTwo)) {
                result.add(one.get(indexOne));
                indexOne++;
            } else {
                result.add(two.get(indexTwo));
                indexTwo++;
            }
        }
        while (indexOne < one.size()) {
            result.add(one.get(indexOne));
            indexOne++;
        }
        while (indexTwo < two.size()) {
            result.add(two.get(indexTwo));
            indexTwo++;
        }
        return result;
    }

    private static void removeOddNumbers(Vector<Integer> one) {
        if (one.size() != 0) {
            for (int i = 0; i < one.size(); i++) {
                if (one.get(i) % 2 != 0) {
                    one.remove(one.get(i));
                    --i;
                }
            }
        }
    }

    private static void sortAscending(Vector<Integer> input) {
        if (input.size() != 0) {
            for (int i = 0; i < input.size(); i++) {
                for (int j = 0; j < input.size() - i - 1; j++) {
                    if (input.get(j) < input.get(j + 1)) {
                        int temp = input.get(j);
                        input.set(j, input.get(j + 1));
                        input.set(j + 1, temp);
                    }
                }
            }
        } else {
            System.out.println("\nSortieren ist nicht möglich. Es sind keine Werte im Vector vorhanden!");
        }
    }

    private static Integer getMax(Vector<Integer> one) {
        int max = 0;
        if (one.size() != 0) {
            max = one.get(0);
            for (int i = 0; i < one.size(); i++) {
                if (one.get(i) > max) {
                    max = one.get(i);
                }
            }
            return max;
        } else {
            System.out.println("\nDas maximum kann nicht ermittelt werden. Es sind keine Werte im Vector enthalten!");
        }
        return null;
    }


    public static Integer evenNumbers(Vector<Integer> one) {
        int count = 0;
        if (one.size() != 0) {
            for (int i = 0; i < one.size(); i++) {
                if (one.get(i) % 2 == 0) {
                    count++;
                }
            }
            return count;
        } else {
            System.out.println("\nGerade Zahlen können nicht ermittelt werden. Es sind keine Werte im Vector!");
        }
        return null;
    }

    public static Integer getMin(Vector<Integer> one) {
        int min = 0;
        if (one.size() != 0) {
            min = one.get(0);
            for (int i = 0; i < one.size(); i++) {
                if (min > one.get(i)) {
                    min = one.get(i);
                }
            }
            return min;
        } else {
            System.out.println("\nDas minimum kann nicht ermittelt werden. Es sind keine Werte im Vector!");
        }
        return null;
    }


}
