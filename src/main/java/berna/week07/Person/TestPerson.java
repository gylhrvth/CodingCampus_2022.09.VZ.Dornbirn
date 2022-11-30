package berna.week07.Person;

import java.util.Vector;

public class TestPerson {
    public static void main(String[] args) {
        StatsOfPersons stats = new StatsOfPersons();
        //create a list with my test Persons
        Vector <Person> listPersons;

        listPersons = stats.addPerson(
                new Person("dummy 1", 22, 120, 55),
                new Person("dummy 2", 15, 125, 50),
                new Person("dummy 3", 28, 186, 88),
                new Person("dummy 4", 16, 123, 50),
                new Person("dummy 5", 17, 121, 60),
                new Person("dummy 6", 18, 119, 70),
                new Person("dummy 7", 19, 117, 80)
        );
        //print the statistics of all persons
        System.out.println(stats.toString());
        stats.sortBySize();

    }

    public static Vector<Person> sortListOfPersonAge(Vector<Person> listOfPersons) {
        Vector<Person> sorted = new Vector<>();
        sorted.addAll(listOfPersons);
        Person temp = null;

        for (int i = 0; i < sorted.size()-1; i++) {
            for (int j = 0; j < sorted.size()-1; j++) {
                if (sorted.get(j).getAge() < sorted.get(j + 1).getAge()) {
                    temp = sorted.get(j);
                    sorted.set(j, sorted.get(j + 1));
                    sorted.set(j+1,temp);
                }
            }
        }
        return sorted;
    }


}

