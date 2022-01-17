package com.kodilla.spring.portfolio;

import org.springframework.scheduling.config.Task;

import java.util.ArrayList;
import java.util.List;

public class TaskList {

    private List<String> tasks;

    public TaskList(List<String> tasks) {
        this.tasks = new ArrayList();
    }

    public List<String> getTasks() {
        return tasks;
    }
    public TaskList () {

    }
}
