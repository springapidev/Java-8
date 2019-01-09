package com.coderbd.oopthinking.student;

import com.coderbd.oopthinking.student.eduqua.EducationalQualification;

public class Student {

    private int studentId;
    private String studentName;
    private String mobileNo;
    private boolean isActiveStudent;
    private Department department;
    private EducationalQualification eduq;

    public Student(int studentId, String studentName, String mobileNo, boolean isActiveStudent, Department department, EducationalQualification eduq) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.mobileNo = mobileNo;
        this.isActiveStudent = isActiveStudent;
        this.department = department;
        this.eduq = eduq;
    }

    @Override
    public String toString() {
        return "Student{" + "studentId=" + studentId + ", studentName=" + studentName + ", mobileNo=" + mobileNo + ", isActiveStudent=" + isActiveStudent + ", department=" + department + ", eduq=" + eduq + '}';
    }

}
