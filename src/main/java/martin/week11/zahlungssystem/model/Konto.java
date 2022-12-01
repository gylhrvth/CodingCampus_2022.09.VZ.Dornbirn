package martin.week11.zahlungssystem.model;

public class Konto {

    /*
    private String exFTable = """
            CREATE TABLE `konto` (
            `iban` int NOT NULL AUTO_INCREMENT,
            `stand` int NOT NULL DEFAULT '0',
            PRIMARY KEY (`iban`)
            )""";
    */

    private int iban;
    private int stand;

    public Konto(int stand) {
        this.stand = stand;
    }

    public Konto(int stand, boolean semiRand) {
              if (semiRand) {
            this.stand = (int) Math.sqrt(stand);
        } else {
            this.stand = stand;
        }
    }

    public int getIban() {
        return iban;
    }

    public void setIban(int iban){
        this.iban = iban;
    }

    public int getStand() {
        return stand;
    }

    public void setStand(int stand) {
        this.stand = stand;
    }
}



