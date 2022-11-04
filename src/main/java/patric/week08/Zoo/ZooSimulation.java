package patric.week08.Zoo;

public class ZooSimulation {

    public static void main(String[] args) {

       System.out.println();

        Zoo myZoo = new Zoo("Tiergarten Dornbirn",2022);

        Gehege myGehege1 = new Gehege("Alpenwiese");
        Gehege myGehege2 = new Gehege("Ried");
        Gehege myGehege3 = new Gehege("Terrarium (warm)");

        myZoo.putGehegeToZoo(myGehege1);
        myZoo.putGehegeToZoo(myGehege2);
        myZoo.putGehegeToZoo(myGehege3);
        myZoo.putGehegeToZoo(new Gehege("Wasserwelt"));

        myZoo.removeGehegeFromZoo(myGehege2);
        myZoo.putGehegeToZoo(new Gehege("Ried"));

        myZoo.printListWithGehege();

    }
}