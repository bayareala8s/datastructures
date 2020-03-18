package com.bayareala8s.hashing;

public class studentRecord {

    private int studentId;
    private String studentName;

    public studentRecord(int i, String name) {

        studentId = i;
        studentName = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int i) {

        studentId = i;
    }

    public String toString() {

        return studentId + " " + studentName + " ";
    }
}
