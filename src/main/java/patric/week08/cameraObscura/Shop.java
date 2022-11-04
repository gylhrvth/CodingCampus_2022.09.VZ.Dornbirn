package patric.week08.cameraObscura;

public class Shop {
    public static void main(String[] args) {
        Camera sony = new Camera("Sony", "Alpha 6500");
        Camera nikon = new Camera("Nikon", "D70");

        MemoryCard mc = new MemoryCard("TransEmm", 12 * 1000 * 1000);

        System.out.println(sony);
        System.out.println(nikon);
        System.out.println(mc);

        System.out.println("=== 1. Insert Memory Card into the sony camera ===");
        sony.insertMemoryCard(mc);
        System.out.println(sony);
        System.out.println(nikon);
        System.out.println(mc);

        System.out.println("=== 2. Remove Memory Card from the sony camera ===");
        sony.removeMemoryCard();
        System.out.println(sony);
        System.out.println(nikon);
        System.out.println(mc);

        System.out.println("=== 3. Insert the same Memory Card into more then one camera ===");
        sony.insertMemoryCard(mc);
        nikon.insertMemoryCard(mc);
        System.out.println(sony);
        System.out.println(nikon);
        System.out.println(mc);

        System.out.println("=== 4. Remove the Memory Card before insert in a new camera ===");
        MemoryCard m = sony.removeMemoryCard();
        nikon.insertMemoryCard(m);
        System.out.println(sony);
        System.out.println(nikon);
        System.out.println(mc);


    }
}
