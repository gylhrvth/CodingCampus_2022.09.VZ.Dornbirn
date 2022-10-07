package patric.week04;

import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {
        methode();
    }
    public static void methode() {
        System.out.println("Enter string to reverse:");

        Scanner read = new Scanner(System.in);
        String str = read.nextLine();
        String reverse = "";


        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        System.out.println("Reversed string is:");
        System.out.println(reverse);
    }


}




//    public static void Split() {
//
//        String source = "!!!!Alles***verdreht!!!!";
//
//        for (String part : source.split(" ")) {
//            System.out.print(new StringBuilder(part).reverse());
//            System.out.print(" ");
//        }
//    }


