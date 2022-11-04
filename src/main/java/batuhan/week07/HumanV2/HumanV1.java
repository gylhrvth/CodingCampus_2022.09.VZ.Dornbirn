package batuhan.week07.HumanV2;

import java.util.List;
import java.util.Vector;

public class HumanV1 {


    public static void main(String[] args) {


        Human N1 = new Human("batuhan", "danisment", 24, 1.81, 102.4);
        Human N2 = new Human("Jessica", "Schloemmer", 22, 1.59, 61);
        Human N3 = new Human("Deni", "Sambiev", 23, 1.83, 90.5);
        Human N4 = new Human("Jens", "Yarrak", 31, 1.77, 69);
        Human N5 = new Human("Lukas", "Maier", 26, 1.65, 59);



        Vector<Human> list = new Vector<>();
        list.add(N1);
        list.add(N2);
        list.add(N3);
        list.add(N4);
        list.add(N5);
        


    }



}
