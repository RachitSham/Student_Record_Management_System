import com.nt.model.Students;

import java.util.ArrayList;
import java.util.Scanner;

import static com.nt.students.StudentManagement.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean looprunning = true;

        while (looprunning) {

            System.out.println(" \n Welcome to Student Management System !! ");
            System.out.println("1- Add New Student:- ");
            System.out.println("2- View All Students:- ");
            System.out.println("3- Update Student Details By Id:- ");
            System.out.println("4- Remove Student By Id:- ");
            System.out.println("5- Exit:- ");
            System.out.println();
            System.out.println("Select Your Opertion[1 - 5]");

            int Operation = sc.nextInt();

            switch (Operation) {
                case 1:
                    addStudent();
                    break;

                case 2:
                    viewStudents();
                    break;

                case 3:
                    updateStudent();
                    break;

                case 4:
                    removeStudent();
                    break;

                case 5:
                    looprunning = false;
                    System.out.println("Exiting Students. Thankyou for using this application !! ");
                    break;
                default:
                    System.out.println(" Invalid Operation! Please Enter Between[1 - 5] !! ");
            }

        }
        sc.close();
    }
}