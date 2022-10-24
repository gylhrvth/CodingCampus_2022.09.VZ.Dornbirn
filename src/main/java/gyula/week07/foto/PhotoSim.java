package gyula.week07.foto;

public class PhotoSim {
    public static void main(String[] args) {
        MemoryCard mc = new MemoryCard("Sony 500", 500);
        Camera c = new Camera("Sony Alpha 6500", 300);
        c.insertMemoryCard(mc);
        for (int i = 0; i < 10; i++) {
            boolean result = c.takePhoto();
            if (!result) {
                System.out.println("Photo cannot be stored.");
            }
        }
        System.out.println(c);
    }
}
