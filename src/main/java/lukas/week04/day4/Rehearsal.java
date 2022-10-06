package lukas.week04.day4;

public class Rehearsal {
    public static void main(String[] args) {
        String test = "Hallo";

        char[] arr = test.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //Leider falsch :-(
//        for (char i : arr) {
//            System.out.println("Character: " + i + " Zahlenwert vom Character: " + (int) i);
//            System.out.println(arr[i]);
//        }

        for (char i : arr) {
            System.out.println(i);
        }

        System.out.println("Zahlenwert von A: " + (int) 'A');

        String test2 = test + test;
        System.out.println(test2);

        //String concatenation
        long start = System.currentTimeMillis();
        String tmp = "";
        for (int i = 0; i < 10000; i++) {
            tmp += "Hallo";
        }
        long end = System.currentTimeMillis();
        System.out.println("Building of String took: " + (end - start) + "ms");

        //String concatenation with StringBuilder
        start = System.currentTimeMillis();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 10000000; i++) {
            builder.append("Hallo");
        }
        String result = builder.toString();
        end = System.currentTimeMillis();

        System.out.println("Building of String with StringBuilder took: " + (end - start) + "ms");

        int a = 10;
        int b = 20;

        float c = 10;
        float d = 20;

        System.out.println(add(a, b));
        System.out.println(add(c, d));
        System.out.println(add(a, c));

        //Substring
        String test3 = "Hallo Martin wie gehts?";

        System.out.println("|" + test3.substring(6, 12) + "|");
        System.out.println("|" + test3.substring(6) + "|");

        //Index of
        System.out.println("An welchem Index startet Martin: " + test3.indexOf("Martin"));
        System.out.println("An welchem Index ist das erste a: " + test3.indexOf('a'));
        System.out.println("An welchem Index ist das erste a: " + test3.indexOf("a"));
        System.out.println("An welchem Index ist das erste x: " + test3.indexOf("x"));

        //Nur mit -->Index of<--- all e's
        String test4 = "Hallo wie gehts heute ist ein schöner Tag. Get to the Chopper?!!!!111e";

        int index = test4.indexOf("e");
        while (index != -1) {
            System.out.print(index + " ");
            index = test4.indexOf('e', index + 1);
        }
        System.out.println();

        //Index of all e's with toCharArray()
        char[] arr2 = test4.toCharArray();
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] == 'e') {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        //Index of all e's with indexOf(...) and subString
        String test5 = test4;
        int index2 = test5.indexOf("e");
        int offset = 0;
        while (index2 != -1) {
            System.out.print(offset + index2 + " ");
            offset += index2 + 1;
            test5 = test5.substring(index2 + 1);
            index2 = test5.indexOf("e");
        }
        System.out.println();

    }

    private static int add(int a, int b) {
        System.out.println("Add with int");
        return a + b;
    }

    private static float add(float a, float b) {
        System.out.println("Add with float");
        return a + b;
    }
}
