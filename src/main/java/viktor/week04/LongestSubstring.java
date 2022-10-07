package viktor.week04;

import java.util.Scanner;

public class LongestSubstring {

    public static String readString(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Gib mir bitte ein Wort an!");
        String text = sc.nextLine();
        return text;
    }



    public static void main(String[] args) {

        String text_1 = readString();
        String text_2 = readString();



        for(int i = 0; i < text_1.length(); i++ ){

            String s1 = text_1.substring(i);


              for(int j = 0; j < text_2.length(); j++){

                  String s2 = text_2.substring(j);

                  if(s1.equals(s2)){








                  }



              }





        }










    }
}
