package milan.week07;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Vector;

public class VectorCreateV2 {

    public static void main(String[] args) {

        Vector<Integer> zahlen = VectorCreateV1.vectorWithRandomNum(20);
        System.out.println("------------------");
        System.out.println("Vector mit Random Zahlen: ");
        System.out.println(zahlen);
        int sumEvenNum = countEvenNum(zahlen);
        int smallestNum = findSmallestNum(zahlen);
        int biggestNum = findBiggestNum(zahlen);
        System.out.println("Die Anzahl aller geraden Zahlen ist: " + sumEvenNum +
                "\nDie kleinste Zahl ist: " + smallestNum +
                "\nDie größte Zahl ist: " + biggestNum);
        System.out.print("Vector absteigend sortiert: ");
        sortVectorDescending(zahlen);
        System.out.println(zahlen);
        // sortier Alternative mit .sort -> Comparator<Integer>()
        zahlen.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        System.out.print("Vector aufsteigend sortiert mit .sort: ");
        System.out.println(zahlen);
        System.out.println("Vector ohne ungeraden Zahlen: ");
        deleteAllOdds(zahlen);
        System.out.println("*********************");
        System.out.println("Neues Array mit Random Zahlen: ");
        Integer[] test = VectorCreateV1.vectorWithRandomNum(40).toArray(new Integer[0]);
        System.out.println(Arrays.toString(test));
        System.out.println("Sortier beispiel mit .sort (ungerade Zahlen aufsteigend, danach gerade Zahlen aufsteigend): ");
        Arrays.sort(test, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 % 2 == 1) o1 = o1 - 99999;
                if (o2 % 2 == 1) o2 = o2 - 99999;
                return o1 - o2;
            }
        });
        System.out.println(Arrays.toString(test));
    }

    public static void deleteAllOdds(Vector<Integer> zahlen) {
        Vector<Integer> valuesToDelete = new Vector<>();
        for (Integer x : zahlen) {
            if (x % 2 != 0) {
                valuesToDelete.add(x);
            }
        }
        for (Integer x : valuesToDelete) {
            zahlen.removeElement(x);
        }
        System.out.println(zahlen);
    }

    public static void sortVectorDescending(Vector<Integer> zahlen) {
        int temp = 0;
        for (int i = 0; i < zahlen.size(); i++) {
            for (int j = 0; j < zahlen.size() - 1; j++) {
                if (zahlen.get(j) < zahlen.get(j + 1)) {
                    temp = zahlen.get(j);
                    zahlen.set(j, zahlen.get(j + 1));
                    zahlen.set(j + 1, temp);
                }
            }
        }
    }

    public static int findBiggestNum(Vector<Integer> zahlen) {
        int max = Integer.MIN_VALUE;
        for (int x : zahlen) {
            if (x > max) {
                max = x;
            }
        }
        return max;
    }

    public static int findSmallestNum(Vector<Integer> zahlen) {
        int min = Integer.MAX_VALUE;
        for (int x : zahlen) {
            if (x < min) {
                min = x;
            }
        }
        return min;
    }

    public static int countEvenNum(Vector<Integer> zahlen) {
        int sum = 0;
        for (int x : zahlen) {
            if (x % 2 == 0) {
                ++sum;
            }
        }
        return sum;
    }
}
