package laba3.controller;

import laba3.model.University;
import laba3.view.UniversityView;

import java.util.ArrayList;

public class UniversityController {

    private University universityModel;
    private UniversityView universityView;

    public UniversityController(University universityModel, UniversityView universityView){
        this.universityModel = universityModel;
        this.universityView = universityView;
    }

    public University getUniversityModel() {
        return universityModel;
    }

    public void setUniversityModel(University universityModel) {
        this.universityModel = universityModel;
    }

    public UniversityView getUniversityView() {
        return universityView;
    }

    public void setUniversityView(UniversityView universityView) {
        this.universityView = universityView;
    }

    public void updateUniversityView(){
        universityView.printUniversityDetails(universityModel.getUniversityName(), universityModel.getLocationCities());
    }
}
