package patric.week07.Person;

public class PersonsInformation {
    private MinMaxAvg ageInformation;
    private MinMaxAvg heightInformation;
    private MinMaxAvg weightInformation;

    public PersonsInformation(MinMaxAvg ageInformation, MinMaxAvg heightInformation, MinMaxAvg weightInformation) {
        this.ageInformation = ageInformation;
        this.heightInformation = heightInformation;
        this.weightInformation = weightInformation;
    }

    public MinMaxAvg getAgeInformation() {
        return ageInformation;
    }

    public MinMaxAvg getHeightInformation() {
        return heightInformation;
    }

    public MinMaxAvg getWeightInformation() {
        return weightInformation;
    }

    @Override
    public String toString() {
        return "PersonsInformation{" +
                "ageInformation=" + ageInformation +
                ", heightInformation=" + heightInformation +
                ", weightInformation=" + weightInformation +
                '}';
    }
}
