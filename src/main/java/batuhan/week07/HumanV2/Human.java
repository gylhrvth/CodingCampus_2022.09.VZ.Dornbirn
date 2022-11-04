package batuhan.week07.HumanV2;

public class Human {




        public static int lastID=1;
        private int  id;
        private String firstname;
        private String lastname;
        private int age;
        private double size;
        private double weight;

   public Human(String firstname,String lastname,int age,double size,double weight){
       this.firstname=firstname;
       this.lastname=lastname;
       this.age=age;
       this.weight=weight;
       this.size=size;

   }
}
