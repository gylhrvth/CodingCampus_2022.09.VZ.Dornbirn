package mase;

import mase.week08.Person.Person2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {
    @Test
    void getName() {
        String nameToTest = "mike";
        Person2 mike = new Person2(1.80f, 18, nameToTest, 80);
        assertEquals(nameToTest, mike.getName());
    }

    @Test
    void getAge(){
        int AgeTest = 33;
        Person2 mk = new Person2(1.70f,33,"mike",45);
        assertEquals(AgeTest,mk.getAge());
    }
}
