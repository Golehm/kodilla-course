package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TaskQueueTestSuite {
    @Test
    public void testUpdate() {
        //Given
        TaskQueue johnDoeTasks = new TaskQueue("John", "Doe");
        TaskQueue enabranTain = new TaskQueue("Enabran","Tain");
        TaskQueue elimGarak = new TaskQueue("Elim","Garak");
        TaskQueue andrzejKmicic = new TaskQueue("Andrzej","Kmicic");
        TaskQueue mikchailTal = new TaskQueue("Mikchail","Tal");
        TaskQueue tashaYar = new TaskQueue("Tasha","Yar");
        TaskQueue gulDukat = new TaskQueue("Gul","Dukat");

        Mentor masterYoda = new Mentor("master","Yoda");
        Mentor feliksKoneczny = new Mentor("Feliks","Koneczny");

        johnDoeTasks.registerObserver(masterYoda);
        enabranTain.registerObserver(masterYoda);
        elimGarak.registerObserver(masterYoda);
        andrzejKmicic.registerObserver(masterYoda);
        mikchailTal.registerObserver(feliksKoneczny);
        tashaYar.registerObserver(feliksKoneczny);
        gulDukat.registerObserver(feliksKoneczny);
        //When
        johnDoeTasks.addTask("Task 1");
        johnDoeTasks.addTask("Task 2");
        johnDoeTasks.addTask("Task 3");
        enabranTain.addTask("1");
        elimGarak.addTask("T 1");
        elimGarak.addTask("T 2");
        mikchailTal.addTask("Check 1");
        mikchailTal.addTask("Check 2");
        mikchailTal.addTask("Check 3");
        mikchailTal.addTask("Check mate");
        tashaYar.addTask("Ta sk 0");
        gulDukat.addTask("Ein");
        gulDukat.addTask("Zwei");
        gulDukat.addTask("Drei");
        gulDukat.addTask("Vier");
        //Then
        assertEquals(6, masterYoda.getUpdateCount());
        assertEquals(9,feliksKoneczny.getUpdateCount());



    }
}
