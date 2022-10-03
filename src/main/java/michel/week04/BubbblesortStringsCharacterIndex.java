package michel.week04;

import java.util.Arrays;

public class BubbblesortStringsCharacterIndex {


    public static void main(String[] args) {
        String[] names = new String[]{"Viktor", "Batuhan", "Milan", "Stefan", "Berna", "Franky", "Fatima", "Mike", "Mase", "Patric", "Alp", "Gyula", "Lukas", "Svitlana"};
        bubblesortIndex(names,4);
        System.out.println(Arrays.toString(names));


    }

private static String [] bubblesortIndex(String [] names, int index){
    for (String s : names) {
        if (s.length() <= index) {
            System.out.println("Liste kann nicht nach diesem Index sortiert werden.");
            System.out.println();
            System.out.println("Daher musst du mit dem Originalen Array leben!");
            return names;
        }
    }
    for (int i = 0; i < names.length; i++) {
        for (int j = 0; j + 1 < names.length; j++) {
            if (names[j].charAt(index) > names[j + 1].charAt(index)) {
                String name = names[j];
                names[j] = names[j + 1];
                names[j + 1] = name;
            }
        }
    }
    return names;
}



}
