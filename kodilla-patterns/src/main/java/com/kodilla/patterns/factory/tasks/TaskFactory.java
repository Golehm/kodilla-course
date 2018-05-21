package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING = "Shopping";
    public static final String PAINTING = "Painting";
    public static final String DRIVING = "Driving";


    public final Task makeTask(final String taskClass, String whatToBuy, double quantity,
                               String color, String whatToPaint, String where, String using) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask(whatToBuy, quantity);
            case PAINTING:
                return new PaintingTask(color, whatToPaint);
            case DRIVING:
                return new DrivingTask(where, using);
            default:
                return null;
        }

    }
}
