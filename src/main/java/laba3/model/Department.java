package laba3.model;

import java.util.ArrayList;

public class Department extends Faculty{
    public ArrayList<Group> groups;
    private String departmentName;

    @Override
    public Boss getBoss() {
        return super.getBoss();
    }

    @Override
    public void setBoss(Boss boss) {
        super.setBoss(boss);
    }


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
}
