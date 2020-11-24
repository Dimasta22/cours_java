package laba3.model;

import java.util.ArrayList;
import java.util.Objects;

public class Department extends Faculty {
    public ArrayList<Group> groups;
    private String departmentName;
    private Boss bossDepartment;


    public ArrayList<Group> getGroups() {
        return groups;
    }

    public void setGroups(ArrayList<Group> groups) {
        this.groups = groups;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Boss getBossDepartment() {
        return bossDepartment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Department that = (Department) o;
        return groups.equals(that.groups) &&
                departmentName.equals(that.departmentName) &&
                bossDepartment.equals(that.bossDepartment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), groups, departmentName, bossDepartment);
    }

    public void setBossDepartment(Boss bossDepartment) {
        this.bossDepartment = bossDepartment;
    }
}
