package fatima.week06.Camera;

public class FullMemoryCardException extends Exception{
    FullMemoryCardException() {
        super("No more free memory on memory card.");
    }
}
