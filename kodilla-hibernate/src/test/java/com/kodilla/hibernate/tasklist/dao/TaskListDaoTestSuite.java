package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static final String LIST_NAME = "To do";
    private static final String DESCRIPTION = "Task number 13.2";
    @Test
    public void testFindByListName(){
        //Given
        TaskList taskList = new TaskList(LIST_NAME,DESCRIPTION);

        //When
        taskListDao.save(taskList);

        //Then
        int id = taskList.getId();
        String listName = taskList.getListName();
        List<TaskList> findByName = taskListDao.findByListName(listName);
        Assert.assertEquals(listName, findByName.get(0).getListName());

        //CleanUp
        taskListDao.delete(id);
    }
}
