package stefan.week08.CarV2;


import java.util.ArrayList;
import java.util.List;

public class CarSimulationV2 {

    public static void main(String[] args) {
        List<CarV2> carlist = new ArrayList<>();

        CarV2 car1 = new CarV2("Honda", "cx3", 1500, 50, 100);
        carlist.add(car1);


        carDrive(carlist, 2000);
    }


    public static void carDrive(List<CarV2> carlist, int fahrstrecke) {
        for (CarV2 c : carlist) {

            System.out.println(c.getHersteller() + " " + c.getModell() + " Verbraucht " + c.calculateLitersPer100KM() + "l auf 100km ");

//                      545  2000
            int drivenKM = c.drive(fahrstrecke);


            System.out.println(drivenKM);
            while (drivenKM < fahrstrecke) {
                System.out.println(c.getHersteller() + " " + c.getModell() + " fährt " + drivenKM + " km" + " Tank ist leer");
//2000-545
                c.fillup();
                c.drive(fahrstrecke);
                fahrstrecke = fahrstrecke - drivenKM;


            }


            if (drivenKM > 400)
                System.out.println(c.getHersteller() + c.getModell() + " Hat MoterSchaden nach " + drivenKM + "km");

            c.repairCar();
            System.out.println("Der neue Verbrauch "+c.calculateLitersPer100KM());
            System.out.println("Fahrziel wurde nach " + c.drive(fahrstrecke) + "km erreicht");



        }
        System.out.println();
    }


}

