package batuhan.week06.DataClass;

import java.text.SimpleDateFormat;

public class Identifyperson {


    private static int lastID = 1;
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private String place;
    private String dateofbith;
    private String bornofplace;
    private double distance;





    public Identifyperson(String firstName,String lastName){
        id = lastID;
        ++lastID;
        this.firstName = firstName;
        this.lastName = lastName;
        age = 0;
        place = "Berlin";
        bornofplace = "Newyork";
        dateofbith = "01.01.2000";
        distance = 49.87;








    }  public void setAge(int age) {
        this.age = age;
    }  public void setPlace(String place) {
        this.place = place;
    }  public void setBornofplace(String bornofplace) {
        this.bornofplace = bornofplace;
    }  public void setDateofbith(String dateofbith) {
        this.dateofbith = dateofbith;
    }  public void setDistance(double distance) {
        this.distance = distance;
    }


    public String toString() {
        return  id +
                ": Ich bin " +
                firstName +
                " " +
                lastName +
                " und bin " +
                age +
                " Jahre alt."+
                "\nIch bin am "
                +dateofbith +
                " in "
                +
                bornofplace+
                " geboren, Wohne aber in "
                + place+
                " ,das ist " + distance
                + " von der Hauptstadt entfernt.";
    }
}

