package patric.week07.Datenklasse;

import java.util.Arrays;


    public class DatenklasseUebung {
        public int[] arr;
        public int max;
        public int min;
        public double avg;


        public DatenklasseUebung(int[] arr) {
            this.arr = arr;
            max = getMax(arr);
            min = getMin(arr);
            avg = getAvg(arr);

        }
        public String toString(){
            return Arrays.toString(arr) +"\n" +  "max array: " + max + "\n"  + "min array: " + min + "\n" + "avg array: "+ avg;
        }
        public static int getMax(int[] arr) {
            int max = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max)
                    max = arr[i];
            }
            return max;
        }

        public static int getMin(int[] arr) {
            int min = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < min)
                    min = arr[i];
            }
            return min;
        }

        public static double getAvg(int[] arr) {
            double avg = arr[0];
            double sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum = sum + arr[i];
                avg = sum / arr.length;
            }

            return avg;
        }

    }
