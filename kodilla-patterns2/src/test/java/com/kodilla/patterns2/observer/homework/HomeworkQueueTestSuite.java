package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HomeworkQueueTestSuite {

    @Test
    public void hwNotificationTest(){
        //given
        HomeworkQueue javaHomeworkQueue = new JavaHomeworkQueue();
        HomeworkQueue pythonHomeworkQueue = new PythonHomeworkQueue();
        Student student1 = new Student("Brajan", "Sebastian");
        Student student2 = new Student("Monika", "Iksinska");
        Student student3 = new Student("Jan", "Kowalski");
        Student student4 = new Student("Helena", "Nowak");
        Mentor mentor1 = new Mentor("Mietek");
        Mentor mentor2 = new Mentor("Helena");
        mentor1.getStudents().add(student1);
        mentor1.getStudents().add(student2);
        mentor2.getStudents().add(student3);
        mentor2.getStudents().add(student4);
        Assignment assignment1 = new Assignment(24.1, "Exercise1", student1);
        Assignment assignment2 = new Assignment(24.1, "Exercise1", student2);
        Assignment assignment3 = new Assignment(24.1, "Exercise1", student3);
        Assignment assignment4 = new Assignment(24.1, "Exercise1", student4);
        Assignment assignment5 = new Assignment(24.2, "Exercise2", student1);
        Assignment assignment6 = new Assignment(24.2, "Exercise2", student4);
        javaHomeworkQueue.registerObserver(mentor1);
        pythonHomeworkQueue.registerObserver(mentor2);

        //when
        javaHomeworkQueue.sendHomework(assignment1);
        javaHomeworkQueue.sendHomework(assignment2);
        javaHomeworkQueue.sendHomework(assignment3);
        pythonHomeworkQueue.sendHomework(assignment4);
        pythonHomeworkQueue.sendHomework(assignment5);
        javaHomeworkQueue.sendHomework(assignment6);

        //then
        assertEquals(4, mentor1.getUpdateCount());
        assertEquals(2, mentor2.getUpdateCount());
    }

}