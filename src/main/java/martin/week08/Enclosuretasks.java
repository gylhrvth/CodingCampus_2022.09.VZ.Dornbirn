package martin.week08;

public class Enclosuretasks {
    private String taskName;
    private boolean taskDone;

    public Enclosuretasks() {
        taskName = "Däumenchen drehen";
        taskDone = false;
    }

    public Enclosuretasks(String taskName) {
        this.taskName = taskName;
        taskDone = false;
    }

    public Enclosuretasks(String taskName, boolean taskDone) {
        this.taskName = taskName;
        this.taskDone = taskDone;
    }
}
