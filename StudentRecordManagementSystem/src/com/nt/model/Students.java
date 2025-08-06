package com.nt.model;

public class Students {

    private int id;
    public String name;
    private double marks;

    // declaring the constructors
    public Students(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    // getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    // toString to display student Info


    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
