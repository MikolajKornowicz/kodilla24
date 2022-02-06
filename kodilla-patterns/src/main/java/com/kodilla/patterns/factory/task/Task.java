package com.kodilla.patterns.factory.task;

public interface Task {

    String executeTask(String task);
    String getTaskName();
    boolean isTaskExecuted(String task);

}
