package main;

import model.Student;

public class StudentProfile {
    public static void main(String[] args) {
        Student student = new Student(123,"Justine Encarnacion",23,"male");
        System.out.println(student.getIdNumber());
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getGender());
    }
}
