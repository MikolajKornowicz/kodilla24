package com.kodilla.hibernate.takslist.dao;

import com.kodilla.hibernate.taskList.TaskList;
import com.kodilla.hibernate.taskList.dao.TaskListDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    private static final String NAME = "TaskList name test";
    private static final String DESCRIPTION = "Task description test";

    @Test
    void testFindByListName (){
        //given
        TaskList taskList = new TaskList(NAME, DESCRIPTION);
        String name = taskList.getListName();
        taskListDao.save(taskList);
        //when
        List<TaskList> list = taskListDao.findByListName(name);
        //then
        assertEquals(1, list.size());
        //cleanup
        int id = list.get(0).getId();
        taskListDao.deleteById(id);
    }
}
