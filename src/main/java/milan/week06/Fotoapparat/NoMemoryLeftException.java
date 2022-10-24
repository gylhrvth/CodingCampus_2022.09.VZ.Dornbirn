package milan.week06.Fotoapparat;

public class NoMemoryLeftException extends Exception {
    private long leftMemory;
    public NoMemoryLeftException(long leftMemory) {
        this.leftMemory = leftMemory;
    }

    public long getLeftMemory() {
        return leftMemory;
    }
}
