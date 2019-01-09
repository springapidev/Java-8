package com.coderbd.oopthinking.student.test;

import com.coderbd.oopthinking.student.Department;
import com.coderbd.oopthinking.student.Student;
import com.coderbd.oopthinking.student.eduqua.Board;
import com.coderbd.oopthinking.student.eduqua.CGPA;
import com.coderbd.oopthinking.student.eduqua.EducationalQualification;
import com.coderbd.oopthinking.student.eduqua.Exam;
import com.coderbd.oopthinking.student.eduqua.Group;
import com.coderbd.oopthinking.student.eduqua.Institute;
import com.coderbd.oopthinking.student.eduqua.PassingYear;
import com.coderbd.oopthinking.student.eduqua.Session;

public class StudentTest {

    public static void main(String[] args) {
        Student s1 = new Student(5000, "Shuvo", "01686000000", false, new Department(105, "Public Administration"), new EducationalQualification(5, new Exam(1, "MSS"), new Session(1, "2012-13"), new Board(1, "Du"), new Institute(1, "Dhaka University"), new Group(1, "Science"), new PassingYear(1, "2014"), new CGPA(1, "4.00")));
        System.out.println(s1);
    }
}
