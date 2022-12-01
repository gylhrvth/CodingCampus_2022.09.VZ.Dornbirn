package mase.week11.Bank;

public class Kunde {
    private int svn;
    private String name;


    public Kunde(int svn, String name){
        this.svn = svn;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Kunde{" +
                "svn=" + svn +
                ", name='" + name + '\'' +
                '}';
    }
}
