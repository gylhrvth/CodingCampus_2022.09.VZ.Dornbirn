package viktor.week07;

import java.util.ArrayList;

public class PersonTwoPointNullSimulation {

    public static void getMinMaxAvgOfHeights(ArrayList<PersonTwoPointNull> l) {
        PersonTwoPointNull min = l.get(0);
        PersonTwoPointNull max = l.get(0);
        double sum = 0;

        for (PersonTwoPointNull e : l) {
            sum += e.getHeight();
            if (min.getHeight() > e.getHeight()) {
                min = e;
            }
            if (max.getHeight() < e.getHeight()) {
                max = e;
            }
        }
        double avg = sum / l.size();
        System.out.println("Min Max Avg of heights:");
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.printf("Avg of heights: %5.3f%n", avg);
    }

    public static void getMinMaxAvgOfAge(ArrayList<PersonTwoPointNull> l) {

        PersonTwoPointNull min = l.get(0);
        PersonTwoPointNull max = l.get(0);
        double sum = 0;

        for (PersonTwoPointNull e : l) {
            sum += e.getAge();
            if (min.getAge() > e.getAge()) {
                min = e;
            }
            if (max.getAge() < e.getAge()) {
                max = e;
            }
        }
        double avg = sum / l.size();

        System.out.println("Min Max Avg of ages:");
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.printf("Avg of ages: %5.3f%n", avg);

    }


    public static void getMinMaxAvgOfWeights(ArrayList<PersonTwoPointNull> l) {

        PersonTwoPointNull min = l.get(0);
        PersonTwoPointNull max = l.get(0);
        double sum = 0;

        for (PersonTwoPointNull e : l) {
            sum += e.getWeight();
            if (min.getWeight() > e.getWeight()) {
                min = e;
            }
            if (max.getWeight() < e.getWeight()) {
                max = e;
            }
        }
        double avg = sum / l.size();

        System.out.println("Min Max Avg of weights:");
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.printf("Avg of weights: %5.3f%n", avg);

    }

    public static void printLine(int size) {
        for (int i = 0; i < size; i++) {
            System.out.print("_");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        ArrayList<PersonTwoPointNull> list = new ArrayList<>();

        PersonTwoPointNull p = new PersonTwoPointNull(160, 40, "Stefan", 90);
        PersonTwoPointNull p2 = new PersonTwoPointNull(210, 44, "Thomas", 100);
        PersonTwoPointNull p3 = new PersonTwoPointNull(190, 50, "Hans", 98);
        PersonTwoPointNull p4 = new PersonTwoPointNull(130, 80, "Marta", 56);

        list.add(p);
        list.add(p2);
        list.add(p3);
        list.add(p4);

        System.out.println(list);
        printLine(65);
        getMinMaxAvgOfHeights(list);
        printLine(65);
        getMinMaxAvgOfAge(list);
        printLine(65);
        getMinMaxAvgOfWeights(list);


    }
}
