package fatima.week07.PersonV2;

import java.util.Vector;

public class PersonV2MinMaxAvgSort {

    private Vector<PersonV2> data;

    public PersonV2MinMaxAvgSort() {
        data = new Vector<>();
    }

    public void addPerson(PersonV2 p) {
        data.add(p);
    }

    public PersonV2 getMinByAge() {
        PersonV2 bestPerson = null;

        for (PersonV2 p : data) {
            if (bestPerson == null || p.getAge() < bestPerson.getAge()) {
                bestPerson = p;
            }
        }
        return bestPerson;
    }

    public PersonV2 getMaxByAge() {
        PersonV2 bestPerson = null;

        for (PersonV2 p : data) {
            if (bestPerson == null || p.getAge() > bestPerson.getAge()) {
                bestPerson = p;
            }
        }
        return bestPerson;
    }

    public PersonV2 getMinByHeight() {
        PersonV2 bestPerson = null;

        for (PersonV2 p : data) {
            if (bestPerson == null || p.getHeight() < bestPerson.getHeight()) {
                bestPerson = p;
            }
        }
        return bestPerson;
    }

    public PersonV2 getMaxByHeight() {
        PersonV2 bestPerson = null;

        for (PersonV2 p : data) {
            if (bestPerson == null || p.getHeight() > bestPerson.getHeight()) {
                bestPerson = p;
            }
        }
        return bestPerson;
    }

    public PersonV2 getMinByWeight() {
        PersonV2 bestPerson = null;

        for (PersonV2 p : data) {
            if (bestPerson == null || p.getWeight() < bestPerson.getWeight()) {
                bestPerson = p;
            }
        }
        return bestPerson;
    }

    public PersonV2 getMaxByWeight() {
        PersonV2 bestPerson = null;

        for (PersonV2 p : data) {
            if (bestPerson == null || p.getWeight() > bestPerson.getWeight()) {
                bestPerson = p;
            }
        }
        return bestPerson;
    }

    public double getAvgByAge() {
        double sum = 0;
        for (int i = 0; i < data.size(); i++) {
            sum += data.get(i).getAge();
        }
        double avg = (double)sum / data.size();
        return avg;
    }

    public double getAvgByHeight() {
        double sum = 0;
        for (int i = 0; i < data.size(); i++) {
            sum += data.get(i).getHeight();
        }
        double avg = (double)sum / data.size();
        return avg;
    }

    public double getAvgByWeight() {
        double sum = 0;
        for (int i = 0; i < data.size(); i++) {
            sum += data.get(i).getWeight();
        }
        double avg = (double)sum / data.size();
        return avg;
    }

    public void sortByHeight() {
        for (int i = 0; i < data.size(); i++) {
            for (int j = 0; j < data.size() -1; j++) {
                if (data.get(j).getHeight() > data.get(j+1).getHeight()) {
                    PersonV2 temp = data.get(j);
                    data.set(j, data.get(j+1));
                    data.set(j + 1, temp);
                }
            }
        }
        System.out.println(data);
    }

    public void sortByAge() {
        for (int i = 0; i < data.size(); i++) {
            for (int j = 0; j < data.size() -1; j++) {
                if (data.get(j).getAge() > data.get(j+1).getAge()) {
                    PersonV2 temp = data.get(j);
                    data.set(j, data.get(j+1));
                    data.set(j + 1, temp);
                }
            }
        }
        System.out.println(data);
    }

    public void sortByWeight() {
        for (int i = 0; i < data.size(); i++) {
            for (int j = 0; j < data.size() -1; j++) {
                if (data.get(j).getWeight() > data.get(j+1).getWeight()) {
                    PersonV2 temp = data.get(j);
                    data.set(j, data.get(j+1));
                    data.set(j + 1, temp);
                }
            }
        }
        System.out.println(data);
    }

    public void sortByLastname() {
        for (int i = 0; i < data.size(); i++) {
            for (int j = 0; j < data.size() -1; j++) {
                if (data.get(j).getLastname().compareTo(data.get(j+1).getLastname()) > 0) {
                    PersonV2 temp = data.get(j);
                    data.set(j, data.get(j+1));
                    data.set(j + 1, temp);
                }
            }
        }
    }

    public String getTextOfData(){
        return data.toString();
    }
}
