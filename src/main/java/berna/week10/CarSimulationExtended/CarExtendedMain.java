package berna.week10.CarSimulationExtended;

public class CarExtendedMain {
    public static void main(String[] args) {
        //TODO: create Tank and Engine with new Car()!

        Tank tank1 = new Tank( 60,40);
        Engine eng1 = new Engine(60,tank1);
        CarExtended car1 = new CarExtended(eng1,tank1,1500);

        car1.toString();
        car1.driveSimulation(55);
        car1.driveSimulation(100);





    }
}
