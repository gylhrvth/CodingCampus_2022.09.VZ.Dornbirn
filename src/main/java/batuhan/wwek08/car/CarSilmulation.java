package batuhan.wwek08.car;

public class CarSilmulation {
    public static void main(String[] args) {
        RepairStation rs = new RepairStation("Pink Motor");

        Car car = new Car("Mercedes benz", "AmgGT63s", 345, "Benzin", 1850, 120,new Engine("Verbenner Motor"));
        car.drive(250);
        car.defekt(new Engine("verbrenner"));

        Car car1 = new Car("Audi", "RS7", 315, "Benzin", 1950, 120,new Engine("Verbenner"));
        car1.setMyRepairStation(rs);



//        System.out.println(car1.toString());
//        System.out.println(car.toString());
        System.out.println("---");
        System.out.println(car1);
        for (int i = 0; i < 10; i++) {
            int drivenKM = car1.drive(100);
            if (drivenKM < 100) {
                System.out.println("Bitte gehen sie Tanken!!!!");
                car1.refuel();
            }
            System.out.println("Ich fahre: " + drivenKM + "km, und habe noch " + car1.getCurrenttankcontent() + " l im Tank");
        }

    }
}