package com.coderbd.oopthinking.student.eduqua;

public class Session {

    int id;
    String session;

    public Session(int id, String session) {
        this.id = id;
        this.session = session;
    }

    @Override
    public String toString() {
        return "Session{" + "id=" + id + ", session=" + session + '}';
    }

}
