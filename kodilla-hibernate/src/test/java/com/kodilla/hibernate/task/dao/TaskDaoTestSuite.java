package com.kodilla.hibernate.task.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.kodilla.hibernate.task.Task;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class TaskDaoTestSuite {

    @Autowired
    private TaskDao taskDao;
    private static final String DESCRIPTION = "TEST";
    private static final Date DATE = new Date();

    @Test
    void testTaskDaoSave() {
        //given
        Task task = new Task(DESCRIPTION, DATE, 7);
        //when
        taskDao.save(task);
        //then
        int id =  task.getId();
        Optional<Task> readTask = taskDao.findById(id);
        assertTrue(readTask.isPresent());
        //CleanUp
        taskDao.deleteById(id);
    }

    @Test
    void testTaskDaoFindByDuration (){
        //given
        Task task = new Task(DESCRIPTION, DATE,7);
        taskDao.save(task);
        int duration = task.getDuration();
        //when
        List<Task> readTasks = taskDao.findByDuration(duration);
        //then
        assertEquals(1, readTasks.size());
        //cleanup
        int id = readTasks.get(0).getId();
        taskDao.deleteById(id);
        }
    }
