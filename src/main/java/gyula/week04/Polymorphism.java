package gyula.week04;

public class Polymorphism {
    public static void main(String[] args) {
        int[] arr1 = {15, 16};
        float[] arr2 = {15.6f, 33.45f};
        String[] arr3 = {"Hello", "World!"};

        System.out.println(getMaxColumnWidth(arr1));
        System.out.println(getMaxColumnWidth(arr2));
        System.out.println(getMaxColumnWidth(arr3));
    }


    public static int getMaxColumnWidth(String[] arr){
        System.out.println("String[]");
        return 0;
    }

    public static int getMaxColumnWidth(float[] arr){
        System.out.println("float[]");
        return 0;
    }

    public static int getMaxColumnWidth(int[] arr){
        System.out.println("int[]");
        return 0;
    }

}
