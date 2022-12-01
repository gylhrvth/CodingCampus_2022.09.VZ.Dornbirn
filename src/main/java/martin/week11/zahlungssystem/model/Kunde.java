package martin.week11.zahlungssystem.model;

public class Kunde {

    /*
    private String exFTable = """
            CREATE TABLE `kunde` (
            `kundenid` int NOT NULL AUTO_INCREMENT,
            `name` varchar(45) DEFAULT NULL,
            PRIMARY KEY (`kundenid`)
            )""";
    */

    private int kunden_id;
    private String name;

    public Kunde(int id, String name) {
        kunden_id = id;
        this.name = name;
    }

    public int getKunden_id() {
        return kunden_id;
    }

    public void setKunden_id(int kunden_id) {
        this.kunden_id = kunden_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
