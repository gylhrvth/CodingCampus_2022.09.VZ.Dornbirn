package viktor.week01;

public class Counting {
    public static void main(String[] args) {


        System.out.println("1. Aufgabe mit For-Loop:");
        for(int i=1; i <= 10; ++i)
        {   if (i==1){
            System.out.println(i + ".st Hello World!");
        } else if (i==2) {
            System.out.println(i + ".nd Hello World!");
        } else if (i==3){
            System.out.println(i + ".td Hello World");
        }
        else {
         System.out.println(i + ".th Hello World!");
        }
        }

        System.out.println("\n");
        System.out.println("While-Loop:");

        int j=0;
        while(j <= 10)
        {
            System.out.println(j);
            j++;
        }
        System.out.println("\n");
        System.out.println("Aufgabe 2:");
        for(int k=0; k<10; k++){
            System.out.println(k);
        }
        System.out.println("\n");
        System.out.println("3. Aufgabe:");
        for(int l=1; l<=10; l++)
        {
            if (l % 2 == 0){
                System.out.println(l + " .gerade Zahl");
            }
        }
        System.out.println("\n");
        System.out.println("4. Aufgabe:");
        for(int n=10; n >= -10; n--){
            System.out.println(n);
        }


    }

}
