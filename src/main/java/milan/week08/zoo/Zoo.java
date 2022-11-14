package milan.week08.zoo;

import java.util.Vector;

public class Zoo {
    private String name;
    private int yearFounding;
    private Gehege gehege;
    private Vector<Gehege> gehegeListe;
    private Vector<Pfleger> mitarbeiterListe;
    private Vector<TierArzt> aerzteListe;
    private Vector<Futter> futterListe;


    public Zoo(String name) {
        this.name = name;
        yearFounding = 0;
        gehegeListe = new Vector<>();
        mitarbeiterListe = new Vector<>();
        aerzteListe = new Vector<>();
        futterListe = new Vector<>();
    }

    public void zooSimulation() {
        for (Pfleger mitarbeiter : mitarbeiterListe) {
            mitarbeiter.getToTheChoppa();
        }
        System.out.println();
        for (Gehege gehege : gehegeListe) {
            gehege.rumbleInTheJungle();
            System.out.println();
            gehege.printTierGesundheitStatistic();
        }
        for (Gehege x : gehegeListe) {
            x.removeDeadAnimals();
            x.setStatus(false);
        }
        healAnimals();
        System.out.println();
    }


    public void healAnimals() {
        for (TierArzt x : aerzteListe) {
            System.out.print(x.getName() + " versorgt " + findWeakestAnimal().getName() + " ");
            x.healAnimal(findWeakestAnimal());
        }
    }

    public Tier findWeakestAnimal() {
        Tier tmp = null;
        for (Gehege x : gehegeListe) {
            if (tmp == null || x.findWeakestAnimal().getRelativeGesundheit() < tmp.getRelativeGesundheit()) {
                tmp = x.findWeakestAnimal();
            }
        }
        return tmp;
    }

        public void printFoodStatistic() {
            for (Futter x : futterListe) {
                x.printFoodStatistic();
            }
        }

//    public String printFoodStatistic() {
//        double sumTrockenfutter = 0;
//        double sumNassfutter = 0;
//        double sumGras = 0;
//        double sumInsect = 0;
//        for (Gehege x : gehegeListe) {
//            for (Tier y : x.getTiereListe()) {
//                switch (y.getNahrung().getName()) {
//                    case "Trockenfutter" -> sumTrockenfutter = sumTrockenfutter + y.getMenge();
//                    case "Nassfutter" -> sumNassfutter = sumNassfutter + y.getMenge();
//                    case "Gras" -> sumGras = sumGras + y.getMenge();
//                    case "Insekt" -> sumInsect = sumInsect + y.getMenge();
//                }
//            }
//        }
//        double priceTrockenfutter = 0;
//        double priceNassfutter = 0;
//        double priceGras = 0;
//        double priceInsect = 0;
//        for (Gehege x : gehegeListe) {
//            for (Tier y : x.getTiereListe()) {
//                switch (y.getNahrung().getName()) {
//                    case "Trockenfutter" -> priceTrockenfutter = y.getNahrung().getEinheitsPreis();
//                    case "Nassfutter" -> priceNassfutter = y.getNahrung().getEinheitsPreis();
//                    case "Gras" -> priceGras = y.getNahrung().getEinheitsPreis();
//                    case "Insekt" -> priceInsect = y.getNahrung().getEinheitsPreis();
//                }
//            }
//        }
//        return "Tägliche Kosten für Trockenfutter: " + String.format("%.2f", sumTrockenfutter * priceTrockenfutter) + "€, bei " + sumTrockenfutter + " kg, täglichem Bedarf.\n"
//                + "Tägliche Kosten für Nassfutter: " + String.format("%.2f", sumNassfutter * priceNassfutter) + "€, bei " + sumNassfutter + " kg, täglichem Bedarf.\n"
//                + "Tägliche Kosten für Gras: " + String.format("%.2f", sumGras * priceGras) + "€, bei " + sumGras + " kg, täglichem Bedard.\n"
//                + "Tägliche Kosten für Insekten: " + String.format("%.2f", sumInsect * priceInsect) + "€, bei " + sumInsect + " kg, täglichem Bedarf.\n";
//        //return text.toString();
//    }

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

    public void addFutterToList(Futter futter) {
        futterListe.add(futter);
    }

    public void addGehegeToList(Gehege gehege) {
        gehegeListe.add(gehege);
    }

    public void addTierArztToList(TierArzt arzt) {
        aerzteListe.add(arzt);
    }

    public void addPflegerToList(Pfleger pfleger) {
        mitarbeiterListe.add(pfleger);
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

    public Vector<Gehege> getGehegeListe() {
        return gehegeListe;
    }

    public Vector<Pfleger> getMitarbeiterListe() {
        return mitarbeiterListe;
    }
}
