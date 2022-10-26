package fatima.week06.Camera;

public class CameraSimulation {
    public static void main(String[] args) {
        Camera c1 = new Camera("Canon", "EOS R5", 45);
        Camera c2 = new Camera("Nikon", "D7000", 40);
        Objective o1 = new Objective(28, 70, 2.5);
        MemoryCard m1 = new MemoryCard("SanDisk", 30);

        c1.setMemoryCard(m1);
        c1.setObjective(o1);

        System.out.println(c1.takePhoto());
        System.out.println(c1.takePhoto());
        System.out.println(c1.takePhoto());
        System.out.println(c1.takePhoto());
        System.out.println(c1.takePhoto());

        System.out.println(c1 + "\n");
        System.out.println(o1 + "\n");
        System.out.println(m1 + "\n");
    }
}