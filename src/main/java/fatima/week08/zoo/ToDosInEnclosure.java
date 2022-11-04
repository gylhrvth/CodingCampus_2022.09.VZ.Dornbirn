package fatima.week08.zoo;

public class ToDosInEnclosure {
    private String toDos;
    private Zookeeper zookeeper;
    private Enclosure enclosure;

    public ToDosInEnclosure(String toDos, Zookeeper zookeeper, Enclosure enclosure) {
        this.toDos = toDos;
        this.zookeeper = zookeeper;
        this.enclosure = enclosure;
    }

    public Zookeeper getZookeeper() {
        return zookeeper;
    }

    public String getToDos() {
        return toDos;
    }
}
