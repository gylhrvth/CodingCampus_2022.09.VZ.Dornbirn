package berna.week08.ZooExample;

public class Zoo {
    // Basic Version of Zoo: Tiergarten Dornbirn only!!
    public String zooName;
    public int yearFounded;

    public Zoo() {
        this.zooName = "Tiergarten Dornbirn";
        this.yearFounded = 2022;
    }

    public String getZooName() {return zooName;}

    public int getYearFounded() {return yearFounded;}

    Enclosure enclo = new Enclosure();

    @Override
    public String toString() {
        return "Zoo: " + getZooName() + ", gegründet " + getYearFounded() + "\n" +
                enclo.toString();
    }
}

