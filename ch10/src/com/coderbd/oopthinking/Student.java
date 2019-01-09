package com.coderbd.oopthinking;

public class Student {

    private int studentId;
    private String studentName;
    private String mobileNo;
    private boolean isActiveStudent;
    private Department department;

    public Student() {
    }

    public Student(int studentId, String studentName, String mobileNo, boolean isActiveStudent, Department department) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.mobileNo = mobileNo;
        this.isActiveStudent = isActiveStudent;
        this.department = department;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public boolean isIsActiveStudent() {
        return isActiveStudent;
    }

    public Department getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Student{" + "studentId=" + studentId + ", studentName=" + studentName + ", mobileNo=" + mobileNo + ", isActiveStudent=" + isActiveStudent + ", department=" + department + '}';
    }

}
