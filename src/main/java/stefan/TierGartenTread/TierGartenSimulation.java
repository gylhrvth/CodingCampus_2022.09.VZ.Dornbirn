package stefan.TierGartenTread;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TierGartenSimulation {
    public static Object gateKeeper = new Object();

    public static void main(String[] args) {


        TierGarten tierGarten = new TierGarten("Schönbrunn", 1752);
        List<Arbeiter> arbeiterList = new ArrayList<>();
        Arbeiter Peter = new Arbeiter("Peter", 45);
        Arbeiter Alex = new Arbeiter("Alex", 25);
        Arbeiter Thomas = new Arbeiter("Thomas", 26);
        Arbeiter Kevin = new Arbeiter("Kevin", 20);

        arbeiterList.add(Peter);
        arbeiterList.add(Alex);
        arbeiterList.add(Thomas);
        arbeiterList.add(Kevin);


        TierGehege Alpenwiese = new TierGehege("Alpenwiese");
        TierGehege Terraium = new TierGehege("Terraium");
        TierGehege Aquarium = new TierGehege("Aquarium");

        Tier tier1 = new Tier("Paula", 10, "Kuh");
        Tier tier2 = new Tier("Sandra", 3, "Schlange");
        Tier tier3 = new Tier("Nemo", 4, "Fisch");
        Tier tier4 = new Tier("Doris", 4, "Fisch");

        Peter.addGehege(Alpenwiese);
        tierGarten.addTierGehege(Alpenwiese);
        tierGarten.addTierGehege(Terraium);
        tierGarten.addTierGehege(Aquarium);

        Alpenwiese.addTier(tier1);
        Terraium.addTier(tier2);
        Aquarium.addTier(tier3);
        Aquarium.addTier(tier4);

        List<Thread> threadslist = new ArrayList<>();
        threadslist.add(doWork("streichelt", Peter, tier1));
        threadslist.add(doWork("futtert", Alex, tier2));
        threadslist.add(doWork("beobachtet", Peter, tier1));
        threadslist.add(doWork("spielt",Thomas, tier3));
        threadslist.add(doWork("betreut",Kevin , tier1));
        threadslist.add(doWork("spielt mit", Alex, tier1));



        for (Thread t : threadslist) {
            t.start();
        }
        for (Thread t : threadslist) {
            try {
                t.join();


            } catch (InterruptedException e) {
                System.out.println();
            }
        }
    }

    private static Thread doWork(String aufgaben, Arbeiter arbeiter, Tier tier) {
        Thread t = new Thread(() -> {
            Random random = new Random();


            for (int i = 1; i <= 5; i++) {
                synchronized (gateKeeper) {
                    System.out.println(arbeiter.getName() + ": " + aufgaben + " " + tier.getGattung() + " " + tier.getTiername() + " [" + i + "]");

                    System.out.println();
                    System.out.println("Day: " + i);
                    System.out.println("----------------");
                }
                try {

                    Thread.sleep(random.nextInt(100) + 5000);

                } catch (InterruptedException e) {
                    //noop
                }
            }
        });
        return t;

    }


}



