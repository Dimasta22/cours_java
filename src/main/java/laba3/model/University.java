package laba3.model;

import java.util.ArrayList;

public class University extends UniversityBase {

    public ArrayList<Faculty> faculties;
    public String locationCities;
    public Boss bossUniversity;

    public ArrayList<Faculty> getFaculties() {
        return faculties;
    }

    public void setFaculties(ArrayList<Faculty> faculties) {
        this.faculties = faculties;
    }

    public String getLocationCities() {
        return locationCities;
    }

    public void setLocationCities(String locationCities) {
        this.locationCities = locationCities;
    }

    public Boss getBossUniversity() {
        return bossUniversity;
    }

    public void setBossUniversity(Boss bossUniversity) {
        this.bossUniversity = bossUniversity;
    }
}
