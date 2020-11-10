package laba3.view;

import laba3.model.Sex;

public class StudentView {
    public void printStudentDetails(String name, String surname, String patronymic, int cours, Sex sex) {
        System.out.println("\nName: " + name + " | Surname: " + surname + " | FathersName: " + patronymic + " | Level: " + cours + " | Sex: " + sex);
    }
}
