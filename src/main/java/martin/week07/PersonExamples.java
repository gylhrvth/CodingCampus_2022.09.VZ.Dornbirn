package martin.week07;

import martin.week06.Person;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class PersonExamples {
    public final static Random rand = new Random();

    public static void main(String[] args) {
        Person a = new Person(167, 37, "Rasputin", 70);
        Person b = new Person(180, 43, "Aurelio", 82);
        Person c = new Person(177, 34, "Corsus", 77);
        Person d = new Person(182, 36, "Ignatius", 90);
        Person e = new Person(172, 65, "Mormisch", 112);
        List<Person> personen = new LinkedList<>();
        for (int i = 0; i < 10; ++i) {
            personen.add(generatePerson());
        }
        for (Person pers : personen) {
            System.out.println(pers);
        }

        System.out.println();
        System.out.println("The tallest Person is:  " + getHeight(personen, true) + "mm high.");
        System.out.println("The average Person is:  " + getAverageHeight(personen) + "mm high.");
        System.out.println("The smallest Person is: " + getHeight(personen, false) + "mm high.");
        System.out.println();
        System.out.println("The oldest Person is:   " + getAge(personen, true) + " years old.");
        System.out.println("The average Person is:  " + getAvgAge(personen) + " years old.");
        System.out.println("The youngest Person is: " + getAge(personen, false) + " years old.");
        System.out.println();
        System.out.println("The heaviest Person has: " + getWeight(personen, true));
        System.out.println("The average Person has:  " + getAvgWeight(personen));
        System.out.println("The lightest Person has: " + getWeight(personen, false));
        System.out.println();
        sortPersListBy(personen, 1);
        printList(personen);
        System.out.println();
        sortPersListBy(personen, 7);
        printList(personen);

    }

    public static Person generatePerson() {
        String[] firstName = {"Alfred", "Beatrix", "Cecil", "Demeter", "Alex"};
        String[] lastName = {"Müller", "Heinz", "Obert", "Simma", "Wohlgenannt"};

        return new Person(
                150 + rand.nextInt(5, 50),
                20 + rand.nextInt(5, 80),
                firstName[rand.nextInt(firstName.length)] + " " + lastName[rand.nextInt(lastName.length)],
                45 + rand.nextInt(55));
    }

    private static int getHeight(List<Person> personen, boolean biggestTrue) {
        ListIterator<Person> li = personen.listIterator();
        int height = -1;
        if (personen.size() > 0) {
            height = li.next().getHeightmm();
            while (li.hasNext()) {
                Person next = li.next();
                if (biggestTrue && (next.getHeightmm() > height))
                    height = next.getHeightmm();
                if (!biggestTrue && (next.getHeightmm() < height))
                    height = next.getHeightmm();
            }
        }
        return height;
    }

    private static int getAverageHeight(List<Person> personen) {
        ListIterator<Person> li = personen.listIterator();
        int avgheight = 0;
        if (personen.size() > 0) {
            while (li.hasNext()) {
                avgheight += li.next().getHeightmm();
            }
            avgheight = avgheight / personen.size();
        }
        return avgheight;
    }

    private static int getAge(List<Person> personen, boolean biggestTrue) {
        ListIterator<Person> li = personen.listIterator();
        int height = -1;
        if (personen.size() > 0) {
            height = li.next().getAge();
            while (li.hasNext()) {
                Person next = li.next();
                if (biggestTrue && (next.getAge() > height))
                    height = next.getAge();
                if (!biggestTrue && (next.getAge() < height))
                    height = next.getAge();
            }
        }
        return height;
    }

    private static int getAvgAge(List<Person> personen) {
        ListIterator<Person> li = personen.listIterator();
        int avgage = 0;
        if (personen.size() > 0) {
            while (li.hasNext()) {
                avgage += li.next().getAge();
            }
            avgage = avgage / personen.size();
        }
        return avgage;
    }

    private static int getWeight(List<Person> personen, boolean biggestTrue) {
        ListIterator<Person> li = personen.listIterator();
        int gewicht = -1;
        if (personen.size() > 0) {
            gewicht = li.next().getWeight();
            while (li.hasNext()) {
                Person next = li.next();
                if (biggestTrue && (next.getWeight() > gewicht))
                    gewicht = next.getWeight();
                if (!biggestTrue && (next.getWeight() < gewicht))
                    gewicht = next.getWeight();
            }
        }
        return gewicht;
    }

    private static int getAvgWeight(List<Person> personen) {
        ListIterator<Person> li = personen.listIterator();
        int avgweight = 0;
        if (personen.size() > 0) {
            while (li.hasNext()) {
                avgweight += li.next().getWeight();
            }
            avgweight = avgweight / personen.size();
        }
        return avgweight;
    }

    private static void printList(List<Person> personen) {
        for (Person person : personen) {
            System.out.println(person);
        }
    }

    private static void sortByHeightAsc(List<Person> personen) {
        if (personen.size() > 0) {
            for (int i = 0; i < personen.size(); i++) {
                for (int j = 0; j < personen.size() - 1; j++) {
                    if (personen.get(j).getHeightmm() < personen.get(j + 1).getHeightmm()) {
                        Person temp = personen.get(j);
                        personen.set(j, personen.get(j + 1));
                        personen.set(j + 1, temp);
                    }
                }
            }
        }
    }

    private static void sortByHeightDesc(List<Person> personen) {
        if (personen.size() > 0) {
            for (int i = 0; i < personen.size(); i++) {
                for (int j = 0; j < personen.size() - 1; j++) {
                    if (personen.get(j).getHeightmm() > personen.get(j + 1).getHeightmm()) {
                        Person temp = personen.get(j);
                        personen.set(j, personen.get(j + 1));
                        personen.set(j + 1, temp);
                    }
                }
            }
        }
    }

    private static void sortByAgeAsc(List<Person> personen) {
        if (personen.size() > 0) {
            for (int i = 0; i < personen.size(); i++) {
                for (int j = 0; j < personen.size() - 1; j++) {
                    if (personen.get(j).getAge() < personen.get(j + 1).getAge()) {
                        Person temp = personen.get(j);
                        personen.set(j, personen.get(j + 1));
                        personen.set(j + 1, temp);
                    }
                }
            }
        }
    }

    private static void sortByAgeDesc(List<Person> personen) {
        if (personen.size() > 0) {
            for (int i = 0; i < personen.size(); i++) {
                for (int j = 0; j < personen.size() - 1; j++) {
                    if (personen.get(j).getAge() > personen.get(j + 1).getAge()) {
                        Person temp = personen.get(j);
                        personen.set(j, personen.get(j + 1));
                        personen.set(j + 1, temp);
                    }
                }
            }
        }
    }

    private static void sortByWeightAsc(List<Person> personen) {
        if (personen.size() > 0) {
            for (int i = 0; i < personen.size(); i++) {
                for (int j = 0; j < personen.size() - 1; j++) {
                    if (personen.get(j).getWeight() < personen.get(j + 1).getWeight()) {
                        Person temp = personen.get(j);
                        personen.set(j, personen.get(j + 1));
                        personen.set(j + 1, temp);
                    }
                }
            }
        }
    }

    private static void sortByWeightDesc(List<Person> personen) {
        if (personen.size() > 0) {
            for (int i = 0; i < personen.size(); i++) {
                for (int j = 0; j < personen.size() - 1; j++) {
                    if (personen.get(j).getWeight() > personen.get(j + 1).getWeight()) {
                        Person temp = personen.get(j);
                        personen.set(j, personen.get(j + 1));
                        personen.set(j + 1, temp);
                    }
                }
            }
        }
    }

    private static void sortByNameAsc(List<Person> personen) {
        if (personen.size() > 0) {
            for (int i = 0; i < personen.size(); i++) {
                for (int j = 0; j < personen.size() - 1; j++) {
                    if (personen.get(j).getName().compareTo(personen.get(j + 1).getName()) > 0) {
                        Person temp = personen.get(j);
                        personen.set(j, personen.get(j + 1));
                        personen.set(j + 1, temp);
                    }
                }
            }
        }
    }

    private static void sortByNameDesc(List<Person> personen) {
        if (personen.size() > 0) {
            for (int i = 0; i < personen.size(); i++) {
                for (int j = 0; j < personen.size() - 1; j++) {
                    if (personen.get(j).getName().compareTo(personen.get(j + 1).getName()) < 0) {
                        Person temp = personen.get(j);
                        personen.set(j, personen.get(j + 1));
                        personen.set(j + 1, temp);
                    }
                }
            }
        }
    }

    private static void sortPersListBy(List<Person> personen, int sortBy) {
        if (sortBy == 1) {
            sortByHeightAsc(personen);
        }
        if (sortBy == 2) {
            sortByHeightDesc(personen);
        }
        if (sortBy == 3) {
            sortByAgeAsc(personen);
        }
        if (sortBy == 4) {
            sortByAgeDesc(personen);
        }
        if (sortBy == 5) {
            sortByWeightAsc(personen);
        }
        if (sortBy == 6) {
            sortByWeightDesc(personen);
        }
        if (sortBy == 7) {
            sortByNameAsc(personen);
        }
        if (sortBy == 8) {
            sortByNameDesc(personen);
        }
    }
}