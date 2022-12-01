package stefan.week12.Bank;

public class kundeKontonummerVerbindung {
private int kundenIdFk;
private int kontonummerFk;

    public kundeKontonummerVerbindung(int kundenIdFk, int kontonummerFk) {
        this.kundenIdFk = kundenIdFk;
        this.kontonummerFk = kontonummerFk;
    }

    public int getKundenIdFk() {
        return kundenIdFk;
    }

    public void setKundenIdFk(int kundenIdFk) {
        this.kundenIdFk = kundenIdFk;
    }

    public int getKontonummerFk() {
        return kontonummerFk;
    }

    public void setKontonummerFk(int kontonummerFk) {
        this.kontonummerFk = kontonummerFk;

    }
}
