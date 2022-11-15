package berna.week10.CarSimulationExtended;

public class CarExtendedMain {
    public static void main(String[] args) {


        Engine eng1 = new Engine(60,60,50);
        CarExtended car1 = new CarExtended(eng1,1500);
        //general info on your car
        System.out.println(car1.toString());
        // run a driving simulation
        for (int i = 10; i < 2701; i= i+17) {
            car1.simulateDriving(2700);
        }





    }
}
