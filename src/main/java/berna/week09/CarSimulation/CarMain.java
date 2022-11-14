package berna.week09.CarSimulation;

public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car(60,100,2000);
        Car car2 = new Car(60,100,1500);
        Car car3 = new Car(60,60,850);

        System.out.println(" === YOU DRIVE ME CRAZY ===");


        System.out.println("car1 :" + car1.drive(850));
        System.out.println("car2 :" + car2.drive(850));

        System.out.println("car 1 wants to refill tank... ");
        car1.refill(40);


    }
}
