package mase.week10.Car;

import java.util.Random;

public class Car {
   public Random rand = new Random();
   private String Hersteller;
   private String Modell;
   private int kw;
   private int Tankinhalt;
   private int aktullerTankinhalt;

   public String getModel() {
      return Modell;
   }

   enum Antriebe {Benzin,Diesel,Gas,Strom}
   private Antriebe antriebsArt;
   private int Gewicht;



   public Car(String Hersteller, String Modell, int kw, int Tankinhalt, Antriebe antriebsArt, int Gewicht){
      this.Hersteller = Hersteller;
      this.Modell = Modell;
      this.kw = kw;
      this.Tankinhalt = Tankinhalt;
      this.antriebsArt = antriebsArt;
      this.Gewicht = Gewicht;
      this.aktullerTankinhalt = Tankinhalt;

   }
   public double fuelUse100km(){
      return Gewicht * 0.00005 + kw * 0.025;
   }
   public double getAktuellerTankinhalt(){
      return aktullerTankinhalt;
   }
   public void setAktullerTankinhalt(int aktullerTankinhalt){
      this.aktullerTankinhalt= aktullerTankinhalt;
   }
   public int drive(int distance){
      double maxDistanceCar = (aktullerTankinhalt / fuelUse100km()) * 100;
      int drivenDistance;
      if (maxDistanceCar >= distance){
         drivenDistance = distance;
      }else {
         drivenDistance = (int) maxDistanceCar;
      }
      double consuemedFuel = (fuelUse100km() / 100) * drivenDistance;
      aktullerTankinhalt -= (int) consuemedFuel;
      System.out.println("Zurückgelegte Distanz: " + drivenDistance + "km, Füllstand Tank: <" + aktullerTankinhalt + " l");
      return drivenDistance;
   }

   public void fillTank(){
      int fill = aktullerTankinhalt + rand.nextInt(10,(Tankinhalt-aktullerTankinhalt));
      setAktullerTankinhalt(fill);
      System.out.println(", es wurden: "+ fill+ " l getankt");
   }

   public String toString() {
      return "Car{" +
              "Hersteller = " + Hersteller +
              ", Model = " + Modell +
              ", Leistung = " + kw +
              " kW, Kapazität Tank = " + Tankinhalt +
              " l, Aktueller Füllstand = " + aktullerTankinhalt +
              " l, Antriebsart = " + antriebsArt +
              ", Gewicht = " + Gewicht + " kg" +
              '}';
   }
}
