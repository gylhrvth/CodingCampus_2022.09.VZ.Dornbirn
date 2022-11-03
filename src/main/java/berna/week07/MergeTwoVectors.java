package berna.week07;


import java.util.Vector;

public class MergeTwoVectors {
    //exercise: 2 vectors, sorted descending are merged in a third vector, also sorted descending


    public static void main(String[] args) {

        Vector<Integer> v1 = VectorBasicsDefensive.createVectorRandom(20,99);
        Vector<Integer> v2 = VectorBasicsDefensive.createVectorRandom(20,99);
        Vector<Integer> v1sorted = VectorBasicsDefensive.bubblesortVectorDefensive(v1);
        Vector<Integer> v2sorted = VectorBasicsDefensive.bubblesortVectorDefensive(v2);

        Vector<Integer> mergedSorted = mergeVectors(v1sorted,v2sorted);
        // Invalid Operation!!!
        // Vector<Integer> mergedSorted = VectorBasicsDefensive.bubblesortVectorDefensive(merged);

        System.out.println();
        System.out.println("Vector 1 sorted: ");
        System.out.println(v1sorted);
        System.out.println();
        System.out.println("Vector 2 sorted: ");
        System.out.println(v2sorted);
        System.out.println();
        System.out.println("Merged Vector 1 and 2, sorted: ");
        System.out.println(mergedSorted);


    }

    public static Vector<Integer> mergeVectors(Vector<Integer> v1, Vector<Integer> v2) {
        Vector<Integer> merged = new Vector<>();
        int index1 = 0;
        int index2 = 0;

        while (index1 < v1.size() && index2 < v2.size()) {
            if (v1.get(index1) > v2.get(index2)) {
                merged.add(v1.get(index1));
                ++index1;
            } else {
                merged.add(v2.get(index2));
                ++index2;
            }
        }
        while (index1 < v1.size()) {
            merged.add(v1.get(index1));
            ++index1;
        }
        while (index2 < v2.size()) {
            merged.add(v2.get(index2));
            ++index2;
        }

        return merged;
    }


}
