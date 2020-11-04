package com.example;

import com.example.Human.Sex;
import com.example.Group.NumberGroup;

public class UniversityController {
    private Student model;
    private Faculty additionally;
    private UniversityView view;
    private Group group;

    public UniversityController(Student model, Faculty additionally, Group group, UniversityView view) {
        this.model = model;
        this.additionally = additionally;
        this.view = view;
        this.group = group;

    }

    public void setStudentName(String name) {
        model.setName(name);
    }

    public String getStudentName() {
        return model.getName();
    }

    public void setStudentSurname(String surname) {
        model.setSurname(surname);
    }

    public String getStudentSurname() {
        return model.getSurname();
    }

    public void setStudentPatronymic(String patronymic) {
        model.setPatronymic(patronymic);
    }

    public String getStudentPatronymic() {
        return model.getPatronymic();
    }

    public void setStudentSex(Sex sex) {
        model.setSex(sex);
    }

    public Sex getStudentSex() {
        return model.getSex();
    }

    public void setStudentAge(Integer age) {
        model.setAge(age);
    }

    public Integer getStudentAge() {
        return model.getAge();
    }

    public void setUniversityControllerName(String name) {
        additionally.setUniversityName(name);
    }

    public String getUniversityControllerName() {
        return additionally.getUniversityName();
    }

    public void setFacultyControllerName(String name) {
        additionally.setFacultyName(name);
    }

    public String getFacultyControllerName() {
        return additionally.getFacultyName();
    }

    public void setGroup(NumberGroup numberGroup) {
        group.setNumberGroup(numberGroup);

    }

    public NumberGroup getGroup() {
        return group.getNumberGroup();
    }

    public void updateView() {
        view.printUniversityInformation(model.getName(), model.getSurname(), model.getPatronymic(), model.getSex(), model.getAge(), additionally.getUniversityName(), additionally.getFacultyName(), group.getNumberGroup());
    }


}
