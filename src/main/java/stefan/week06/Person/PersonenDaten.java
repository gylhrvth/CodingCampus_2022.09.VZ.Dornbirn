package stefan.week06.Person;

public class PersonenDaten {


    private int size;
    private int age;
    private String firstName;
    private int weight;


    public PersonenDaten(String firstName,int age,int size,int weight) {
        this.firstName = firstName;
        this.age = age;
        this.weight = weight;
        this.size = size;


    }


    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public int getSize() {
        return size;
    }

    public String toString() {
        return "Ich heisse:  " +firstName+
                "\nIch bin: "+age+
                " Alt\n"+"Ich Wiege: "+weight+
                "\nIch bin: "+size+" cm Groß";
    }
}
