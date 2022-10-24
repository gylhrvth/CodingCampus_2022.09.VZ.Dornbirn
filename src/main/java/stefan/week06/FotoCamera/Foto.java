package stefan.week06.FotoCamera;

public class Foto {


    public static void main(String[] args) {
        FotoApperat fo1 = new FotoApperat("Nikon","Gugus",500);
        System.out.println("_________________");
        System.out.println(fo1);
        System.out.println("_________________");
        System.out.println(fo1.takephoto());
        fo1.takephoto();
        SpeicherKarte memorycard= new SpeicherKarte(1000000);

    }
}
