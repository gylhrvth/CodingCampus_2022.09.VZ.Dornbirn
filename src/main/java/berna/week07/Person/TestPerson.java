package berna.week07.Person;


public class TestPerson {
    public static void main(String[] args) {
        StatsOfPersons stats = new StatsOfPersons();
        //create a list with my test Persons
        Person person1 = new Person("dummy 1",22,120,55);
        stats.addPerson(person1);
        stats.addPerson(
                new Person("dummy 2",15,125,50),
                new Person("dummy 3",28,186,88),
                new Person("dummy 4",16,123,50),
                new Person("dummy 5",17,121,60),
                new Person("dummy 6",18,119,70),
                new Person("dummy 7",19,117,80)
        );
        //print the statistics of all persons
        System.out.println(stats.toString());

    }
}
