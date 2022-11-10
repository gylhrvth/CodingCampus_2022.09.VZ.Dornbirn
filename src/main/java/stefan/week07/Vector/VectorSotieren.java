package stefan.week07.Vector;

import java.util.Vector;

public class VectorSotieren {

    public static void main(String[] args) {
        Vector<Integer> number = VectorErstellen.rondomVector(20);

        System.out.println("20 Zufallszahlen");
        System.out.println(number+"\n");
        System.out.println("Summe aller Zahlen");
        System.out.println(countNumbers(number)+"\n");
        System.out.println("Die größte Zahl");
        System.out.println(maxNumber(number)+"\n");
        System.out.println("Die Kleinste Zahl");
        System.out.println(minNumber(number)+"\n");
        Vector<Integer> sortnumber = upNumbers(number);
        System.out.println("Sortieren Absteigend");
        System.out.println(sortnumber+"\n");
        System.out.println("Nur geraden Zahlen");
        geradeNumber(number);
    }

    public static int countNumbers(Vector<Integer> name) {
        int sum = 0;
        for (int i = 0; i < name.size(); i++) {
            sum = sum + name.size();
        }
        return sum;
    }

    public static int minNumber(Vector<Integer> number) {
        int min = Integer.MAX_VALUE;
        for (int x : number) {
            if (x < min) {
                min = x;
            }
        }
        return min;
    }

    public static int maxNumber(Vector<Integer> number) {
        int max = Integer.MIN_VALUE;
        for (int x : number) {
            if (x > max) {
                max = x;
            }

        }
        return max;
    }


    public static void geradeNumber(Vector<Integer> number) {
        Vector<Integer> sort = new Vector<>();
        for (Integer x : number) {
            if (x % 2 != 0) {
                sort.add(x);

            }


        }
        for (Integer x : sort) {
            number.removeElement(x);

        }
        System.out.println(number);
    }

    public static Vector<Integer> upNumbers(Vector<Integer>number) {
        int temp =0;
        for (int i = 0; i <number.size() ; i++) {
            for (int j = 0; j <number.size()-1 ; j++) {
                if (number.get(j) < number.get(j+1)) {
                    temp =number.get(j+1);
                    number.set(j+1,number.get(j));
                    number.set(j,temp);

                }
            }
        }
   return number;
    }
}