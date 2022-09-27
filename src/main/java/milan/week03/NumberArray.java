package milan.week03;

import java.util.Scanner;

public class NumberArray {
    public static void main(String[] args) {

        int size = readInput("Bitte eine Zahl angeben!");

        int[] template = new int[size];
        for (int i = 0; i < template.length; i++) {
            template[i] = i + 1;
            System.out.print(template[i] + " ");
        }
        System.out.println();
        System.out.println("----------------------");

        int[] template2 = new int[size];
        for (int j = 0; j < template2.length; j++) {
            template2[j] = template2.length - j;
            System.out.print(template2[j] + " ");
        }
        System.out.println();
        System.out.println("----------------------");
    }

    public static int readInput(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.println(prompt);
        while (true) {
            if (sc.hasNextInt()) {
                int num1 = sc.nextInt();
                if (num1 < 1) {
                    System.out.println(prompt);
                } else {
                    return num1;
                }
            } else {
                System.out.println(prompt);
                sc.nextLine();
            }
        }
    }
}
