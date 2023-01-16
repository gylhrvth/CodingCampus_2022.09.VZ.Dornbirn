package stefan.Bank;


import java.io.*;
import java.net.Socket;
import java.util.ArrayList;

public class BankKundenHandler implements Runnable {

    public static ArrayList<BankKundenHandler> bankKundenHandlers = new ArrayList<>();
    public Socket socket;
    private BufferedReader bufferedReader;
    private BufferedWriter bufferedWriter;
    private String kundenName;
    private int id;

    public BankKundenHandler(Socket socket) {
        try {
            this.socket = socket;
            this.bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            this.bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            this.kundenName = bufferedReader.readLine();
            this.id = bufferedReader.read();
            bankKundenHandlers.add(this);
            broadcastMoney("Bankserver:" + kundenName + "ist bereit zum Geld tausch");
        } catch (IOException e) {
            closeEverything(socket, bufferedReader, bufferedWriter);
        }
    }

    @Override
    public void run() {
        String message;
        while (socket.isConnected()) {
            try {
                message = bufferedReader.readLine();
                broadcastMoney(message);
            } catch (IOException e) {
                closeEverything(socket, bufferedReader, bufferedWriter);
                break;
            }
        }
    }

    public void broadcastMoney(String message) {
        for (BankKundenHandler bankundenHandler : bankKundenHandlers) {
            try {
                if (!bankundenHandler.kundenName.equals(kundenName)) {
                    bankundenHandler.bufferedWriter.write(message);
                    bankundenHandler.bufferedWriter.newLine();
                    bankundenHandler.bufferedWriter.flush();

                }

            } catch (IOException e) {
                closeEverything(socket, bufferedReader, bufferedWriter);
            }
        }
    }

    public void removeBankClientHandler() {
        bankKundenHandlers.remove(this);
        broadcastMoney("Der kunde:" + kundenName + " hatt den Zahlungen beendet");
    }

    public void closeEverything(Socket socket, BufferedReader bufferedReader, BufferedWriter bufferedWriter) {
        removeBankClientHandler();
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
}



