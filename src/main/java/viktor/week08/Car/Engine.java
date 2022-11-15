package viktor.week08.Car;

import java.util.Random;

public class Engine {

     enum Antriebsart {BENZIN, DIESEL, GAS, ELECTRICITY};

     private Antriebsart art;

     public Engine(Antriebsart art){
         this.art = art;

     }

    public Antriebsart getArt() {
        return art;
    }


    public boolean defekt(){
         Random random = new Random();
         int ranNum = random.nextInt(11);

         if (ranNum > 7){
             return true;
         }
         return false;
    }


    @Override
    public String toString(){
         return "Engine: " + art;
    }
}
