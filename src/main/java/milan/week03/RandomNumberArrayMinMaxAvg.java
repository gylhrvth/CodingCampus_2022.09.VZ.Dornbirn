package milan.week03;

public class RandomNumberArrayMinMaxAvg {

    public static void main(String[] args) {

        System.out.println("--------------------------");
        int[] arr = RandomNumberArray.createArrayWithRandomNum(8);
        System.out.println("--------------------------");
        int min = findMinValue(arr);
        int max = findMaxValue(arr);
        int sum = RandomNumberArraySumme.searchAndCountSum(arr);
        int avg = findAvg(arr, sum);
        int minIndex = indexMin(arr);
        int maxIndex = indexMax(arr);
        System.out.println("Der gerundete Durchschnitt beträgt: " + avg);
        System.out.println("--------------------------");
        System.out.println("Der kleinste Wert beträgt: " + min);
        System.out.println("Er befindet sich auf Index Position: " + minIndex);
        System.out.println("--------------------------");
        System.out.println("Der größte Wert beträgt: " + max);
        System.out.println("Er befindet sich auf Index Position: " + maxIndex);
        System.out.println("--------------------------");
    }

    public static int indexMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int maxIndex = -1;
        for (int pos = 0; pos < arr.length; pos++) {
            if (arr[pos] > max) {
                max = arr[pos];
                maxIndex = pos;
            }
        }
        return maxIndex;
    }

    public static int indexMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        int minIndex = -1;
        for (int pos = 0; pos < arr.length; pos++) {
            if (arr[pos] < min) {
                min = arr[pos];
                minIndex = pos;
            }
        }
        return minIndex;
    }

    public static int findAvg(int[] arr, int sum) {
        int avg = sum / arr.length;
        return avg;
    }

    public static int findMinValue(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int value : arr) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    public static int findMaxValue(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int value : arr) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }


}
