package milan.week07.PersonV2;

import java.util.Random;
import java.util.Vector;


public class TestPerson {

    public enum SortedBy {
        HEIGHT,
        AGE,
        WEIGHT,
        FIRSTNAME,
        LASTNAME;
    }

    private static Random rand = new Random();

    public static void main(String[] args) {

        Vector<Person> list = new Vector<>();
        for (int i = 0; i < 5; i++) {
            list.add(generatePerson());
        }
        String dataFromList = giveListData(list);
        System.out.println(dataFromList);
        System.out.println("--------------------------------------");
        Vector<Person> neuSortierteListe = sortList(list, SortedBy.LASTNAME);
        System.out.println(neuSortierteListe);
    }


    public static boolean hasToSwap(SortedBy sortBy, Person p1, Person p2){
        if (sortBy == SortedBy.HEIGHT) {
                return p1.getHeight() > p2.getHeight();
        }
        else if (sortBy == SortedBy.LASTNAME){
                return p1.getLastname().compareTo(p2.getLastname()) > 0;
        }
        else if (sortBy == SortedBy.FIRSTNAME) {
            return p1.getFirstname().compareTo(p2.getFirstname()) > 0;
        }
        if (sortBy == SortedBy.WEIGHT) {
            return p1.getWeight() > p2.getWeight();
        }
        if (sortBy == SortedBy.AGE) {
            return p1.getAge() > p2.getAge();
        }
        return false;
    }

    public static Vector<Person> sortList(Vector<Person> list, SortedBy sortBy) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size() - 1; j++) {
                if (hasToSwap(sortBy, list.get(j), list.get(j + 1))) {
                    Person temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
        return list;
    }


    public static String giveListData(Vector<Person> list) {
        return "Die größte Person ist: "
                + findTallestPerson(list).getFirstname() + " "
                + findTallestPerson(list).getLastname() + " " +
                "mit der Größe: "
                + findTallestPerson(list).getHeight() + " cm.\n" +
                "Die kleinste Person ist: "
                + findShortestPerson(list).getFirstname() + " "
                + findShortestPerson(list).getLastname() + " " +
                "mit der Größe: "
                + findShortestPerson(list).getHeight() + " cm.\n" +
                "Die schwerst Person ist: "
                + findHeaviestPerson(list).getFirstname() + " "
                + findHeaviestPerson(list).getLastname() + " " +
                "mit dem Gewicht: "
                + findHeaviestPerson(list).getWeight() + " kg.\n" +
                "Die leichteste Person ist: "
                + findLightestPerson(list).getFirstname() + " "
                + findLightestPerson(list).getLastname() + " " +
                "mit dem Gewicht: "
                + findLightestPerson(list).getWeight() + " kg.\n" +
                "Die älteste Person ist: "
                + findOldestPerson(list).getFirstname() + " "
                + findOldestPerson(list).getLastname() + ", " +
                "die Person ist: "
                + findOldestPerson(list).getAge() + " Jahre alt.\n" +
                "Die jüngste Person ist: "
                + findYoungestPerson(list).getFirstname() + " "
                + findYoungestPerson(list).getLastname() + ", " +
                "die Person ist: "
                + findYoungestPerson(list).getAge() + " Jahre jung.\n" +
                "Die Durchschnittsgröße aller Personen beträgt: "
                + findAverageHeight(list) + " cm.\n" +
                "Das Durchschnittsgewicht aller Personen beträgt: "
                + findAverageWeight(list) + " kg.\n" +
                "Das Durchschnittsalter aller Personen beträgt: "
                + findAverageAge(list) + " Jahre.";
    }

    public static double findAverageAge(Vector<Person> list) {
        double sum = 0;
        for (Person x : list) {
            sum += x.getAge();
        }
        sum /= list.size();
        return sum;
    }

    public static double findAverageWeight(Vector<Person> list) {
        double sum = 0;
        for (Person x : list) {
            sum += x.getWeight();
        }
        sum /= list.size();
        return sum;
    }

    public static double findAverageHeight(Vector<Person> list) {
        double sum = 0;
        for (Person x : list) {
            sum += x.getHeight();
        }
        sum /= list.size();
        return sum;
    }

    public static Person findYoungestPerson(Vector<Person> list) {
        Person testPerson = new Person("", "", Integer.MAX_VALUE, 0, 0);
        for (Person x : list) {
            if (x.getAge() < testPerson.getAge()) {
                testPerson = x;
            }
        }
        return testPerson;
    }

    public static Person findOldestPerson(Vector<Person> list) {
        Person testPerson = new Person("", "", Integer.MIN_VALUE, 0, 0);
        for (Person x : list) {
            if (x.getAge() > testPerson.getAge()) {
                testPerson = x;
            }
        }
        return testPerson;
    }

    public static Person findLightestPerson(Vector<Person> list) {
        Person testPerson = new Person("", "", 0, 0, Integer.MAX_VALUE);
        for (Person x : list) {
            if (x.getWeight() < testPerson.getWeight()) {
                testPerson = x;
            }
        }
        return testPerson;
    }

    public static Person findHeaviestPerson(Vector<Person> list) {
        Person testPerson = new Person("", "", 0, 0, Integer.MIN_VALUE);
        for (Person x : list) {
            if (x.getWeight() > testPerson.getWeight()) {
                testPerson = x;
            }
        }
        return testPerson;
    }

    public static Person findShortestPerson(Vector<Person> list) {
        Person testPerson = new Person("", "", 0, Integer.MAX_VALUE, 0);
        for (Person x : list) {
            if (x.getHeight() < testPerson.getHeight()) {
                testPerson = x;
            }

        }
        return testPerson;
    }

    public static Person findTallestPerson(Vector<Person> list) {
        Person testPerson = new Person("", "", 0, Integer.MIN_VALUE, 0);
        for (Person x : list) {
            if (x.getHeight() > testPerson.getHeight()) {
                testPerson = x;
            }

        }
        return testPerson;
    }

    public static Person generatePerson() {
        String firstNames[] = {"Johanna", "Clemens", "Milan", "Fatima", "Franky", "Batuhan", "Viktor"};
        String lastNames[] = {"Aleksic", "Huber", "Meier", "Fink", "Neyer", "Matt", "Peikert", "Knauer"};

        return new Person(firstNames[rand.nextInt(firstNames.length)],
                lastNames[rand.nextInt(lastNames.length)],
                20 + rand.nextInt(80),
                150 + rand.nextInt(50),
                50 + rand.nextInt(60));
    }
}
