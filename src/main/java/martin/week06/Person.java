package martin.week06;

public class Person {
    private static int lastID = 1;
    private int id;
    private int heightmm;
    private int age;
    private String name;
    private int gewicht;
    public Person() {
        id = lastID;
        lastID++;
        heightmm = 178;
        age = 33;
        name = "Max Musterman";
        gewicht = 78;
    }
    public Person(int height, int age, String name, int gewicht) {
        id = lastID;
        lastID++;
        this.heightmm = height;
        this.age = age;
        this.name = name;
        this.gewicht = gewicht;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getHeightmm() {
        return heightmm;
    }
    public void setHeightmm(int heightmm) {
        this.heightmm = heightmm;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getWeight() {
        return gewicht;
    }
    public void setWeight(int gewicht) {
        this.gewicht = gewicht;
    }
    @Override
    public String toString() {
        return String.format("%s ist %d Jahre alt, %smm groß und wiegt %dkg.", name, age, heightmm, gewicht);
    }
}