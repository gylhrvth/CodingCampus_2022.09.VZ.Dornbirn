package martin.week07;

import martin.week06.Person;

import java.sql.SQLOutput;
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
        for (int i = 0; i < 3; ++i) {
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
        System.out.println("The heaviest Person is: " + getWeight(personen, true) + "kg heavy.");
        System.out.println("The average Person is:  " + getAvgWeight(personen) + "kg heavy.");
        System.out.println("The lightest Person is: " + getWeight(personen, false) + "kg heavy.");
        System.out.println();
        //sortByHeightAsc(personen);
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
            gewicht = li.next().getGewicht();
            while (li.hasNext()) {
                Person next = li.next();
                if (biggestTrue && (next.getGewicht() > gewicht))
                    gewicht = next.getGewicht();
                if (!biggestTrue && (next.getGewicht() < gewicht))
                    gewicht = next.getGewicht();
            }
        }
        return gewicht;
    }

    private static int getAvgWeight(List<Person> personen) {
        ListIterator<Person> li = personen.listIterator();
        int avgweight = 0;
        if (personen.size() > 0) {
            while (li.hasNext()) {
                avgweight += li.next().getGewicht();
            }
            avgweight = avgweight / personen.size();
        }
        return avgweight;
    }

    private static void sortByHeightAsc(List<Person> personen) {
        ListIterator<Person> li = personen.listIterator();
        if (personen.size() > 0) {
            for (int i = 0; i < personen.size(); i++) {
                for (int j = i; j < personen.size(); j++) {
                    if (li.next().getHeightmm()<li.next().getHeightmm()){
                        li.previousIndex();
                        li.previousIndex();
                    }

                }
            }
        }
    }

    private static void printList(List<Person> personen){
        for (int i = 0; i < personen.size(); i++) {
            System.out.println(personen.get(i));
        }
    }

}