package milan.week03;

public class RandomNumberArraySumme {

    public static void main(String[] args) {
        System.out.println("---------------------");
        System.out.println();
        int[] template = RandomNumberArray.createArrayWithRandomNum(20);
        System.out.println();
        int result = searchAndCountSum(template);
        System.out.println("Die Summe aller Werte berträgt: " + result);
        System.out.println();

    }

    public static int searchAndCountSum(int[] template) {
        int result = 0;
        for (int i = 0; i < template.length; i++) {
            result = result + template[i];


        }
        return result;
    }
}

