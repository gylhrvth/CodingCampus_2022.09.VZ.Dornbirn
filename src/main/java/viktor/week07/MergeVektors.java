package viktor.week07;

import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.util.Vector;

public class MergeVektors {


    private static void sortAscAndPrint(Vector<Integer> v) {
        Collections.sort(v);
        System.out.println("Asc: " + v);
    }


    public static void main(String[] args) {
        Random random = new Random();

        Vector<Integer> v1 = new Vector<>();
        Vector<Integer> v2 = new Vector<>();
        Vector<Integer> v3 = new Vector<>();

        for (int i = 0; i < 20; i++) {
            int element1 = random.nextInt(1, 101);
            v1.add(element1);
        }
        for (int i = 0; i < 20; i++) {
            int element2 = random.nextInt(1, 101);
            v2.add(element2);
        }


        sortAscAndPrint(v1);
        System.out.println("\n");
        sortAscAndPrint(v2);
        System.out.println("\n");


            int indexJ = 0;
            int indexK = 0;

            while (indexJ < v1.size() && indexK < v2.size()) {

                if (v1.get(indexJ) > v2.get(indexK)) {
                    v3.add(v2.get(indexK));
                    indexK++;
                }
                else {
                    v3.add(v1.get(indexJ));
                    indexJ++;
                }
            }

            while(indexJ < v1.size()){
                v3.add(v1.get(indexJ));
                indexJ++;
            }

            while(indexK < v2.size()){
                v3.add(v2.get(indexK));
                indexK++;
            }

        System.out.println(v3);
    }
}
