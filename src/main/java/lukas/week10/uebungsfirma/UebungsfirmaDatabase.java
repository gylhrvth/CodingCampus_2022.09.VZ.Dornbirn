package lukas.week10.uebungsfirma;

import lukas.week10.Database;

public class UebungsfirmaDatabase extends Database {
    UebungsfirmaDatabase() {
        super("jdbc:mysql://localhost:3306/uebungsfirma?user=root&password=root");
    }
}
