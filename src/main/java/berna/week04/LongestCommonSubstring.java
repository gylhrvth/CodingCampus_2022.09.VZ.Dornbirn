package berna.week04;

import berna.week02.SimpleUserInput;

import java.util.Arrays;


public class LongestCommonSubstring {
    // Exercise: user inputs 2 Strings, find the longest common substring
    public static void main(String[] args) {

        //user input
        String string1 = SimpleUserInput.readUserInputString();
        String string2 = SimpleUserInput.readUserInputString();
        System.out.println("word nr.1: " + string1);
        System.out.println("word nr.2: " + string2);
        probierenGehtUeberStudieren1(string1, string2);

    }

    public static void probierenGehtUeberStudieren1(String compare, String comparewith) {

        int iterateTo = compare.length();

        //test which string is the shorter one because the shorter fits in the longer and not vv
        String shortstring = new String();
        String longstring = new String();

        if (compare.length() < comparewith.length()) {
            iterateTo = comparewith.length();
            shortstring = compare;
            longstring = comparewith;
        } else {
            shortstring = comparewith;
            longstring = compare;
        }

        System.out.println("shortstring is: " + shortstring);
        System.out.println("longstring is: " + longstring);


        //iterate through the shorter and look for matching letters in the longer one

        int index = 0;
        for (int i = 0; i < iterateTo; i++) {

            String letter = shortstring.substring(i, i + 1);    //only one letter!
            System.out.println("at index i = " + i + " letter is " + letter);


            for (int j = 0; j < shortstring.length()-1; j++) {

                index = longstring.indexOf(letter);

            }
            if (index != -1) {
                System.out.println(letter + "  is in the word " + longstring + "   at " + index);
            }

        }
    }


//    //TODO do u really need this? works only for  strings of equal length!!!!!!
//    public static void findLongestCommonSubstring(String string1, String string2){
//
//        char[] string1char = string1.toCharArray();
//        char[] string2char = string2.toCharArray();
//        int[] commonletter = new int[string1char.length];
//
//        //TODO who is longer 1 or 2?
//
//        for (int i = 0; i < string2.length(); i++) {
//
//            if (string1char[i] == string2char[i]){
//                commonletter[i] =1;
//            } else{
//                commonletter[i] =0;
//            }
//            System.out.println(Character.toString(commonletter));
//
//        }
//        System.out.println(Arrays.toString(commonletter));
//        String substr = Arrays.toString(commonletter);
//
//        int index = substr.indexOf("1");
//        System.out.println(index);
//
//
//        //return "bla";
//
//    }

}
