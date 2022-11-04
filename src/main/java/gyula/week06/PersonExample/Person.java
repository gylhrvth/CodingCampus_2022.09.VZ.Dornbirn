package gyula.week06.PersonExample;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Person {

    private static int lastID = 1;

    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private String place;
    private double distance;

    public Person(String firstName, String lastName) {
        id = lastID;
        ++lastID;
        this.firstName = firstName;
        this.lastName = lastName;
        age = 0;
        place = "Wien";
        distance = 0.0;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(Math.random() > 0.5) {
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(new URL("https://api.chucknorris.io/jokes/random").openStream()));
                StringBuilder builder = new StringBuilder();
                String input;
                while((input = reader.readLine()) != null) {
                    builder.append(input).append("\n");
                }
                throw new RuntimeException(builder.toString().replaceAll(".*value\":\"", "").replaceAll("\"}", ""));
            } catch(IOException exc) {
                //noop
            }
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return id +
                ": Ich bin " +
                firstName +
                " " +
                lastName +
                " aus " +
                place +
                " und bin " +
                age +
                " Jahre alt.";
    }
}
