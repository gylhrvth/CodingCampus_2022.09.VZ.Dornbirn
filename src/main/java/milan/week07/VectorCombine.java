package milan.week07;

import java.util.Vector;

public class VectorCombine {
    public static void main(String[] args) {

        Vector<Integer> vectorA = VectorCreateV1.vectorWithRandomNum(5000);
        Vector<Integer> vectorB = VectorCreateV1.vectorWithRandomNum(5000);
        VectorCreateV2.sortVectorDescending(vectorA);
        VectorCreateV2.sortVectorDescending(vectorB);
//        System.out.println("Erster Vector: " + vectorA + "\nZweiter Vector: " + vectorB);
        Vector<Integer> newVector = new Vector<>();

        long start = System.currentTimeMillis();
        int indexa = 0;
        int indexb = 0;
        while (indexa < vectorA.size() && indexb < vectorB.size()) {
            if (vectorA.get(indexa) > vectorB.get(indexb)) {
                newVector.add(vectorA.get(indexa));
                ++indexa;
            } else {
                newVector.add(vectorB.get(indexb));
                ++indexb;
            }
        }
        while (indexa < vectorA.size()) {
            newVector.add(vectorA.get(indexa));
            ++indexa;
        }
        while (indexb < vectorB.size()) {
            newVector.add(vectorB.get(indexb));
            ++indexb;
        }
        long end = System.currentTimeMillis();

        Vector<Integer> newVectorB = new Vector<>();
        long start1 = System.currentTimeMillis();
        newVectorB.addAll(vectorA);
        newVectorB.addAll(vectorB);
        VectorCreateV2.sortVectorDescending(newVectorB);
        long end1 = System.currentTimeMillis();
        System.out.println("Sortieren von " + newVectorB.size() + " Zahlen\nSortieren linear: " + (end - start) + "ms\nSortieren mit Bubblesort Algo: " + (end1 - start1) + "ms");



    }
}
