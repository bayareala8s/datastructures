package com.bayareala8s.Hashing;

public class studentRecord {

    private int studentId;  // -1 is not a valid student id. We change to -1 when we delete a record
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
