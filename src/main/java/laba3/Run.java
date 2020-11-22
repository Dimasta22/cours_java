package laba3;

import laba3.model.University;

public class Run {
    public static void main(String[] args) {
        UniversityGenerate universityGenerate = new UniversityGenerate();
        University university = universityGenerate.createUniversity();
    }
}
