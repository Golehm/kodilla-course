package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {
    String taskName = "Shopping";
    String whatToBuy;
    double quantity;
    ShoppingTask(String whatToBuy, double quantity){
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }
    public void executeTask(){
        System.out.println("Shopping for " + whatToBuy + " quantity " + quantity);
    }
    public String getTaskName(){
        return taskName;
    }
    public boolean isTaskExecuted(){
        if(quantity > 0){
        return true;
        }
        return false;
    }
}
