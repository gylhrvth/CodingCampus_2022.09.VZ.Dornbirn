package batuhan.week07;

import java.util.Comparator;
import java.util.Random;
import java.util.Vector;

public class VectorExampleV2 {
    private static Random random = new Random();

    public static void main(String[] args) {

        Vector<Integer> v1 = generatorRandomVector(100);
        v1.sort(Comparator.naturalOrder());
        Vector<Integer> v2 = generatorRandomVector(100);
        v2.sort(Comparator.naturalOrder());
        System.out.println(v2);
        System.out.println(v1);
        Vector<Integer> v3=merge(v1,v2);
        System.out.println(v3);
    }

    public static Vector<Integer> merge(Vector<Integer> a, Vector<Integer> b) {
        Vector<Integer> result = new Vector<>();
        int indexA = 0;
        int indexB = 0;

        while (indexA < a.size() && indexB < b.size()) {
            if (a.get(indexA) < b.get(indexB)) {
                result.add(a.get(indexA));
                ++indexA;
            } else {
                result.add(b.get(indexB));
                ++indexB;
            }

        }
        while (indexA < a.size()) {
            result.add(a.get(indexA));
      ++indexA;
        }
        while (indexB < b.size()) {
            result.add(a.get(indexB));
        ++indexB;
        }
    return result;
    }


    public static  Vector<Integer> generatorRandomVector(int size){
        Vector<Integer> result = new Vector<>();
        for (int i = 0; i <size ; i++) {
            result.add(random.nextInt(100));



        }return result;
    }


}
