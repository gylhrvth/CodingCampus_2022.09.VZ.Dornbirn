package franz.week06.objekt;

public class ArrayStatistics {
    public ArrayStatistics(int max, int min, double avg) {
    }

    private ArrayStatistics getMinMaxAvg(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[1]) {
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }
            sum += arr[i];
        }
        double avg = sum / arr.length;
        return new ArrayStatistics(max,min,avg);
    }
}
