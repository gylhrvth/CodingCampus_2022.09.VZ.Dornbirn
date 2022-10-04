package franz.week04;

import javax.print.DocFlavor;
import java.util.Arrays;
import java.util.Scanner;

public class StringReverseStuFr {
    public static void main(String[] args) {
      userinput();
      turnstring(userinput());
    }

    public static String userinput() {
        System.out.println("string eingabe");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();


        return line;
    }


    public static void turnstring(String line) {
        char[] ch = line.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            for (int j = 0; j < ch.length -1 ; j++) {



            }

            System.out.print(ch[i]+" ");
        }



    }

}
