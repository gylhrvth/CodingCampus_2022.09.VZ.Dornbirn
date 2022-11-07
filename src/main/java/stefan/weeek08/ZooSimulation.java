package stefan.weeek08;

import java.util.ArrayList;
import java.util.List;

public class ZooSimulation {
    public static void main(String[] args) {

        Zoo myZoo = new Zoo("Wildpark", 1963);
        Gehege alpenwiese = new Gehege("Alpenwiese");
        Gehege ried = new Gehege("Ried");
        Gehege disneyland = new Gehege("disneyland");

        Tier tier1 = new Tier("Milka", "Kuh");
        Tier tier2 = new Tier("Roadrunner", "Strauß");
        Tier tier3 = new Tier("Micky", "Maus");

        Futter f1 = new Futter("Grass", 20, 120);
        Futter f2 = new Futter("Maus", 5, 6);
        Futter f3 = new Futter("Donald Duck", 12, 5);

        disneyland.addTier(tier3);
        alpenwiese.addTier(tier1);
        ried.addTier(tier2);

        myZoo.addGehege(alpenwiese);
        myZoo.addGehege(ried);
        myZoo.addGehege(disneyland);

        System.out.println(myZoo.printGhegelist());
        System.out.println("Futter\n");
        System.out.print(f1.getFuttername() + "\t" + f1.getEinheit() + "kg\t" + f1.getPreis() + "Euro");

        List<Tier> tierliest = new ArrayList<>();
        tier1.setFutter(f1, 20);
        tier2.setFutter(f2, 4);
        tierliest.add(tier1);
        tierliest.add(tier2);


        for (Tier t : tierliest) {

        }

    }


}
