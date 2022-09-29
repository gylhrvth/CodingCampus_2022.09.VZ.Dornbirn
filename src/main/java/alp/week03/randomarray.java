package alp.week03;
import java.util.Random;
import java.util.Arrays;
public class randomarray {

    public static int[] main(int size) {

        int[] randy2 = new int[size];
        for (int i = 0; i < randy2.length; i++) {
            Random randy1 = new Random();
            randy2[i] = randy1.nextInt(0,100);
        }
       return randy2;
    }
}
