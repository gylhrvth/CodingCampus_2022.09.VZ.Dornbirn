package berna.week12.sql.bank;


public class Client {

    public String clientName;
    public int clientID;
    public String clientBirthday;


    public Client(String clientName, String clientBirthday) {
        this.clientName = clientName;
        this.clientBirthday = clientBirthday;
        ++clientID;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public int getClientID() {
        return clientID;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }

    public String getClientBirthday() {
        return clientBirthday;
    }

    public void setClientBirthday(String clientBirthday) {
        this.clientBirthday = clientBirthday;
    }
}
