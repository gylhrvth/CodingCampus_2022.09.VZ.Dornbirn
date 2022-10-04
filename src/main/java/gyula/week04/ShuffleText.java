package gyula.week04;

import java.util.Random;
import java.util.Scanner;

public class ShuffleText {
    private static Random rand = new Random();

    public static void main(String[] args) {
        System.out.println("Geben Sie ein Text ein:");
        System.out.print(">> ");
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String shuffledText = shuffle(text);
        System.out.println(text + " >> " + shuffledText);
    }

    public static String shuffle(String input){
        char[] arr = input.toCharArray();
        for (int i = 0; i < 3*input.length(); i++) {
            int posA = rand.nextInt(arr.length);
            int posB = rand.nextInt(arr.length);

            char temp = arr[posA];
            arr[posA] = arr[posB];
            arr[posB] = temp;
        }

        return new String(arr);
    }
}
