package fatima.week07;

import java.util.Collections;
import java.util.Vector;


public class MergeVector {
    public static void main(String[] args) {
        Vector<Integer> vA = CreateVector.createRandomVector(20);
        Vector<Integer> vB = CreateVector.createRandomVector(20);
        System.out.print("vA: ");
        sortVector(vA);
        System.out.print("vB: ");
        sortVector(vB);
        System.out.print("merged: ");
        System.out.println(mergeVector(vA, vB));
    }

    private static void sortVector(Vector<Integer> v) {
        Collections.sort(v);
        System.out.println(v);
    }

    private static Vector<Integer> mergeVector(Vector<Integer> a, Vector<Integer> b) {
        Vector<Integer> merged = new Vector<>();
        int indexA = 0;
        int indexB = 0;
        while (indexA < a.size() && indexB < b.size()) {
            if (a.get(indexA) < b.get(indexB)) {
                merged.add(a.get(indexA));
                ++indexA;
            } else {
                merged.add(b.get(indexB));
                ++indexB;
            }
        }
        while (indexA < a.size()) {
            merged.add(a.get(indexA));
            ++indexA;
        }
        while (indexB < b.size()) {
            merged.add(b.get(indexB));
            ++indexB;
        }
        return merged;
    }
}