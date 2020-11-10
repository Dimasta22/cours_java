package laba3.model;

import java.util.ArrayList;

public class Faculty extends University {
    public ArrayList<Department> departments;
    public String facultyName;

    @Override
    public Boss getBoss() {
        return super.getBoss();
    }

    @Override
    public void setBoss(Boss boss) {
        super.setBoss(boss);
    }

    public ArrayList<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(ArrayList<Department> departments) {
        this.departments = departments;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }
}
