package lukas.week10.uebungsfirma;

import lukas.week10.Database;

public class UebungsfirmaTestDatabase extends Database {
    UebungsfirmaTestDatabase() {
        super("jdbc:mysql://localhost:3306/uebungsfirmaTest?user=root&password=root");
    }
}
