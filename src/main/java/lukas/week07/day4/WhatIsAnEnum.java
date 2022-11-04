package lukas.week07.day4;

import mase.week06.Person;

import java.util.ArrayList;
import java.util.List;

public class WhatIsAnEnum {

    public enum PersonCriteria {
        WEIGHT,
        AGE,
        HEIGHT,
    }

    public static void main(String[] args) {
        for (PersonCriteria criteria : PersonCriteria.values()) {
            sort(new ArrayList<>(), criteria);
        }
        sort(new ArrayList<>(), PersonCriteria.AGE);
    }

    //Methode soll sortieren nach Größe, Alter oder Gewicht
    public static void sort(List<Person> persons, PersonCriteria sortAfter) {
        switch (sortAfter) {
            case AGE -> System.out.println("Sorting after age");
            case HEIGHT -> System.out.println("Sorting after height");
            default -> {
                //Mehrzeilig
                System.out.println();
                System.out.println("Sorting after weigth");
            }
        }

        //Alte switch variante
        switch (sortAfter) {
            case AGE:
                System.out.println("age");
                break;
            case HEIGHT:
                System.out.println("height");
                break;
            default:
                System.out.println("weight");
        }

        if (sortAfter == PersonCriteria.AGE) {
            //nach alter sortieren
        } else if (sortAfter == PersonCriteria.WEIGHT) {
            //nach gewicht sortieren
        } else {
            //nach höhe sortieren
        }
    }

    public static int comparePersonsByCriteria(Person lhs, Person rhs, PersonCriteria criteria) {
        if (criteria == PersonCriteria.AGE) {
            return lhs.getAge() - rhs.getAge();
        }
        //else if ...
        throw new UnsupportedOperationException();
    }
}
