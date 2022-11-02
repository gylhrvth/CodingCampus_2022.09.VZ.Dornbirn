package mase.week07;

public class FotoSim {
    public static void main(String[] args) {
        Kamera k = new Kamera("Sony", 300);
        MemoryCard b = new MemoryCard("Sandisk",500);
        k.insertMemory(b);
        System.out.println(b);
    }
}
