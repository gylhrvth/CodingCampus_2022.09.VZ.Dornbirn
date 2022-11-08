package milan.week08.zoo;

public class Tag {

    private static int lastId = 1;

    private int id;
    private Zoo zoo;

    public Tag(){
        id = lastId;
        ++lastId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void endOfDay(Zoo zoo){
        for (Gehege x : zoo.getGehegeListe()) {
            if (x.getStatus()){
                x.setStatus(false);
            }
        }
    }
}
