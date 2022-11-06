package lukas.week07.day5;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, String> myPhoneBook = new HashMap<>();

        myPhoneBook.put("Max Mustermann", "+436382098409824, Dornbirn, Digitalcampusstraße 1");
        myPhoneBook.put("Goofy", "+436123091831308, Dornbirn, Digitalcampusstraße 2");
        myPhoneBook.put("Elon Musk", "+436382098409824, Nüziders, Digitalcampus");

        System.out.println("Max' Adresse: " + myPhoneBook.get("Max Mustermann"));

        myPhoneBook.put("Max Mustermann", "gelöscht");

        System.out.println("Max' Adresse: " + myPhoneBook.get("Max Mustermann"));

        System.out.println("Max' Adresse: " + myPhoneBook.get("Mustermann"));


    }
}
