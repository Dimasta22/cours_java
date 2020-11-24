package laba3.model;

import java.util.ArrayList;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        University that = (University) o;
        return faculties.equals(that.faculties) &&
                locationCities.equals(that.locationCities) &&
                bossUniversity.equals(that.bossUniversity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(faculties, locationCities, bossUniversity);
    }

    public void setBossUniversity(Boss bossUniversity) {
        this.bossUniversity = bossUniversity;
    }
}
