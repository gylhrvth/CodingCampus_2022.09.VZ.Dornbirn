package franz.week04;

import com.sun.jdi.ArrayReference;

import javax.print.DocFlavor;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class StringReverseStuFr {
    private static Random randy = new Random();
    public static void main(String[] args) {
        //turnstring(userinput());
        String result = turnstringrandomGyula(userinput());
        System.out.println(result);

    }

    public static String userinput() {
        System.out.println("string eingabe");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();


        return line;
    }


    public static void turnstring(String line) {
        String reverse = "";
        for (int i = line.length() - 1; i >= 0; i--) {
            reverse = reverse + line.charAt(i);
        }
        System.out.println(reverse);
    }

    public static String turnstringrandomGyula(String line) {
        char[] arr = line.toCharArray();
        for (int i = 0; i < 3*arr.length - 1; i++) {
            int posA = randy.nextInt(arr.length);
            int posB = randy.nextInt(arr.length);

            char temp = arr[posA];
            arr[posA] = arr[posB];
            arr[posB] = temp;
        }
        return new String(arr);

//
//        Random randy = new Random(100);
//        String reverse= "" ;
//        for (int i =0;i< line.length()/2 ;  i++) {
//            reverse =reverse +line.charAt(i);
    }


    public static void turnstringrandom(String line) {
        char[] arr = line.toCharArray();
        StringBuilder s = new StringBuilder();
        for (int i = 0; i <= arr.length - 1; i++) {

            if (i != arr.length - 1) {
                s.append(arr[i + 1]);
            }
            s.append(arr[i]);
            i = i + 1;
        }
        System.out.print(s);

//
//        Random randy = new Random(100);
//        String reverse= "" ;
//        for (int i =0;i< line.length()/2 ;  i++) {
//            reverse =reverse +line.charAt(i);
    }


}