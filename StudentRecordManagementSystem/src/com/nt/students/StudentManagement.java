package com.nt.students;

import com.nt.model.Students;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class StudentManagement {

    static ArrayList<Students> student = new ArrayList<Students>();
    static Scanner sc = new Scanner(System.in);

    // Add new Students
    public static void addStudent() {
        System.out.println("Enter The Id: ");
        int id = sc.nextInt();

        System.out.println("Enter the Name: ");
        String name = sc.next();

        System.out.println("Enter the Marks");
        double marks = sc.nextDouble();

        Students s = new Students(id, name, marks);
        student.add(s);
        System.out.println(" Students are Added Successfully !! ");
    }

    // view all students
    public static void viewStudents() {

        if (student.isEmpty()) {
            System.out.println("Noe Students Records Found !! ");
        } else
            for (Students s : student) {
                System.out.println(s);
            }
    }

    // Update the student by id
    public static void updateStudent() {
        System.out.println("Enter the Id of the Student you want to Update !! ");
        int id = sc.nextInt();
        boolean foundId = false;

        for (Students s : student) {
            if (s.getId() == id) {
                sc.nextLine();
                System.out.println("Enter the new Name:- ");
                String name = sc.nextLine();

                System.out.println("Enter the new Marks");
                double marks = sc.nextDouble();

                s.setName(name);
                s.setMarks(marks);

                foundId = true;
                break;
            }
        }
    }

    // remove the student by id
    public static void removeStudent() {
        System.out.println("Enter the Id of the Student you want to Remove !! ");
        int id = sc.nextInt();
        boolean remveId = false;

        Iterator<Students> itr = student.iterator();
        while (itr.hasNext()) {

            Students s = itr.next();
            if (s.getId() == id) {
                itr.remove();
                System.out.println("Student Deleted Successfully !! ");
                remveId = true;
                break;
            }
            if (!remveId) {
                System.out.println("Student with id " + id + " not Found !! ");
            }
        }
    }

}
