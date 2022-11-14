package viktor.week08.Car;



public class RepairStation {

   private String name;
   private int id;


    public RepairStation(String name, int id){
        this.name = name;
        this.id = id;
    }

    public Engine addNewEngineToCar(){
        System.out.println("Der Motor wurde getauscht!");
        return new Engine(Engine.Antriebsart.BENZIN);
    }



}
