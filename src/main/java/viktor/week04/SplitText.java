package viktor.week04;
import java.lang.StringBuilder;

public class SplitText {

    public static void wordSplit(String text, String pattern){

        String[] splitText = text.split(pattern);
        StringBuilder newString = new StringBuilder();

        for(int i = 0; i < splitText.length; i++){

            newString.append(splitText[i]);
            newString.append(System.lineSeparator());
        }
        System.out.println(newString);
    }



    public static void main(String[] args) {

    String text = "Heute wird ein guter Tag! Heute wird der beste Tag überhaupt! Heute wird ein spitzen super Tag!";

    wordSplit(text,"wird");
    }
}
