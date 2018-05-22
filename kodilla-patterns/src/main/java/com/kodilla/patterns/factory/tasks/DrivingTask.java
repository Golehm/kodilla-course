package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {
    private String taskName = "Driving";
    private String where;
    private String using;
    DrivingTask(String where, String using) {
        this.where = where;
        this.using = using;
    }
    public void executeTask() {
        System.out.println("Driving to " + where + " in a " + using);
    }
    public String getTaskName() {
        return taskName;
    }
    public boolean isTaskExecuted() {
        if(where != "") {
            return true;
        }
        return false;
    }
}
