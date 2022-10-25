package martin.week07;

import java.util.List;
import java.util.ListIterator;
import java.util.Random;
import java.util.Vector;

public class dynamicDatastructureExamples {
    public static final Random rand = new Random();

    public static void main(String[] args) {
        Vector<Integer> vectorRand20 = new Vector<>();
        for (int i = 0; i <= 20; i++) {
            vectorRand20.add(0, rand.nextInt(100));
        }
        System.out.println("Task Vector erstellen");
        System.out.println("Task 0: " + vectorRand20);
        System.out.println("Task 1: Even    Elements: " + getEvenVectorElem(vectorRand20));
        System.out.println("Task 2: Smallest Element: " + getSmallestVectorElem(vectorRand20));
        System.out.println("Task 3: Biggest  Element: " + getBiggestVectorElem(vectorRand20));
        bubbleSortIntVec(vectorRand20);
        System.out.println("Task 4: " + vectorRand20);
        eraseAllUnevenVectorInt(vectorRand20);
        System.out.println("Task 5: Erase all uneven: " + vectorRand20+"\n");
        Vector<Integer> vectorRandA = new Vector<>();
        Vector<Integer> vectorRandB = new Vector<>();
        for (int i = 0; i <= 20; i++) {
            vectorRandA.add(0, rand.nextInt(100));
        }
        for (int i = 0; i <= 25; i++) {
            vectorRandB.add(0, rand.nextInt(100));
        }
        bubbleSortIntVec(vectorRandA);
        bubbleSortIntVec(vectorRandB);
        System.out.println("Task two Vectors:");
        System.out.println("Vector A: " + vectorRandA);
        System.out.println("Vector B: " + vectorRandB);
        System.out.println("Vector C: " + combineVectors(vectorRandA, vectorRandB));
    }

    public static int getEvenVectorElem(Vector<Integer> vector) {
        int evenNums = 0;
        for (Integer elements : vector) {
            if (elements % 2 == 0) {
                evenNums++;
            }
        }
        return evenNums;
    }

    public static int getSmallestVectorElem(Vector<Integer> vector) {
        int smallNum = vector.get(0);
        for (Integer elements : vector) {
            if (elements < smallNum) {
                smallNum = elements;
            }
        }
        return smallNum;
    }

    public static int getBiggestVectorElem(Vector<Integer> vector) {
        int bigNum = vector.get(0);
        for (Integer elements : vector) {
            if (elements > bigNum) {
                bigNum = elements;
            }
        }
        return bigNum;
    }

    public static void bubbleSortIntVec(Vector<Integer> vector) {
        for (int i = 0; i < vector.size(); i++) {
            for (int j = 0; j < vector.size() - i - 1; j++) {
                if (vector.get(j) < vector.get(j + 1)) {
                    vector.add(j, vector.get(j + 1));
                    vector.remove(j + 2);
                }
            }
        }
    }

    public static void eraseAllUnevenVectorInt(Vector<Integer> vector) {
        for (int i = 0; i < vector.size(); i++) {
            if (vector.get(i) % 2 != 0) {
                vector.remove(i);
                i--;
            }
        }
    }

    public static Vector<Integer> combineVectors(Vector<Integer> vectorA, Vector<Integer> vectorB) {
        Vector<Integer> vectorC = new Vector<>();
        int a = 0;
        int b = 0;
        while (vectorA.size() > a && vectorB.size() > b) {
            if (vectorA.get(a) > vectorB.get(b)) {
                vectorC.add(vectorA.get(a));
                a++;
            } else {
                vectorC.add(vectorB.get(b));
                b++;
            }
        }
        if (vectorA.size() > a) {
            while (a < vectorA.size()) {
                vectorC.add(vectorA.get(a));
                a++;
            }
        } else {
            while (b < vectorB.size()) {
                vectorC.add(vectorB.get(b));
                b++;
            }
        }
        return vectorC;
    }
}