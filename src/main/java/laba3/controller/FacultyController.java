package laba3.controller;


import laba3.model.Department;
import laba3.model.Faculty;
import laba3.view.FacultyView;

import java.util.ArrayList;

public class FacultyController {

    private Faculty facultyModel;
    private FacultyView facultyView;

    public FacultyController(Faculty facultyModel, FacultyView facultyView) {
        this.facultyModel = facultyModel;
        this.facultyView = facultyView;
    }

    public Faculty getFacultyModel() {
        return facultyModel;
    }

    public void setFacultyModel(Faculty facultyModel) {
        this.facultyModel = facultyModel;
    }

    public FacultyView getFacultyView() {
        return facultyView;
    }

    public void setFacultyView(FacultyView facultyView) {
        this.facultyView = facultyView;
    }

    public void updateFacultyView(){
        facultyView.printFacultyDetails(facultyModel.getFacultyName());
    }
}
