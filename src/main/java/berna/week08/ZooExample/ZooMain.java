package berna.week08.ZooExample;

public class ZooMain {

    public static void main(String[] args) {
        System.out.println();
        System.out.println("*** WELCOME TO THE WORLD OF ZOOS ***");
        System.out.println();

        Zoo dornbirn = new Zoo("Tierpark Dornbirn", 1999);

        //create enclosures and define tasks to do in enclosure
        Enclosure enclo1 = new Enclosure("ALpenwiese","cleaning", "feeding","caressing");
        Enclosure enclo2 = new Enclosure("Ried","cleaning", "feeding","caressing","mowing" );
        Enclosure enclo3 = new Enclosure("Terrarium (warm)", "cleaning", "feeding","checkTemperature");
        Enclosure enclo4 = new Enclosure("Berghang","cleaning", "feeding","caressing");

        //add enclosures with animals to the zoo
        dornbirn.getEnclosures(enclo1,enclo2,enclo3,enclo4);


        //create animals and put them into enclosures
        Animal a1 = new Animal("Rijska", "Kuh",100,55);
        Animal a5 = new Animal("Herbert","Kuh", 100,70);
        Animal a6 = new Animal("Norbert","Kuh", 100,50);
        Animal a7 = new Animal("Bert","Kuh", 100,40);
        Animal a8 = new Animal("Bertha","Kuh", 100,22);
        Animal a9 = new Animal("Moritz", "Murmeltier", 200,1);



        Animal a2 = new Animal("Hugo", "Storch",4,1);
        Animal a3 = new Animal("Garmond", "Storch",4,1);
        Animal a4 = new Animal("Idaxis", "Storch",8,2);

        enclo1.getAnimalsIntoEnclosure(a1,a5,a6,a7,a8);
        enclo2.getAnimalsIntoEnclosure(a2,a3,a4);
        enclo4.getAnimalsIntoEnclosure(a9);


        // hire zoo keepers with skills
        ZooKeeper k1 = new ZooKeeper("dubbel 1","Storch","cleaning","feeding","caressing");
        ZooKeeper k2 = new ZooKeeper("dubbel 2","Kuh","cleaning","feeding","caressing" );
        ZooKeeper k3 = new ZooKeeper("dubbel 3", "Ameise", "caressing", "nursing");

        //add keepers to zoo
        dornbirn.getAllKeepers(k1,k2,k3);

        System.out.println(dornbirn);

        //simulate one week in the zoo...
        System.out.println("==== A WEEK IN THE ZOO ====");
        System.out.println();

        for (int i = 1; i <= 7; i++) {
            System.out.println("Day " + i);
            dornbirn.simulateOneDay();
            System.out.println("\n");
        }
    }
}
