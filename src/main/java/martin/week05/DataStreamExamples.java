package martin.week05;
import martin.MWerkzeuge;

import java.io.*;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class DataStreamExamples {
    public static void main(String[] args) {
        MWerkzeuge.head("#", "Verzeichnis auflisten");
        File file1 = new File("C:/Users/Public");
        printSortedDirectories(file1);

        MWerkzeuge.head("#", "Dateien Zählen und Summen");
        String[] dirSize2 = getDataAmountAndSizeSingleDir(file1);
        System.out.printf("Es befinden sich %s Dateien in diesem Verzeichnis, mit einer Gesamtgröße von %skb ohne Unterverzeichnisse.%n%n", dirSize2[0], dirSize2[1]);

        MWerkzeuge.head("#", "Dateien Zählen und Summen (Rekursiv)");
        int dirAmmount3 = getDirectoryAmountAll(file1);
        long dirSize3 = getDirectorySizeAll(file1);
        System.out.printf("Es befinden sich %d Dateien in diesem Verzeichnis & allen Unterverzeichnissen mit einer Gesamtgröße von %d Bytes.%n%n", dirAmmount3, dirSize3);

        MWerkzeuge.head("#", "Größte Datei suchen");
        File file4 = pathToBiggestFile(file1);
        System.out.printf("Die größte Datei in %s hat den Pfad %s mit einer Größe von %d.%n%n", file1, file4, file4.length());

        MWerkzeuge.head("#", "Datei nach Name suchen");
        String searchFor5 = MWerkzeuge.readUserInputString("Nach was soll gesucht werden? ");
        File filePath5 = new File(MWerkzeuge.readUserInputString("Geben sie bitte einen Dateipfad an, welcher durchsucht soll.\n"));
        printSearchForFile("  ╚══> ", filePath5, searchFor5);
        System.out.println();

        MWerkzeuge.head("#", "File schreiben");
        File filePath6 = new File("assets/tmp/output.txt");
        writeATxtFile(filePath6);

        MWerkzeuge.head("#", "Daten tabellarisch darstellen");
        File filePath7 = new File("assets/tmp/output.txt");
        String[] firstName = {"Alfonso", "Beatrix-Eleonor", "Cecil", "Daniel", "Elmar"};
        String[] lastName = {"Klein", "Kinderdorfer", "Al Elmenar", "Schmidt", "Simma"};
        int[] age = {40, 78, 5, 18, 81};
        String[] place = {"Wien", "Schwarzach", "Wiener Neudorf", "Sankt Pölten", "Sankt Pölten"};
        float[] distanceFromCapital = {0f, 654.4f, 12.457634366f, 120.0f, 119.9999f};
        writeAChartFile(filePath7, "Vorname", firstName, "Nachname", lastName, age, "Wohnort", place, distanceFromCapital);
        System.out.print("Sehen sie bitte in " + filePath7.getAbsolutePath() + " nach ob eine 'ordentlich' formatierte Tabelle vorhanden ist.");
        String simulatedWait = "Initialtext";
        while (simulatedWait.length() > 0) simulatedWait = MWerkzeuge.readUserInputString("");
        System.out.println();

        MWerkzeuge.head("#", "Erstelle eine Klasse für Logging");
        System.out.println("Prüfe " + MWerkzeuge.getLogFile().getAbsolutePath() + " nach einem entsprechenden Logfile.\n");
        MWerkzeuge.Log(3, "Initialisiere Logfile");
        MWerkzeuge.Log(0, "Leer Platzhalter");

        MWerkzeuge.head("#", "File einlesen und Ausgeben");
        File filePath9 = new File("assets/tmp/output.txt");
        MWerkzeuge.Log(3, "Initialisiere File reader");
        fileReader(filePath9);

        MWerkzeuge.head("#", "Buchstaben zählen");
        MWerkzeuge.Log(3, "Initialisiere Buchstaben zählen");
        File filePath10 = new File("assets/tmp/output.txt");
        char[] charsToCount = {'a', 'z', 'e'};
        System.out.println("Die Symbole " + Arrays.toString(charsToCount) + " wurden " + countChars(filePath10, charsToCount) + "-mal im Text gefunden.\n");

        MWerkzeuge.head("#", "Wörter zählen");
        MWerkzeuge.Log(3, "Initialisiere Wörter zählen");
        File filePath11 = new File("src/main/resources/txt/simpleText.txt");
        fileReader(filePath11);
        System.out.println("Es wurden " + countWords(filePath11, "", true) + " Wörter gefunden.\n");

        MWerkzeuge.head("#", "Dynamisches Wörter zählen");
        MWerkzeuge.Log(3, "Initialisiere Dynamisches Wörter zählen");
        String searchWord12 = MWerkzeuge.readUserInputString("Nach welchem Wort soll gesucht werden? ");
        System.out.printf("Das Wort \"%s \" wurde %d-mal im Text gefunden.%n%n", searchWord12, countWords(filePath11, searchWord12, false));


        MWerkzeuge.head("#", "Dynamisches Wörter ersetzen");
        MWerkzeuge.Log(3, "Initialisiere Dynamisches Wörter ersetzen");
        String searchWord13 = MWerkzeuge.readUserInputString("Welches Wort soll ersetzt werden? ");
        String replaceWord13 = MWerkzeuge.readUserInputString("Welches Wort willst du einsetzen? ");
        System.out.printf("%n%s%n", replaceWord(filePath11, searchWord13, replaceWord13));

    }

    public static void printFileList(String prefix, File start) {
        System.out.println(prefix + start.getName());
        if (start.isDirectory()) {
            File[] children = start.listFiles();
            if (children != null) {
                for (File f : children) {
                    printFileList("  " + prefix, f);
                }
            }
        }
    }

    public static void printFileArray(String prefix, File[] directory) {
        for (File file : directory) printFileList(prefix, file);
    }

    public static void printSortedDirectories(File startDirectory) {
        File[] sortedFiles;
        if (startDirectory.isDirectory()) {
            File[] files = startDirectory.listFiles();
            if (files != null) {
                sortedFiles = new File[files.length];
                int fillFile = 0;
                for (File file : files) {
                    if (file.isDirectory()) {
                        sortedFiles[fillFile] = file;
                        fillFile += 1;
                    }
                }
                File[] sortBySize = new File[files.length];
                System.arraycopy(files, 0, sortBySize, 0, files.length);
                for (int i = 0; i < sortBySize.length; i++) {
                    for (int j = 0; j < sortBySize.length; j++) {
                        if (sortBySize[i].length() > sortBySize[j].length()) {
                            File k = sortBySize[i];
                            sortBySize[i] = sortBySize[j];
                            sortBySize[j] = k;
                        }
                    }
                }
                System.arraycopy(sortBySize, 0, sortedFiles, fillFile, sortBySize.length - fillFile);
            } else {
                System.out.println("Es ist kein Verzeichniss! ");
                sortedFiles = new File[0];
            }
        } else {
            System.out.println("Es ist kein Verzeichniss! ");
            sortedFiles = new File[0];
        }
        System.out.println(startDirectory);
        for (File sortedFile : sortedFiles) {
            printFileList("  ╚══> ", sortedFile);
        }
        System.out.println();
    }

    public static int getDirectoryAmountAll(File directory) {
        int ammDirectories = 0;
        if (directory.isDirectory()) {
            File[] children = directory.listFiles();
            if (children != null) {
                for (File f : children) {
                    ammDirectories += getDirectoryAmountAll(f);
                }
            }
        } else ammDirectories = 1;
        return ammDirectories;
    }

    public static long getDirectorySizeAll(File directory) {
        long sizeDirectories = 0;
        if (directory.isDirectory()) {
            File[] children = directory.listFiles();
            if (children != null) {
                for (File f : children) {
                    sizeDirectories += getDirectorySizeAll(f);
                }
            }
        } else sizeDirectories += directory.length();
        return sizeDirectories;
    }

    public static String[] getDataAmountAndSizeSingleDir(File startDirectory) {
        String[] amountAndSize = new String[2];
        int directories = 0;
        int fileSizes = 0;
        File[] files;
        if (startDirectory.isDirectory()) {
            files = startDirectory.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.length() > 0) {
                        directories += 1;
                    }
                }
            }
        } else files = new File[0];
        for (int i = 0; i < files.length; i++) {
            fileSizes += files[i].length();
        }
        amountAndSize[0] = String.valueOf(directories);
        amountAndSize[1] = String.valueOf(fileSizes);
        return amountAndSize;
    }

    public static File pathToBiggestFile(File directory) {
        if (directory.isFile()) return directory;

        File path = null;
        if (directory.isDirectory()) {
            File[] files = directory.listFiles();
            if (files != null) {
                for (File file : files) {
                    File f = pathToBiggestFile(file);
                    if ((path == null) ||
                            ((f != null) && (f.length() > path.length()))) {
                        path = f;
                    }
                }
            }
        }
        return path;
    }

    public static void printSearchForFile(String prefix, File searchDirectory, String searchFor) {
        if (searchDirectory.isFile() && searchDirectory.getName().contains(searchFor))
            System.out.println(prefix + searchDirectory);
        if (searchDirectory.isDirectory()) {
            File[] moreFiles = searchDirectory.listFiles();
            if (moreFiles != null) {
                for (File files : moreFiles) {
                    printSearchForFile(prefix, files, searchFor);
                }
            }
        }
    }

    public static void writeATxtFile(File directory) {
        try {
            directory.getParentFile().mkdirs();
            PrintStream ps = new PrintStream(new FileOutputStream(directory));
            boolean notFirstLine = true;
            String newInput = "Initialtext";
            System.out.println("Wir schreiben jetzt eine Txt Datei. Schreibe nach Herzenslust und beende den Roman mit einem Enter ohne Eingabe.");
            while (newInput.length() > 0) {
                newInput = MWerkzeuge.readUserInputString("");
                if (notFirstLine) {
                    notFirstLine = false;
                }
                else {
                    ps.append("\n");
                }
                ps.append(newInput);
                ps.flush();
            }
            ps.close();
        } catch (IOException ioe) {
        }
    }

    public static void writeAChartFile(File directory, String title1, String[] strArr1, String title2, String[] strArr2, int[] intValues1, String title3, String[] strArr3, float[] floatValues1) {
        try {
            directory.getParentFile().mkdirs();
            PrintStream ps = new PrintStream(new FileOutputStream(directory));
            int longestArr1 = title1.length() + 1;
            int longestArr2 = title2.length() + 1;
            int longestArr3 = title3.length() + 1;
            for (int g = 0; g < strArr2.length - 1; g++) {
                if (longestArr1 < strArr1[g].length()) longestArr1 = strArr1[g].length();
                if (longestArr2 < strArr2[g].length()) longestArr2 = strArr2[g].length();
                if (longestArr3 < strArr3[g].length()) longestArr3 = strArr3[g].length();
            }
            String formatText = String.format(" %%%ds | ", longestArr1) + String.format("%%%ds | ", longestArr2) + "%5s | " + String.format("%%%ds | ", longestArr3) + "%21s%n";
            ps.printf((formatText), title1, title2, "Alter", title3, "Distanz zu Hauptstadt");
            for (int i = 0; i < strArr1.length; i++) {
                ps.printf((formatText), strArr1[i], strArr2[i], intValues1[i], strArr3[i], String.format("%.1f km ", floatValues1[i]));
            }
            ps.close();
        } catch (IOException ioe) {
        }
    }

    public static void fileReader(File directory) {
        try {
            if (!directory.exists()) {
                System.out.println("No readable file found");
            }
            BufferedReader buffRead = new BufferedReader(new FileReader(directory));
            while (buffRead.ready()) {
                String line = buffRead.readLine();
                System.out.println(line);
            }
            buffRead.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        System.out.println();
    }

    public static int countChars(File directory, char[] countWhichChars) {
        int charsFound = 0;
        try {
            Scanner sc = new Scanner(directory);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                char[] chars = line.toCharArray();
                for (char countWhichChar : countWhichChars) {
                    for (char aChar : chars) {
                        if (countWhichChar == aChar) ++charsFound;
                    }
                }
            }
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
        return charsFound;
    }

    public static int countWords(File directory, String searchWord, boolean countAll) {
        int wordsFound = 0;
        try {
            Scanner sc = new Scanner(directory);
            StringBuilder fullText = new StringBuilder(" ");
            while (sc.hasNext()) {
                fullText.append(sc.nextLine());
            }
            fullText = new StringBuilder(fullText.toString().trim().replaceAll("\\P{IsLatin}", " ").replaceAll("\\s+", " "));
            String[] pureLine = fullText.toString().split(" ");
            if (countAll) {
                wordsFound = pureLine.length;
            } else {
                for (String s : pureLine) {
                    if (Objects.equals(s, searchWord)) wordsFound++;
                }
            }
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
        return wordsFound;
    }

    public static String replaceWord(File directory, String oldWord, String newWord) {
        String newText = "";
        try {
            Scanner sc = new Scanner(directory);
            StringBuilder oldText = new StringBuilder();
            while (sc.hasNext()) {
                oldText.append(sc.nextLine()).append("\n");
            }
            newText = oldText.toString().replaceAll(oldWord, newWord);
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
        return newText;
    }

}


