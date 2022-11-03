package lukas.week07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class Rehearsal {
    public static void main(String[] args) {
        List<Integer> tmp = new Vector<>();
        int i = 0;
        while (i < 10) {
            tmp.add(i);
            i++;
        }
        System.out.println("My Vector:");
        printList(tmp);

        List<Integer> tmp2 = new ArrayList<>();
        int i2 = 0;
        while (i2 < 10) {
            tmp2.add(i2);
            i2++;
        }

        System.out.println("My ArrayList");
        printList(tmp2);

        System.out.println("Removed last element from my ArrayList");
        tmp2.remove(tmp2.size() - 1);
        printList(tmp2);

        System.out.println("Added element before value 2 in my ArrayList");
        tmp2.add(2, 10);
        printList(tmp2);

        System.out.println("Replaced value 5 by 20 in my ArrayList");
        tmp2.set(6, 20);
        printList(tmp2);

        System.out.println("Replace first found value 2 by 1000 in my ArrayList");
        int indexOf2 = tmp2.indexOf(2);
        if(indexOf2 != -1) {
            tmp2.set(indexOf2, 1000);
        }
        printList(tmp2);

        System.out.println("My ArrayList divide in half and print first half");
        List<Integer> firstHalfList = tmp2.subList(0, tmp2.size()/2);
        printList(firstHalfList);
        System.out.println("My ArrayList divide in half and print second half");
        List<Integer> secondHalfList = tmp2.subList(tmp2.size()/2, tmp2.size());
        printList(secondHalfList);

        System.out.println("Combine fist and second half to whole list");
        List<Integer> completeList = new ArrayList<>();
        completeList.addAll(firstHalfList);
        completeList.addAll(secondHalfList);
        printList(completeList);
        System.out.println("My ArrayList and Completelist are the same?");
        System.out.println("Is the same: "+tmp2.equals(completeList));
        Collections.shuffle(completeList);
        System.out.println("Is the same after shuffle: "+tmp2.equals(completeList));
    }

    private static void printList(List<Integer> data) {
        for (Integer number : data) {
            System.out.println(number);
        }
    }
}
