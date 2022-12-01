package berna.week12.sql.bank;


public class Client {

    public String clientName;

    public String clientBirthday;
    public int ID;


    public Client(String clientName, String clientBirthday) {
        this.clientName = clientName;
        this.clientBirthday = clientBirthday;
    }

    public Client(String clientName, String clientBirthday, int ID) {
        this.clientName = clientName;
        this.clientBirthday = clientBirthday;
        this.ID = ID;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientBirthday() {
        return clientBirthday;
    }

    public void setClientBirthday(String clientBirthday) {
        this.clientBirthday = clientBirthday;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }
}
