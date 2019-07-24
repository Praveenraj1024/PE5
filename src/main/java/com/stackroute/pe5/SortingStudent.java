package com.stackroute.pe5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingStudent {

    List<Student> studentList = new ArrayList<>();
    StudentSorter studentSorter = new StudentSorter();

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public List<Student> getStudentList() {
        Collections.sort(this.studentList, Collections.reverseOrder(studentSorter));
        return this.studentList;
    }




}

class Student {
    private int id;
    private String name;
    private int age;

    public Student(int id, String name, int age) {
        if (name == null){
            throw new NullPointerException();
        }
        else if (age <= 0){
            throw new RuntimeException("Age cannot be negative");
        }
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }

}

class StudentSorter implements Comparator<Student>{

    @Override
    public int compare(Student student, Student t1) {
        int ageDifference = student.getAge() - t1.getAge();
        if (ageDifference == 0){
            if (student.getName().contentEquals(t1.getName())){
                return student.getId() - t1.getId();
            }
            int nameDifference = student.getName().compareTo(t1.getName());
            if (nameDifference < 0){
                nameDifference = nameDifference * -1;
            }
            else if (nameDifference > 0){
                nameDifference = nameDifference * -1;
            }
            return nameDifference;
        }

        return ageDifference;
    }
}
