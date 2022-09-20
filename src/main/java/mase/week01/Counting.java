package mase.week01;

public class Counting {
    public static void main(String[] args){
      for(int i = 0; i <= 10; i++ ){
          System.out.println(i);
      }

        System.out.println("========================");

      int x = 0;
      while(x <=10){
          System.out.println(x);
          x++;
      }

        System.out.println("=====================");


      for(int y = 0; y<= 10; y++){

          if(y %2==0){
              System.out.println(y);
          }
      }
        System.out.println("=====================");

      for(int z = 10; z >= -10; z--){
          System.out.println(z);
      }
    }
}
