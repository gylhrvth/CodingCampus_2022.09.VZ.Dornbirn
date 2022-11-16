package franz.week06.objekt.Person.ExamplePerson;

import java.util.Collections;
import java.util.List;

public class SortedHouse extends House {

    public SortedHouse(int doors, int windows, String adresse) {
        super(doors, windows, adresse);
    }

    @Override
    public void addPerson(ExamplePerson p1) {
        super.addPerson(p1);
        super.setInhabitants(bubblesortPerson(super.getInhabitants()));
    }

    private List<ExamplePerson> bubblesortPerson(List<ExamplePerson> persons) {
        ExamplePerson temp;

        for (int i = 0; i < persons.size(); i++) {
            for (int j = i + 1; j < persons.size(); j++) {
                if (persons.get(i).getName().compareTo(persons.get(j).getName()) > 0) {
                    temp = persons.get(i);
                    persons.set(i, persons.get(j));
                    persons.set(j, temp);
                }
            }
        }
        return persons;
    }

}
