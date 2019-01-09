package com.coderbd.oopthinking.student.eduqua;

public class EducationalQualification {

    private int id;
    private Exam exam;
    private Session session;
    private Board board;
    private Institute institute;
    private Group group;
    private PassingYear passingYear;
    private CGPA cgpa;

    public EducationalQualification(int id, Exam exam, Session session, Board board, Institute institute, Group group, PassingYear passingYear, CGPA cgpa) {
        this.id = id;
        this.exam = exam;
        this.session = session;
        this.board = board;
        this.institute = institute;
        this.group = group;
        this.passingYear = passingYear;
        this.cgpa = cgpa;
    }

    @Override
    public String toString() {
        return "EducationalQualification{" + "id=" + id + ", exam=" + exam + ", session=" + session + ", board=" + board + ", institute=" + institute + ", group=" + group + ", passingYear=" + passingYear + ", cgpa=" + cgpa + '}';
    }

}
