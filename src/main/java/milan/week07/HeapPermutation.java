package milan.week07;

import java.util.Vector;

public class HeapPermutation {
    public static void main(String[] args) {

        Vector<String> abcd = new Vector<>();
        abcd.add("A");
        abcd.add("B");
        abcd.add("C");
        abcd.add("D");
        heapPermutationWithListInput(abcd, abcd.size(), abcd.size());
        printVector(abcd, abcd.size());
    }

    public static void printVector(Vector<String> list, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }

    public static void heapPermutationWithListInput(Vector<String> list, int size, int n) {

        if (size == 1) {
            for (int i = 0; i < size; i++) {
                printVector(list, n);
            }
        }
        for (int i = 0; i < size; i++) {
            heapPermutationWithListInput(list, size - 1, n);
            if (size % 2 == 1) {
                String temp = list.get(0);
                list.set(0, list.get(size - 1));
                list.set(size - 1, temp);
            } else {
                String temp = list.get(i);
                list.set(i, list.get(size - 1));
                list.set(size - 1, temp);
            }

        }


    }
}
