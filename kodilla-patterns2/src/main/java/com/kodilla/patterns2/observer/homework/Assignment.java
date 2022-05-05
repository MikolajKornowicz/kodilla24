package com.kodilla.patterns2.observer.homework;

public class Assignment {

    private double module;
    private String description;
    private Student student;

    public Assignment(double module, String description, Student student ) {
        this.module = module;
        this.description = description;
        this.student = student;
    }

    public double getModule() {
        return module;
    }


    public String getDescription() {
        return description;
    }

    public Student getStudent() {
        return student;
    }
}
