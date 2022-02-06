package com.kodilla.patterns.factory.task;

public final class PaintingTask implements Task{

    private final String taskName;
    private final String colour;
    private final String whaToPaint;

    public PaintingTask(final String taskName, final String colour, final String whaToPaint) {
        this.taskName = taskName;
        this.colour = colour;
        this.whaToPaint = whaToPaint;
    }

    @Override
    public String executeTask(String task) {
        System.out.println("Executing: " + task);
        return "Executing: " + task;
    }

    @Override
    public String getTaskName() {
        return this.taskName;
    }

    @Override
    public boolean isTaskExecuted(String task) {
        String s = "PAINTING";
        return s.equals(task);
    }

    public String getColour() {
        return colour;
    }

    public String getWhaToPaint() {
        return whaToPaint;
    }
}
