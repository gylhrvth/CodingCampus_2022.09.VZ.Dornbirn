package viktor.week08;

public class Task {

    private String taskName;

    public Task(String taskName){
        this.taskName = taskName;
    }

    public String getTask(){
        return taskName;
    }

    public void setTask(String taskName){
        this.taskName = taskName;
    }

    @Override
    public String toString(){
        return taskName;

    }
}
