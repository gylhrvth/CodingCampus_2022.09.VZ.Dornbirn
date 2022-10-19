package franz.week05;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class LoggingExample {
    public static int ERROR = 1;
    public static int WARNING = 2;
    public static int INFO = 3;

    public static void log(int severity, String message) {
        File logFile = new File("assets\\tmp\\log.txt");

        if (logFile.exists() && logFile.length() > 1000000) {
            File oldFile = new File(logFile.getAbsolutePath() + "old");
            oldFile.delete();
            logFile.renameTo(oldFile);
        }

        try {
            PrintStream ps = new PrintStream(new FileOutputStream(logFile, true));
            SimpleDateFormat sdf = new SimpleDateFormat("hh:mm dd.MM.yyyy");

            String severityText = "";
            if (severity == ERROR) severityText = "ERROR:";
            else if (severity == WARNING) severityText = "WARNING:";
            else if (severity == INFO) severityText = "INFO:";
            else severityText = "Unknown(" + severity + ")";

            ps.printf("%s %s: %s\n",
                    sdf.format(new Date()),
                    severityText,
                    message);

            ps.close();
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }

    }

    public static void main(String[] args) {
        menue();
        newCalculation();


        }

    public static void menue() {
        System.out.println("Wilkommen beim Taschenrechner!!");
        System.out.println("Geben Sie eine Ganzzahl ein");
        float n1 = readN();
        System.out.println("Geben Sie die zweite Ganzzahl ein");
        float n2 = readN();
        System.out.println("Wählen Sie einen Operator.");
        System.out.println("+\n-\n*\n/\n^\n");
        operator(n1, n2);
    }

    public static float readN() {




        Scanner sc = new Scanner(System.in);
        while (true) {
            if (sc.hasNextInt()) {
                int value = sc.nextInt();
                log(INFO, "Zahl wurde erfolgreich gelesen: " + value);
                return value;
            } else {
                System.out.println("Geben Sie eine Ganzzahl ein");
                log(WARNING, "Es ist kein Zahl, die wir bekommen haben");
                sc.next();
            }
        }
    }

    public static void operator(float n1, float n2) {
        Scanner scanner = new Scanner(System.in);
        String op = "";

        while (op.equals("")) {
            op = scanner.nextLine();

            if (op.equals("+")) {
                System.out.println("Ergebnis: " + (n1 + n2));
            } else if (op.equals("-")) {
                System.out.println("Ergebnis: " + (n1 - n2));
            } else if (op.equals("*")) {
                System.out.println("Ergebnis: " + (n1 * n2));
            } else if (op.equals("/")) {
                System.out.println("Ergebnis: " + (n1 / n2));
            } else if (op.equals("^")) {
                System.out.println("Ergebnis: " + Math.pow(n1, n2));
            } else {
                log(ERROR, "Ungültiger Operation: " + op);
                op = "";
                System.out.println("Gebe einen Operator ein");
            }
        }
    }

    public static void newCalculation() {

        System.out.println("Wollen Sie eine neue Rechnung ausführen? (j/n)");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (s.equals("j")) {
            menue();
        } else {
            System.out.println("Tschau");
        }
    }
}

