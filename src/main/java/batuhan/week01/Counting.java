package batuhan.week01;

public class Counting {

    public static void main(String[] args){
        for (int i = 0; i <= 10; ++i){
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(i);
        }
        System.out.println();

        System.out.println("===========");

        int j = 0;
        while (j <= 10){
            if (j > 0) {
                System.out.print(", ");
            }
            System.out.print(j);

            ++j;
        }
        System.out.println();



    }


}
