package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class BoardConfig {

    @Autowired
    Board board;

    @Bean
    public TaskList taskListToDo () {
        TaskList taskListToDo = new TaskList();
        taskListToDo.getTasks().add("Chore to do");
        return taskListToDo;
    }
    @Bean
    public TaskList taskListInProgress () {
        TaskList taskListToDo = new TaskList();
        taskListToDo.getTasks().add("Chore in progress");
        return taskListToDo;
    }
    @Bean
    public TaskList taskListDone () {
        TaskList taskListToDo = new TaskList();
        taskListToDo.getTasks().add("Chore in progress");
        return taskListToDo;
    }

    @Bean
    public Board getBoard (){
        return new Board(taskListToDo(), taskListInProgress(), taskListDone());
    }
}
