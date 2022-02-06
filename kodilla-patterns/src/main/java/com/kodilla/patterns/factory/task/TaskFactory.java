package com.kodilla.patterns.factory.task;

public class TaskFactory {

    public final static String DRIVINGTASK = "DRIVING";
    public final static String PAINTINGTASK = "PAINTING";
    public final static String SHOPPINGTASK = "SHOPPINGTASK";

    public final Task doTask (final String taskClass) {
        switch (taskClass) {
            case DRIVINGTASK:
                return new DrivingTask("Driving task", "Sopot", "Volvo");
            case PAINTINGTASK:
                return new PaintingTask("Painting task", "White", "Wall");
            case SHOPPINGTASK:
                return new ShoppingTask("Shopping Task", "Cat food", 14.0);
            default:
                return null;
        }
    }
    }

