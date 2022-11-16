package michel.week09.AufgabeCarSimulationExtended;

import java.util.Random;

public class GasStation {
    private Random random = new Random();
    private String name;

    public GasStation(String name) {
        this.name = name;
    }
    public void fillTank(Tank tank) {
        int fill = tank.getActualTankCapacity() + random.nextInt(10, (tank.getTankMaxCapacity() - tank.getActualTankCapacity()));
        tank.setActualTankCapacity(fill);
        System.out.print(", es wurden: " + fill + " l getankt");
    }
}
