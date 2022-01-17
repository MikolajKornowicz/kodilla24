package com.kodilla.spring.portfolio;


public class Board {

    private TaskList toDoList;
    private TaskList inProgressList;
    private TaskList doneList;

    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public void showChoreList () {
        System.out.println("to do: " + toDoList.toString());
        System.out.println("in progress: " + inProgressList.toString());
        System.out.println("done: " + doneList.toString());
    }

}
