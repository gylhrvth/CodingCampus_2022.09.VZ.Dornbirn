//package batuhan.week06;
//
//import gyula.week05.ReadFileFromRessorcesWithBufferedReader;
//
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.io.Reader;
//import java.util.Objects;
//
//public class CountLetterInFile {
//    public static int counterLtterInFile(String text, char letter) {
//        int count = 0;
//
//        for (int i = 0; i < text.length(); i++) {
//            if (text.charAt(i) == letter) ;
//            count++;
//
//        }
//        return count;
//    }
//
//    public static int counterLetterfromArrays(String text, char[] array) {
//        int count = 0;
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < text.length(); j++) {
//
//            }
//            if (text.charAt(i) == array[i]) ;
//            count++;
//
//        }
//        return count;
//
//    }
//
//    public static void main(String[] args) {
//        try {
//            Reader reader = new InputStreamReader(Objects.requireNonNull(
//                    ReadFileFromRessorcesWithBufferedReader.class.getClassLoader().getResourceAsStream("txt/simpleText.txt")));
//            BufferedReader bf = new BufferedReader(reader);
//
//            char[] charsToCount = new char[]{'n', 'ö', 'ü'};
//
//            int countLetterInArray = 0;
//            int countLetter = 0;
//
//        return ;
//        }
//    }
//}
