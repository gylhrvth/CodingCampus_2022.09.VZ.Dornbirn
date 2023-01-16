package stefan.Bank;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Kunde {
    private String name;
    private int id;

    private String kontostand;
    private Socket socket;
    private BufferedReader bufferedReader;
    private BufferedWriter bufferedWriter;

    public Kunde(String name, int id, Socket socket, String kontostand) {
        try {
            this.socket = socket;
            this.bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            this.bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            this.name = name;
            this.id = id;
            this.kontostand = kontostand;

        } catch (IOException e) {
            closeEverything(socket,bufferedReader,bufferedWriter);
        }
    }



    public void sendMoney(String kontostand) {
        try {

            bufferedWriter.write(name);
            bufferedWriter.newLine();
            bufferedWriter.flush();
            Scanner scanner = new Scanner(System.in);
            while (socket.isConnected()) {
                String betragToSend = scanner.nextLine();
                bufferedWriter.write(name + ":"  + betragToSend);
                System.out.println("Der Neue Kontostand "+(kontostand+betragToSend));
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
        } catch (IOException e) {
            closeEverything(socket,bufferedReader,bufferedWriter);
        }

    }

    public void listenMoney() {
        new Thread(() -> {
            String geldbetrag;
            while (socket.isConnected()) {
                try {
                    geldbetrag = bufferedReader.readLine();
                    System.out.println(geldbetrag);

                } catch (IOException e) {
                closeEverything(socket,bufferedReader,bufferedWriter);
                }
            }
        }).start();
    }
    public void closeEverything(Socket socket, BufferedReader bufferedReader, BufferedWriter bufferedWriter) {
        try {


            if (bufferedReader != null) {
                bufferedReader.close();
            }
            if (bufferedWriter != null) {
                bufferedWriter.close();
            }
            if (socket != null) {
                socket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Legen sie ein neues Konto an");
        System.out.println("Geben sie ein Name ein");
        String name = scanner.nextLine();
        System.out.println("Geben sie ihre Id Nummer ein");
        int id = scanner.nextInt();
        System.out.println("Neuer Kunde würde angelegt:"+name+" " +id );
        System.out.println("Wieviel Geld möchten sie einzahlen");
        String kontostand = scanner.nextLine();

        System.out.println("der neue Kontostand: " + kontostand);
        System.out.println("Wie viel möchten sie überweisen");

        Socket socket = new Socket("localhost", 456);
        Kunde kunde = new Kunde(name, id, socket,kontostand);
        kunde.listenMoney();
        kunde.sendMoney(kontostand);


    }

}