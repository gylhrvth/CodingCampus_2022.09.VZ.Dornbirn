package martin.week06;

public class Person {
    private static int lastID = 1;
    private int id;
    private String height;
    private int age;
    private String name;
    private int gewicht;

    public Person() {
        id = lastID;
        lastID++;
        height = "1,78m";
        age = 33;
        name = "Max Musterman";
        gewicht = 78;
    }

    public Person(String height, int age, String name, int gewicht) {
        id = lastID;
        lastID++;
        this.height = height;
        this.age = age;
        this.name = name;
        this.gewicht = gewicht;
    }
    @Override
    public String toString(){
        return String.format("%s ist %d Jahre alt, %s groß und wiegt %dkg",name,age,height,gewicht);
    }
}
