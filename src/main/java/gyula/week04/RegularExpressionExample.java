package gyula.week04;

import lukas.data.Texts;

import java.util.Arrays;

public class RegularExpressionExample {
    public static void main(String[] args) {
        String hesseText = Texts.HESSE;

        hesseText = hesseText.replaceAll("\n", " ");
        hesseText = hesseText.replaceAll("[.?!,:\"]", "");
        hesseText = hesseText.replaceAll("[0-9]+ ", " ");
        hesseText = hesseText.replaceAll("\s+", " ");
        String[] words = hesseText.split(" ");

        System.out.println(Arrays.toString(words));

        System.out.println("-------------");

        String regExForEmail = "[a-zA-Z]+([.][a-zA-Z]+)*@[a-zA-Z]+.at";
        String userInput = "gyula.horvath@digitalcampusvorarlberg.at";

        System.out.println(userInput.matches(regExForEmail));

    }
}
