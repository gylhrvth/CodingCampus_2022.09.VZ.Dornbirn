package patric.week04;

public class BubblesortStringExtended {


    public static void main(String[] args){
        String[] r;
        int i;
        String tmp;
        boolean done;

        r = new String[]{"Viktor", "Batuhan", "Milan", "Stefan", "Berna", "Franky", "Fatima", "Mike", "Mase", "Patric", "Alp", "Gyula", "Lukas", "Svitlana"};

        do{
            done = true;
            for(i=0; i<r.length-1 ; i++){
                if(r[i].compareTo(r[i+1]) > 0){
                    tmp= r[i]; r[i]=r[i+1]; r[i+1]=tmp;
                    done= false ;
                }
            }
        }while(!done);

        for(i=0; i<r.length;i++){
            System.out.println(r[i]+ " ");
        }
    }

}
