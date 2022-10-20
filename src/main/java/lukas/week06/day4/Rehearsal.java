package lukas.week06.day4;

import java.util.Random;

public class Rehearsal {
    public static void main(String[] args) {
        int[] arr = new int[1000000];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt();
        }

        ArrayStatistics statistics = getMinMaxAvg(arr);

        System.out.println(statistics.getMin());
        System.out.println(statistics.getMax());
        System.out.println(statistics.getAvg());

        System.out.println(statistics.toString());

        Object tmp = statistics;
        System.out.println(tmp.toString());
    }

    private static ArrayStatistics getMinMaxAvg(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        double sum = 0;
        for (int value : arr) {
//            if (min > value) {
//                min = value;
//            }
//            if (max < value) {
//                max = value;
//            }
            min = Math.min(min, value);
            max = Math.max(max, value);
            sum += value;
        }
        double avg = sum / arr.length;
        return new ArrayStatistics(max, min, avg);
    }
}
