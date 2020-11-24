package laba3.model;

import java.util.ArrayList;
import java.util.Objects;

public class Faculty extends UniversityBase {
    public ArrayList<Department> departments;
    public String facultyName;
    private Boss bossFaculty;

    public ArrayList<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(ArrayList<Department> departments) {
        this.departments = departments;
    }

    public String getFacultyName() {
        return facultyName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Faculty faculty = (Faculty) o;
        return departments.equals(faculty.departments) &&
                facultyName.equals(faculty.facultyName) &&
                bossFaculty.equals(faculty.bossFaculty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departments, facultyName, bossFaculty);
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public Boss getBossFaculty() {
        return bossFaculty;
    }

    public void setBossFaculty(Boss bossFaculty) {
        this.bossFaculty = bossFaculty;
    }
}
