package laba3.model;

import java.util.ArrayList;

public class Group extends Department{
    private ArrayList<Student> students;
    private String groupNumber;

    private Boss bossGroup;

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public String getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }

    public Boss getBossGroup() {
        return bossGroup;
    }

    public void setBossGroup(Boss bossGroup) {
        this.bossGroup = bossGroup;
    }
}
