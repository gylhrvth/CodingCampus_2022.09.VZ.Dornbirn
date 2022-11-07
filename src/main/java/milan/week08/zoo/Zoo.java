package milan.week08.zoo;

import java.util.Vector;

public class Zoo {
    private String name;
    private int yearFounding;
    private Gehege gehege;
    private Vector<Gehege> gehegeListe;


    public Zoo(String name) {
        this.name = name;
        yearFounding = 0;
        gehegeListe = new Vector<>();
    }

    public String printFoodStatistic() {
//        StringBuilder text = new StringBuilder();
//        double sum = 0;
//        for (Gehege x : gehegeListe) {
//            text.append(x.getName()).append(":\n");
//            for (Tier y : x.getTiereListe()) {
//                sum = sum + y.getMenge();
//            }
//            text.append(sum).append("\n");
//        }

        double sumTrockenfutter = 0;
        double sumNassfutter = 0;
        double sumGras = 0;
        double sumInsect = 0;
        for (Gehege x : gehegeListe) {
            for (Tier y : x.getTiereListe()) {
                switch (y.getNahrung().getName()) {
                    case "Trockenfutter" -> sumTrockenfutter = sumTrockenfutter + y.getMenge();
                    case "Nassfutter" -> sumNassfutter = sumNassfutter + y.getMenge();
                    case "Gras" -> sumGras = sumGras + y.getMenge();
                    case "Insekt"  -> sumInsect = sumInsect + y.getMenge();
                }
            }
        }
        double priceTrockenfutter = 0;
        double priceNassfutter = 0;
        double priceGras = 0;
        double priceInsect = 0;
        for (Gehege x : gehegeListe) {
            for (Tier y : x.getTiereListe()) {
                switch (y.getNahrung().getName()) {
                    case "Trockenfutter" -> priceTrockenfutter = y.getNahrung().getEinheitsPreis();
                    case "Nassfutter" -> priceNassfutter = y.getNahrung().getEinheitsPreis();
                    case "Gras" -> priceGras = y.getNahrung().getEinheitsPreis();
                    case "Insekt" -> priceInsect = y.getNahrung().getEinheitsPreis();
                }
            }
        }
        return "Tägliche Kosten für Trockenfutter: " + String.format("%.2f", sumTrockenfutter * priceTrockenfutter) + "€, bei " + sumTrockenfutter + " kg, täglichem Bedarf.\n"
                + "Tägliche Kosten für Nassfutter: " + String.format("%.2f", sumNassfutter * priceNassfutter) + "€, bei " + sumNassfutter + " kg, täglichem Bedarf.\n"
                + "Tägliche Kosten für Gras: " + String.format("%.2f", sumGras * priceGras) + "€, bei " + sumGras + " kg, täglichem Bedard.\n"
                + "Tägliche Kosten für Insekten: " + String.format("%.2f", sumInsect * priceInsect) + "€, bei " + sumInsect + " kg, täglichem Bedarf.\n";
        //return text.toString();
    }

    public String printStructureList() {
        StringBuilder text = new StringBuilder("|--- Zoo: " + getName() + ", gegründet " + getYearFounding() + "\n");
        if (gehegeListe.size() > 0) {
            for (Gehege x : gehegeListe) {
                text.append(x.printStructure());
            }
        } else {
            text.append("|   |--- Kein Gehege vorhanden!!!").append("\n");
        }
        return text.toString();
    }

    public void addGehegeToList(Gehege gehege) {
        gehegeListe.add(gehege);
    }

    @Override
    public String toString() {
        return getName() + ", gegründet " + getYearFounding();
    }

    public void setYearFounding(int yearFounding) {
        this.yearFounding = yearFounding;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearFounding() {
        return yearFounding;
    }

    public String getName() {
        return name;
    }
}
