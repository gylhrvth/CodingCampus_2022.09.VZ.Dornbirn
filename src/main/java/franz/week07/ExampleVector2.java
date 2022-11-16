package franz.week07;

import java.util.Random;
import java.util.Vector;

public class ExampleVector2 {
    public static void main(String[] args) {
        Random random = new Random();
        Vector<Integer> numVector = new Vector<>();

        for (int i = 0; i < 20; i++) {
            numVector.add(random.nextInt(1, 99));
        }


        System.out.println(numVector);
        int counting = countStraightNumber(numVector);
        System.out.println("Anzahl geraden Zahlen: " + counting);
        System.out.println("Min Num:" + findTheMinNum(numVector));
        System.out.println("Max Num:" + findTheMaxNum(numVector));
        System.out.println("sort: " + sort(numVector));
        deletUnstrightNumber(numVector);
    }


    public static Integer countStraightNumber(Vector<Integer> vec) {
        int count = 0;
        for (Integer integer : vec) {
            if (integer % 2 == 0) {
                count++;
            }
        }
        return (count);
    }


    public static Integer findTheMinNum(Vector<Integer> vec) {
        int min = vec.get(0);
        if (min == 0) {
            return 0;
        } else {
            for (Integer integer : vec) {
                if (min > integer) {
                    min = integer;
                }
            }
            return min;
        }
    }

    public static Integer findTheMaxNum(Vector<Integer> vec) {
        int max = vec.get(0);
        if (max == 0) {
            return 0;
        } else {
            for (Integer integer : vec) {
                if (max < integer) {
                    max = integer;
                }
            }
            return max;
        }
    }

    public static Vector<Integer> sort(Vector<Integer> vec) {
        for (int i = 0; i < vec.size(); i++) {
            for (int j = 0; j < vec.size() - 1; j++) {
                int firstNumber = vec.get(j);
                int secondNumber = vec.get(j + 1);
                if (firstNumber < secondNumber) {
                    vec.set(j, secondNumber);
                    vec.set(j + 1, firstNumber);

                }
            }

        }
        return vec;
    }

    public static void deletUnstrightNumber(Vector<Integer> vec) {
        int i = 0;
        while (i < vec.size()) {

            if (vec.get(i) % 2 != 0) {
                vec.remove(i);
            } else {
                i++;
            }
        }
        System.out.println("only stright numbers" + vec);
    }

}





