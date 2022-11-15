package batuhan.wwek08.car;

public class CarSilmulation {
    public static void main(String[] args) {
        RepairStation rs = new RepairStation("Pink Motor");

        Car benz = new Car("Mercedes benz", "AmgGT63s",  "Benzin", 1850, 120,new Engine("Verbenner Motor",345));
        Car audi = new Car("Audi", "RS7", "Benzin", 1950, 120,new Engine("Verbenner",315));


        benz.defekt(new Engine("verbrenner",345));
        audi.istmeinAutoan();


        audi.setMyRepairStation(rs);





        benz.drive(250);
//        System.out.println(car1.toString());
//        System.out.println(benz.toString());
        System.out.println("---");
        System.out.println(audi);
        for (int i = 0; i < 10; i++) {
            int drivenKM = audi.drive(100);
            if (drivenKM < 100) {
                System.out.println("Bitte gehen sie Tanken!!!!");
                audi.refuel();
            }
            System.out.println("Ich fahre: " + drivenKM + "km, und habe noch " + audi.getCurrenttankcontent() + " l im Tank");
        }

    }
}