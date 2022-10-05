package stefan.week04;

import com.sun.jdi.CharType;
import lukas.data.Texts;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Strings {
    public static Random randy = new Random();




    public static void main(String[] args) {

        String[] namen = {"Viktor", "Batuhan", "Milan", "Stefan", "Berna","Martin", "Franky", "Fatima", "Mike", "Mase", "Patric", "Alp", "Gyula", "Lukas", "Svitlana"};

        System.out.println("Aufsteigend");
        System.out.println(Arrays.toString(bubbleSort(namen))); //
        System.out.println("\n Absteigend");
        System.out.println(Arrays.toString(bubbleSortAufS(namen)));
        System.out.println("\n Nach Länge sotiert");
        System.out.println(Arrays.toString(bubbleSortLong(namen)));
        System.out.println("\n true oder false");
        bubbleSortboolen(namen, true);
        System.out.println("\n Index");
        exended(namen,3);
        System.out.println((Arrays.toString(namen)));
        System.out.println();
        System.out.println("Geben sie ein Text ein");
        reverse();
        System.out.println();
        System.out.println("Rückwerts String");
        String result= randomize(userInput());
        System.out.println(result);

    }

    public static String[] bubbleSort(String[] namen) {
        String sortieren;
        for (int i = 0; i < namen.length; i++) {
            for (int j = i + 1; j < namen.length; j++) {
                if (namen[j].compareTo(namen[i]) < 0) {
                    sortieren = namen[i];
                    namen[i] = namen[j];
                    namen[j] = sortieren;

                }

            }

        }

        return namen;
    }


    public static String[] bubbleSortAufS(String[] namen) {
        String sortieren;
        for (int i = 0; i < namen.length; i++) {
            for (int j = i + 1; j < namen.length; j++) {
                if (namen[j].compareTo(namen[i]) > 0) {
                    sortieren = namen[i];
                    namen[i] = namen[j];
                    namen[j] = sortieren;

                }

            }

        }
        return namen;

    }


    public static String[] bubbleSortLong(String[] namen) {

        for (int i = 0; i < namen.length; i++) {
            for (int j = 0; j < namen.length - 1; j++) {
                if (namen[j].length() > namen[j + 1].length()) {
                    String sotieren = namen[j];
                    namen[j] = namen[j + 1];
                    namen[j + 1] = sotieren;
                }

            }

        }
        return namen;
    }

    public static void bubbleSortboolen(String[] namen, boolean trueOrFalse) {
        if (trueOrFalse) {

            System.out.println(Arrays.toString(bubbleSortAufS(namen)));

        } else {
            System.out.println(Arrays.toString(bubbleSort(namen)));
        }


    }

    public static void exended(String[] namen,int index) {
        for (int i = 0; i < namen.length; i++) {
            for (int j = 0; j < namen.length-i-1; j++) {
                if (namen[j].length() >index &&
                        namen[j+1].length() >index &&
                        namen[j].charAt(index)> namen[j+1].charAt(index)) {

                    String sotieren=namen[j];
                namen[j]= namen[j+1];
                namen[j+1]=sotieren;

                }
            }

        }

    }

    public static  String reverse() {


        Scanner scanner =new Scanner(System.in);
        String zeichen = scanner.next();
        for (int i = 0; i < zeichen.length(); i++) {

        }




        return zeichen;
    }

    public static String userInput() {
        Scanner scanner =new Scanner(System.in);
        String imput = scanner.next();
        return imput;

   }


    public static void turnString(String imput) {
        String reverse="";
        for (int  i = imput.length()-1;i>=0 ; i--) {
            reverse =reverse+ imput.charAt(i);
        }
        System.out.println(reverse);
    }

    public static String randomize(String imput) {
        char[] array = imput.toCharArray();
        for (int i = 0; i <3*array.length-1; i++) {
            int posA = randy.nextInt(array.length);
            int posB = randy.nextInt(array.length);
            char temp = array[posA];
            array[posA]= array[posB];
            array[posB]= temp;
        }
        return new String(array);
    }


}

