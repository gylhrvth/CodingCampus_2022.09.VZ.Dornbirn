package fatima.week08.zoo;

public class ZooSimulation {
    public static void main(String[] args) {
        Zoo z1 = new Zoo("Tiergarten Dornbirn", 2022);

        Enclosure e1 = new Enclosure("Alpenwiese");
        Enclosure e2 = new Enclosure("Ried");
        Enclosure e3 = new Enclosure("Terrarium (warm)");

        z1.addEnclosure(e1, e2, e3);

        Animals a1 = new Animals("Rijska", "Kuh");
        Animals a2 = new Animals("Garmond", "Storch");
        Animals a3 = new Animals("Hugo", "Storch");
        Animals a4 = new Animals("Idaxis", "Storch");

        e1.addAnimals(a1);
        e2.addAnimals(a2, a3, a4);

        Zookeeper zK1 = new Zookeeper("Max");
        Zookeeper zK2 = new Zookeeper("Anna");
        Zookeeper zK3 = new Zookeeper("Tom");

        ToDosInEnclosure feeding = new ToDosInEnclosure("is feeding", zK1, e1);
        ToDosInEnclosure cleaning = new ToDosInEnclosure("is cleaning", zK3, e1);
        ToDosInEnclosure medicalControl = new ToDosInEnclosure("is doing medical control", zK2, e1);
        ToDosInEnclosure checkAttendance = new ToDosInEnclosure("is checking the attendance", zK1, e2);


        e1.addToDosInEnclosure(feeding, cleaning, medicalControl, checkAttendance);
        e2.addToDosInEnclosure(feeding, cleaning, medicalControl, checkAttendance);

        z1.printStructure();
        System.out.println();

        z1.simulateOneDay();

    }
}
