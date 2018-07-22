package scheduler;

import java.util.LinkedList;

import task.Job;
import task.Task;

public abstract class Scheduler {        
    private LinkedList<Job> history;
    private LinkedList<Task> tasks;

    public Scheduler(){
        this.tasks = new LinkedList<>();
        this.history = new LinkedList<>();
    }

    public final String toString() {
        // TODO
        return "";
    }

    public abstract void executeStep();

    public abstract void addTask(Task task);    
    
}