package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryExecuteTask(){
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shopping = taskFactory.makeTask("Shopping", "Bread", 3.0,
                "","","","");
        Task painting = taskFactory.makeTask("Painting", "", 0.0,
                "Black","Living room","","");
        Task driving = taskFactory.makeTask("Driving", "", 0.0,
                "","","Pasadena","Car");
        //Then
        shopping.executeTask();
        painting.executeTask();
        driving.executeTask();
    }
    @Test
    public void testFactoryGetTaskName(){
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shopping = taskFactory.makeTask("Shopping", "Bread", 3.0,
                "","","","");
        Task painting = taskFactory.makeTask("Painting", "", 0.0,
                "Black","Living room","","");
        Task driving = taskFactory.makeTask("Driving", "", 0.0,
                "","","Pasadena","Car");
        //Then
        Assert.assertEquals("Shopping", shopping.getTaskName());
        Assert.assertEquals("Painting", painting.getTaskName());
        Assert.assertEquals("Driving", driving.getTaskName());
    }
    @Test
    public void testFactoryIsTaskExecuted(){
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shopping = taskFactory.makeTask("Shopping", "Bread", 3.0,
                "","","","");
        Task painting = taskFactory.makeTask("Painting", "", 0.0,
                "Black","Living room","","");
        Task driving = taskFactory.makeTask("Driving", "", 0.0,
                "","","Pasadena","Car");
        //Then
        Assert.assertEquals(true, shopping.isTaskExecuted());
        Assert.assertEquals(true, painting.isTaskExecuted());
        Assert.assertEquals(true, driving.isTaskExecuted());
    }
}
