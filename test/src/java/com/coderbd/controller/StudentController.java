package com.coderbd.controller;

import com.coderbd.dao.Studentdao;
import com.coderbd.entity.Student;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class StudentController {

    private Student student;
    private String[] courseCompleted;

    public void save() {
        String cc = "";
        for (String s : courseCompleted) {
            cc += s + ", ";
        }
        student.setCourseCompleted(cc);
        Studentdao studentdao = new Studentdao();
        studentdao.saveStudent(student);
        System.out.println("Success");
    }

    public Student getStudent() {
        if (student == null) {
            student = new Student();
        }
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String[] getCourseCompleted() {
        return courseCompleted;
    }

    public void setCourseCompleted(String[] courseCompleted) {
        this.courseCompleted = courseCompleted;
    }

}
