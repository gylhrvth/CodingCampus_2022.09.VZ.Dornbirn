package viktor.week02;

import java.util.Scanner;

public class Rhombus {

    public static void printRhombus(String f, int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {   // Positions in the rows
                if ((i + j) * 2 == rows - 1) {  // Load with chars on the top left side
                    System.out.print(f);
                } else if ((j - i) * 2 == rows - 1) {  // Load with chars on the top right side
                    System.out.print(f);
                } else if ((i - j) * 2 == rows - 1) {  // Load with chars on the bottom left side
                    System.out.print(f);
                } else if ((i + j) * 2 == (rows - 1) * 3) {  // Load with chars on the bottom right side
                    System.out.print(f);
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }

    public static int readNumberInt(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben Sie bitte eine Ganzzahl an!");
        int number = sc.nextInt();
        return number;
    }

    public static String readString(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben Sie bitte einen Text ein!");
        String text = sc.nextLine();
        return text;
    }


    public static void main(String[] args) {

        int size = readNumberInt();
        String text= readString();
        printRhombus(text,size);

    }
}
