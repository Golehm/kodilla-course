package com.kodilla.spring.portfolio;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Test
    public void testTaskAdd(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BoardConfig.class);
        //When
        Board board = context.getBean(Board.class);
        board.doneList.tasks.add("Done");
        board.inProgressList.tasks.add("In progress");
        board.toDoList.tasks.add("To do");
        //Then
        board.doneList.tasks.stream().forEach(System.out::println);
        board.inProgressList.tasks.stream().forEach(System.out::println);
        board.toDoList.tasks.stream().forEach(System.out::println);
    }
}
