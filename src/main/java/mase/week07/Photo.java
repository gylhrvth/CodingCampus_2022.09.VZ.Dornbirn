package mase.week07;

public class Photo {
    private int id;
    private int size;



    public Photo(int id, int size){
        this.id = id;
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString(){
        return "Photo " + id;
    }
}
