package com.kodilla.patterns2.observer.homework;


import java.util.ArrayList;
import java.util.List;

public class Mentor implements ObserverHW {

    private final String name;
    private List<Student> students;
    private List<Assignment> assignments;
    private int updateCount;

    public Mentor(String name) {
        this.name = name;
        students = new ArrayList<>();

    }

    @Override
    public void update(HomeworkQueue homeworkQueue) {
        updateCount++;
        if (updateCount == 1) {
            System.out.println("Hi " + name + ". There is one new assignment waiting to be checked in " + homeworkQueue.getName());
        } else {
            System.out.println("Hi " + name + ". There are " + updateCount + " new assignments waiting to be checked in " + homeworkQueue.getName());
        }

    }

    public String getName() {
        return name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public int getUpdateCount() {
        return updateCount;
    }

    public List<Assignment> getAssignments() {
        return assignments;
    }
}
