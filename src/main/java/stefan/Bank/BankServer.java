package stefan.Bank;



import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class BankServer {
    private final ServerSocket serverSocket;

    public BankServer(ServerSocket serverSocket) {
        this.serverSocket = serverSocket;
    }

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(456);
        BankServer server = new BankServer(serverSocket);
        server.startBankserver();

    }

    public void startBankserver() {
        try {
            while (!serverSocket.isClosed()) {
                Socket socket = serverSocket.accept();
                System.out.println("Ein neuer Kunde hatt sich eingelogt");
                BankKundenHandler bankKundenHandler = new BankKundenHandler(socket);

                Thread thread = new Thread(bankKundenHandler);
                thread.start();
            }
        } catch (IOException e) {
            closeServerChatSocket();

        }
    }

    public void closeServerChatSocket() {
        try {
            if (serverSocket != null) {
                serverSocket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Good bye");

        }
    }
}

