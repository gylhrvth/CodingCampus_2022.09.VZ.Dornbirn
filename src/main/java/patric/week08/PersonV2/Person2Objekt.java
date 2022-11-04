package patric.week08.PersonV2;

import patric.week07.Person.MinMaxAvg;
import patric.week07.Person.PersonsInformation;
import patric.week08.PersonV2.PersonV2;

import java.util.List;
import java.util.Vector;

public class Person2Objekt {


    public static void main(String[] args) {
        PersonV2 mikeV2 = new PersonV2("Mike Suter", 29, 1.83, 50);
        PersonV2 bernaV2 = new PersonV2("Berna Köchle", 20, 1.91, 46);
        PersonV2 lukasV2 = new PersonV2("Lukas", 25, 2.01, 70);

//        System.out.println(lukasV2);
//        System.out.println(mikeV2);
//        System.out.println(bernaV2);

        List<PersonV2> persons = new Vector<>();
        persons.add(mikeV2);
        persons.add(bernaV2);
        persons.add(lukasV2);

        PersonsInformation information = calculateInformation(persons);

        System.out.println(information);
    }

    private static PersonsInformation calculateInformation(List<PersonV2> persons) {

        //Calculate min/max/avg height
        double minHeight = persons.get(0).size;
        double maxHeight = persons.get(0).size;
        double heightSum = 0;

        for (PersonV2 p : persons) {
            minHeight = Math.min(minHeight, p.size);
            maxHeight = Math.max(maxHeight, p.size);
            heightSum += p.size;
        }
        double avgHeight = heightSum / persons.size();

        MinMaxAvg heightMinMaxAvg = new MinMaxAvg(minHeight, maxHeight, avgHeight);




        //Calculate min/max/avg age
        double minAge = persons.get(0).age;
        double maxAge = persons.get(0).age;
        double ageSum = 0;

        for (PersonV2 p : persons) {
            minAge = Math.min(minAge, p.age);
            maxAge = Math.max(maxAge, p.age);
            ageSum += p.age;
        }
        double avgAge = ageSum / persons.size();

        MinMaxAvg ageMinMaxAvg = new MinMaxAvg(minAge, maxAge, avgAge);





        //Calculate min/max/avg wheight
        double minWeight = persons.get(0).weight;
        double maxWeight = persons.get(0).weight;
        double weightSum = 0;



        for (PersonV2 p : persons) {
            minWeight = Math.min(minWeight, p.weight);
            maxWeight = Math.max(maxWeight, p.weight);
            weightSum += p.weight;
        }
        double avgWeight = weightSum / persons.size();

        MinMaxAvg weightMinMaxAvg = new MinMaxAvg(minWeight, maxWeight, avgWeight);

        return new PersonsInformation(ageMinMaxAvg, heightMinMaxAvg, weightMinMaxAvg);
    }
}
