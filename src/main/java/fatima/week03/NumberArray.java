package fatima.week03;

import fatima.week02.UserInput;

import java.util.Arrays;

public class NumberArray {

    public static void main(String[] args) {

        int n = UserInput.readUserInputIntegerV5("Array length forwards?", 0, Integer.MAX_VALUE);
        //Scanner input = new Scanner(System.in);
        //n = input.nextInt();

        int[] arrforwards = new int[n];
        for (int i = 0; i < arrforwards.length; i++) {
            arrforwards[i] = i + 1;
        }
        System.out.println("arr: " + Arrays.toString(arrforwards));

        int[] arrbackwards = new int[n];
        for (int i = 0; i < arrbackwards.length; i++) {
            arrbackwards[i] = n - i;
        }
        System.out.println("arr: " + Arrays.toString(arrbackwards));
    }
}





