package com.kodilla.patterns.factory.task;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskTestSuite {

    @Test
    void testTaskDriving(){
        //given
        TaskFactory taskFactory = new TaskFactory();
        //when
        Task drivingTask = taskFactory.doTask(TaskFactory.DRIVINGTASK);
        String executing = drivingTask.executeTask(TaskFactory.DRIVINGTASK);
        boolean isExecuted = drivingTask.isTaskExecuted(TaskFactory.DRIVINGTASK);
        //then
        Assertions.assertEquals("Driving task", drivingTask.getTaskName());
        Assertions.assertEquals("Executing: DRIVING", executing);
        Assertions.assertEquals(true, isExecuted);
    }

    @Test
    void testTaskPainting (){
        //given
        TaskFactory taskFactory = new TaskFactory();
        //when
        Task paintingTask = taskFactory.doTask(TaskFactory.PAINTINGTASK);
        String executing = paintingTask.executeTask(TaskFactory.PAINTINGTASK);
        boolean isExecuted = paintingTask.isTaskExecuted(TaskFactory.PAINTINGTASK);
        //then
        Assertions.assertEquals("Painting task", paintingTask.getTaskName());
        Assertions.assertEquals("Executing: PAINTING", executing);
        Assertions.assertEquals(true, isExecuted);
    }

    @Test
    void testTaskShopping (){
        //given
        TaskFactory taskFactory = new TaskFactory();
        //when
        Task shoppingTask = taskFactory.doTask(TaskFactory.SHOPPINGTASK);
        String executing = shoppingTask.executeTask(TaskFactory.SHOPPINGTASK);
        boolean isExecuted = shoppingTask.isTaskExecuted(TaskFactory.SHOPPINGTASK);
        //then
        Assertions.assertEquals("Shopping Task", shoppingTask.getTaskName());
        Assertions.assertEquals("Executing: SHOPPING", executing);
        Assertions.assertEquals(true, isExecuted);
    }
}
