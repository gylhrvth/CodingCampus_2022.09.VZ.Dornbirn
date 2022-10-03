package patric.week04;

public class BubblesortWords {

    public static void main(String [] args) {
        String[] names = new String[]{"Viktor", "Batuhan", "Milan", "Stefan", "Berna", "Franky", "Fatima", "Mike", "Mase", "Patric", "Alp", "Gyula", "Lukas", "Svitlana"};
        for (int i = 0; i < names.length; i++) {
            for (int j = i+1; j < names.length; j++) {
                if (names[j].compareTo(names[i]) < 0) {
                    String wort = names[i];
                    names[i] = names[j];
                    names[j] = wort;
                }
            }
            System.out.println(names[i]);
        }
    }

}
