package patric.week05;

import java.text.SimpleDateFormat;
import java.util.Date;


public class WannUndWo {

    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
        System.out.println("Date : " + formatter.format(date));

        formatter = new SimpleDateFormat("HH:mm:ss");
        System.out.println("Time : " + formatter.format(date));

        formatter = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        System.out.println("Time : " + formatter.format(date));


    }


}
