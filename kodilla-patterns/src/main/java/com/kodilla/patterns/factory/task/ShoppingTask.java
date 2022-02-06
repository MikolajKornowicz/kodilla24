package com.kodilla.patterns.factory.task;

public final class ShoppingTask implements Task{
    private final String taskName;
    private final String whatToBuy;
    private final double quantity;

    public ShoppingTask( final String taskName, final String whatToBuy, final double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public String executeTask(String task) {
        System.out.println("Executing: " + task);
        return "Executing: " + task;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted(String task) {
        String s = "SHOPPING";
        return s.equals(task);
    }

    public String getWhatToBuy() {
        return whatToBuy;
    }

    public double getQuantity() {
        return quantity;
    }
}
