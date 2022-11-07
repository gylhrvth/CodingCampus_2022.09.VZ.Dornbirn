package stefan.week06.FotoCamera;

public class Foto {


    public static void main(String[] args) {
        FotoApperat foAp = new FotoApperat("Nikon", "Gugus");
        System.out.println("_________________");
        System.out.println(foAp);
        System.out.println("_________________");
        Objektiv ob1 = new Objektiv(10);
        SpeicherKarte memorycard = new SpeicherKarte(0);
        foAp.setMemory(memorycard);


        for (int i = 0; i <4 ; i++) {
            System.out.println(foAp.takephoto());
        }
        System.out.println(memorycard);

        // System.out.println(ob1.toString());


    }

}

