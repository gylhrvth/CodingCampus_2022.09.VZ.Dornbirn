package viktor.week08.Car;

public class CarSimulation {

    public static void main(String[] args) {


        Car ford = new Car("Mustang",20.0,400, Car.Antriebsart.BENZIN,1500);

        int drive1 = ford.drive(2);

        System.out.println("Ich fahre jetzt " + drive1 + " km.\n");

        int drive2 = ford.drive(30);
        System.out.println("Ich fahre jetzt " + drive2 + " km.\n");

        int drive3 = ford.drive(50);
        System.out.println("Ich fahre jetzt " + drive3 + " km.\n");

        int drive4 = ford.drive(60);
        System.out.println("Ich fahre jetzt " + drive4 + " km.\n");


        ford.refill();

        int drive5 = ford.drive(60);
        System.out.println("Ich fahre jetzt " + drive5 + " km.\n");
    }
}
