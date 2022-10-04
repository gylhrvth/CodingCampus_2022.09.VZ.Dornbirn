package alp.week04;

public class BubbleSortMitString {

    public static void main(String[] args) {
        String[] name =new String[]{"Viktor", "Batuhan", "Milan", "Stefan", "Berna", "Franky", "Fatima", "Mike", "Mase", "Patric", "Alp", "Gyula", "Lukas", "Svitlana"};
        for (int i = 0; i < name.length; i++) {
            for (int j = i +1; j < name.length ; j++) {
                if (name[j].compareTo(name[i]) < 0){
                    String wort = name[i];
                    name[i] = name[j];
                    name[j] = wort;
                }
            }
            System.out.println(name[i]);
        }

    }
}
