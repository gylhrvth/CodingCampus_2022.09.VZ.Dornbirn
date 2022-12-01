package martin.week11.zahlungssystem.model;

public class KundeKonto {

    /*
    private String exFTable = """
            CREATE TABLE `kundekonto` (
            `kundenid_fk` int NOT NULL,
            `iban_fk` int NOT NULL,
            `rolle` varchar(25) DEFAULT NULL,
            PRIMARY KEY (`kundenid_fk`,`iban_fk`),
            KEY `fk_konto_idx` (`iban_fk`),
            CONSTRAINT `fk_konto` FOREIGN KEY (`iban_fk`) REFERENCES `konto` (`iban`),
            CONSTRAINT `fk_kunde` FOREIGN KEY (`kundenid_fk`) REFERENCES `kunde` (`kundenid`)
            )""";
    */

    private int kundenid_fk;
    private int iban_fk;
    private String rolle;
    public KundeKonto(int id, int iban){
        kundenid_fk=id;
        iban_fk=iban;
    }

    public KundeKonto(int id, int iban, String role){
        kundenid_fk=id;
        iban_fk=iban;
        rolle=role;
    }

    public int getKundenid_fk() {
        return kundenid_fk;
    }

    public void setKundenid_fk(int kundenid_fk) {
        this.kundenid_fk = kundenid_fk;
    }

    public int getIban_fk() {
        return iban_fk;
    }

    public void setIban_fk(int iban_fk) {
        this.iban_fk = iban_fk;
    }

    public String getRolle() {
        return rolle;
    }

    public void setRolle(String rolle) {
        this.rolle = rolle;
    }
}
