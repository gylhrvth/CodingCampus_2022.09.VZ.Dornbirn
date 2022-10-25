package milan.week06.Fotoapparat;

public class NoMemoryLeftException extends Exception {
    private long leftMemory;

    public NoMemoryLeftException(long leftMemory) {
        super("Kein Speicherplatz mehr verfügbar!");
        this.leftMemory = leftMemory;
    }

    public NoMemoryLeftException(String message, long leftMemory) {
        super(message);
        this.leftMemory = leftMemory;
    }


    public long getLeftMemory() {
        return leftMemory;
    }
}
