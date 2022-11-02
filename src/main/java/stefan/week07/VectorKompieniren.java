package stefan.week07;

import java.util.Vector;

public class VectorKompieniren {

    public static void main(String[] args) {
        Vector<Integer> v1 = VectorErstellen.rondomVector(20);
        Vector<Integer> v2 = VectorErstellen.rondomVector(20);
        Vector<Integer> v3 =sort(v1,v2);
        System.out.println(v3);
    }

    public static Vector<Integer> sort(Vector<Integer> a, Vector<Integer> b) {
        Vector<Integer> result = new Vector<>();
        int indexA = 0;
        int indexB = 0;
        while (indexA < a.size() && indexB < b.size()) {
            if (a.get(indexA) > b.get(indexB)) {
                result.add(a.get(indexA));
                indexA++;
            } else {
                result.add(b.get(indexB));
                indexB++;
            }
        }
        while (indexA < a.size()) {
            result.add(a.get(indexA));
            indexA++;
        }
        while (indexB < b.size()) {
            result.add(b.get(indexB));
            indexB++;
        }
        return result;
    }
}