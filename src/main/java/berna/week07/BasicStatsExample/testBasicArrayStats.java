package berna.week07.BasicStatsExample;

public class testBasicArrayStats {

    public static void main(String[] args) {


        //create an array:
       int[] basic = new int[]{1,2,5,7,9,12,33,56,88,234,12};

        //give this array to the class
        BasicArrayStats stats = new BasicArrayStats(basic);

        System.out.println(stats);


    }

    public static int[] getBasicArray(int lengthOfArray) {

        int[] x = new int[lengthOfArray];
        for (int i = 0; i < lengthOfArray; i++) {
            x[i] = i;
        }
        return x;
    }

}
