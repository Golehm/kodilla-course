package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {
    private String taskName = "Painting";
    private String color;
    private String whatToPaint;
    PaintingTask(String color, String whatToPaint){
        this.color = color;
        this.whatToPaint = whatToPaint;
    }
    public void executeTask(){
        System.out.println("Painting " + color + " in " + whatToPaint);
    }
    public String getTaskName(){
        return taskName;
    }
    public boolean isTaskExecuted(){
        if(whatToPaint != ""){
        return true;
        }
        return false;
    }
}
