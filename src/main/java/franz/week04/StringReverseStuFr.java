package franz.week04;

import com.sun.jdi.ArrayReference;

import javax.print.DocFlavor;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class StringReverseStuFr {
    public static void main(String[] args) {
              turnstring(userinput());
      turnstringrandom();
        System.out.println("____");
    }

    public static String userinput() {
        System.out.println("string eingabe");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();


        return line;
    }


    public static void turnstring(String line) {
        String reverse= "";
        for (int i = line.length()-1; i >=0 ; i--) {
            reverse =reverse +line.charAt(i);
                    }
        System.out.println(reverse);
    }

    public static void turnstringrandom() {
        Random randy = new Random(100);
        String reverse= "" ;
        for (int i = randy.nextInt()-1; i >=0 ; i--) {
            reverse =reverse +randy.nextInt(i);
        }
        System.out.println(reverse);
    }
}
