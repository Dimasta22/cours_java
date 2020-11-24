package laba3.model;

import java.util.ArrayList;
import java.util.Objects;

public class Group extends Department{
    private ArrayList<Student> students;
    private String groupNumber;

    private Boss bossGroup;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return students.equals(group.students) &&
                groupNumber.equals(group.groupNumber) &&
                bossGroup.equals(group.bossGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(students, groupNumber, bossGroup);
    }

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
