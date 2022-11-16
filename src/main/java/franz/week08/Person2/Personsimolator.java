package franz.week08.Person2;

import java.util.ArrayList;

public class Personsimolator {
    public static void main(String[] args) {
        ArrayList<Person2> list = new ArrayList<>();

        Person2 p1 = new Person2(200, 20, "Person_10", 100);
        Person2 p2 = new Person2(190, 19, "Person_09", 90);
        Person2 p3 = new Person2(180, 18, "Person_08", 80);
        Person2 p4 = new Person2(170, 17, "Person_07", 70);
        Person2 p5 = new Person2(160, 16, "Person_06", 60);


        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);


//        System.out.println(list);
//        System.out.println("_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X");
//        sortHeight(list);
//        System.out.println("_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X");
//        sortWeight(list);
//        System.out.println("_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X");
//        sortAge(list);
//        System.out.println("_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X");


    }

    public static void sortHeight(ArrayList<Person2> l) {
        Person2 min = l.get(0);
        Person2 max = l.get(0);
        double sum = 0;

        for (Person2 e : l) {
            sum += e.getHeight();
            if (min.getHeight() > e.getHeight()) {
                min = e;
            }
            if (max.getHeight() < e.getHeight()) {
                max = e;
            }
            double avg = sum / l.size();
            System.out.println("Min: " + min);
            System.out.println("Max: " + max);
            System.out.printf("AVG: %5.1f" + avg);
        }
    }

    public static void sortWeight(ArrayList<Person2> l) {
        Person2 min = l.get(0);
        Person2 max = l.get(0);
        double sum = 0;
        for (Person2 e : l) {
            sum += e.getWeight();
            if (min.getWeight() > e.getWeight()) {
                min = e;
            }

            if (max.getWeight() < e.getWeight()) {
                max = e;
            }
        }
        double avg = sum / l.size();
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.printf("AVG: %5.1f" + avg);
    }

    public static void sortAge(ArrayList<Person2> l) {
        Person2 min = l.get(0);
        Person2 max = l.get(0);
        double sum = 0;
        for (Person2 e : l) {
            sum += e.getAge();
            if (min.getAge() > e.getAge()) {
                min = e;
            }
            if (max.getAge() > e.getAge()) {
                max = e;
            }
            double avg = sum / l.size();
            System.out.println("Min: " + min);
            System.out.println("Max: " + max);
            System.out.printf("AVG: %5.1f" + avg);
        }

    }
}


