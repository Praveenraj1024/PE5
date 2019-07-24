package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SortingStudentTest {
    private SortingStudent sortingStudent;
    private StudentSorter studentSorter;



    /*
    This method runs before each test cases and assigns required values to variables.
    */

    @Before
    public void setUp() {
        sortingStudent = new SortingStudent();
        studentSorter = new StudentSorter();
    }


    /*
    This method runs after each test cases and destroys the created variable or
    changes the value.
    */

    @After
    public void tearDown() {
        sortingStudent = null;
        studentSorter = null;
    }

    @Test
    public void givenListShouldReturnTheSortedList() {
        Student student1 = new Student(10, "Raj", 20);
        Student student2 = new Student(20, "Raju", 25);
        Student student3 = new Student(30, "Dhoni", 37);
        Student student4 = new Student(40, "SK", 23);
        Student student5 = new Student(50, "Gopi", 26);
        Student student6 = new Student(60, "Praveen", 25);
        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        studentList.add(student6);
        sortingStudent.setStudentList(studentList);
        List<Student> expectedOutput = new ArrayList<>();
        expectedOutput.add(student3);
        expectedOutput.add(student5);
        expectedOutput.add(student6);
        expectedOutput.add(student2);
        expectedOutput.add(student4);
        expectedOutput.add(student1);
        assertEquals(expectedOutput, sortingStudent.getStudentList());


    }


    @Test
    public void givenListShouldReturnTheExpectedSortedList() {
        Student student1 = new Student(10, "Raj", 25);
        Student student2 = new Student(20, "Raj", 25);
        Student student3 = new Student(30, "Dhoni", 37);
        Student student4 = new Student(40, "SK", 23);
        Student student5 = new Student(50, "Gopi", 26);
        Student student6 = new Student(60, "Praveen", 25);
        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        studentList.add(student6);
        sortingStudent.setStudentList(studentList);
        List<Student> expectedOutput = new ArrayList<>();
        expectedOutput.add(student3);
        expectedOutput.add(student5);
        expectedOutput.add(student6);
        expectedOutput.add(student2);
        expectedOutput.add(student1);
        expectedOutput.add(student4);
        assertEquals(expectedOutput, sortingStudent.getStudentList());

    }

    @Test(expected = NullPointerException.class)
    public void givenNullShouldReturnTheNullPointerException() {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(10, null, 25));
        studentList.add(new Student(20, "Raj", 25));
        sortingStudent.setStudentList(studentList);
    }


    @Test(expected = RuntimeException.class)
    public void givenNegativeIntegerShouldReturnTheRuntimeException() {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(10, "Raj", -25));
        studentList.add(new Student(20, "Raj", 25));
        sortingStudent.setStudentList(studentList);
    }

    @Test
    public void givenListShouldNotReturnTheExpectedSortedList() {
        Student student1 = new Student(10, "Raj", 25);
        Student student2 = new Student(20, "Raj", 25);
        Student student3 = new Student(30, "Dhoni", 37);
        Student student4 = new Student(40, "SK", 23);
        Student student5 = new Student(50, "Gopi", 26);
        Student student6 = new Student(60, "Praveen", 25);
        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        studentList.add(student6);
        sortingStudent.setStudentList(studentList);
        List<Student> expectedOutput = new ArrayList<>();
        expectedOutput.add(student3);
        expectedOutput.add(student5);
        expectedOutput.add(student6);
        expectedOutput.add(student1);
        expectedOutput.add(student2);
        expectedOutput.add(student4);
        assertNotEquals(expectedOutput, sortingStudent.getStudentList());

    }



}