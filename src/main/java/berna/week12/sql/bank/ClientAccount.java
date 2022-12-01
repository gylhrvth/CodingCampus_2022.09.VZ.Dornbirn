package berna.week12.sql.bank;

public class ClientAccount {
    private int clientIDFk;
    private int accountNrFk;

    enum status {owner, authorized}
    public status statusOfClient;


    public ClientAccount(int clientIDFk , int accountNrFk, status statusOfClient) {
        this.clientIDFk = clientIDFk;
        this.accountNrFk = accountNrFk;
        this.statusOfClient = statusOfClient;

    }

    public int getClientIDFk() {
        return clientIDFk;
    }

    public void setClientIDFk(int clientIDFk) {
        this.clientIDFk = clientIDFk;
    }

    public int getAccountNrFk() {
        return accountNrFk;
    }

    public void setAccountNrFk(int accountNrFk) {
        this.accountNrFk = accountNrFk;
    }

    public status getStatusOfClient() {
        return statusOfClient;
    }

    public void setStatusOfClient(status statusOfClient) {
        this.statusOfClient = statusOfClient;
    }
}
