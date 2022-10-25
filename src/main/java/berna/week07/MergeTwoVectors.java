package berna.week07;


import java.util.Vector;
import berna.week07.VectorBasics;

public class MergeTwoVectors {
    //exercise: 2 vectors, sorted descending are merged in a third vector, also sorted descending


    public static void main(String[] args) {

        Vector<Integer> v1 = VectorBasics.createVectorRandom(20,99);
        Vector<Integer> v2 = VectorBasics.createVectorRandom(20,99);
        Vector<Integer> v1sorted = VectorBasics.bubblesortVector(v1);
        Vector<Integer> v2sorted = VectorBasics.bubblesortVector(v2);

        Vector<Integer> merged = mergeVectors(v1,v2);
        Vector<Integer> mergedSorted = VectorBasics.bubblesortVector(merged);

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
        merged.addAll(v1);
        merged.addAll(v2);
        return merged;
    }


}
