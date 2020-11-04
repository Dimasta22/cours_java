package com.example;

public class UniversityView {
    public void printUniversityInformation(String studentName, String studentSurname, String studentPatronymic, Human.Sex studentSex , Integer studentAge, String universityName, String facultyName, Group.NumberGroup studentGroup){
        System.out.println("Student: ");
        System.out.println("Name: "+studentName);
        System.out.println("Surname: "+studentSurname);
        System.out.println("Patronymic: "+studentPatronymic);
        System.out.println("Sex: "+studentSex);
        System.out.println("Age: "+studentAge);
        System.out.println("University: "+universityName);
        System.out.println("Faculty: "+facultyName);
        System.out.println("Group: "+studentGroup);


    }
}
