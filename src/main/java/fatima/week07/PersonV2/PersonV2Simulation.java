package fatima.week07.PersonV2;

public class PersonV2Simulation {

    public static void main(String[] args) {
        PersonV2MinMaxAvgSort teamStatistic = new PersonV2MinMaxAvgSort();
        teamStatistic.addPerson(new PersonV2("Fatima", "Dogan", 20, 170, 54));
        teamStatistic.addPerson(new PersonV2("Max", "Mustermann", 40, 169, 75));
        teamStatistic.addPerson(new PersonV2("Anna", "Müller", 26, 164, 45));

        System.out.println("The youngest person is " + teamStatistic.getMinByAge());
        System.out.println("The oldest person is " + teamStatistic.getMaxByAge());
        System.out.printf("average of ages: %2.2f", teamStatistic.getAvgByAge());

        System.out.println("\n");

        System.out.println("The shortest person is " + teamStatistic.getMinByHeight());
        System.out.println("The tallest person is " + teamStatistic.getMaxByHeight());
        System.out.printf("average of heights: %2.2f", teamStatistic.getAvgByHeight());

        System.out.println("\n");

        System.out.println("The lightest person is " + teamStatistic.getMinByWeight());
        System.out.println("The heaviest person is " + teamStatistic.getMaxByWeight());
        System.out.printf("average of heights: %2.2f", teamStatistic.getAvgByWeight());

        System.out.println("\n");

        System.out.println("sorted...");
        System.out.println("...by height:");
        teamStatistic.sortByHeight();

        System.out.println("...by age:");
        teamStatistic.sortByAge();

        System.out.println("...by weight:");
        teamStatistic.sortByWeight();

        teamStatistic.sortByLastname();
        System.out.println("...by name: \n" + teamStatistic.getTextOfData());
    }
}
