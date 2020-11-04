package com.example;

public class MVCUniversityLab3 {

    public static void main(String[] args){

        Student model = retriveStudentFromDatabase();

        Faculty additionally = retriveFacultyFromDatabase();

        Group group = retriveGroupFromDatabase();

        UniversityView view = new UniversityView();

        UniversityController controller = new UniversityController(model,additionally,group,view);

        controller.updateView();

        controller.setStudentName("Dima");
        controller.setStudentSurname("Serdiuk");
        controller.setStudentPatronymic("Olegovich");
        controller.setStudentSex(Human.Sex.MAN);
        controller.setStudentAge(20);
        controller.setUniversityControllerName("Polytech");
        controller.setFacultyControllerName("FIT");
        controller.setGroup(Group.NumberGroup.FIRST);
        controller.updateView();
    }
    private static Student retriveStudentFromDatabase(){
        Student student = new Student();

        student.setName("Vlad");
        student.setSurname("Sirenko");
        student.setPatronymic("Anatolievich");
        student.setSex(Human.Sex.MAN);
        student.setAge(20);

        return student;

    }

    private static Faculty retriveFacultyFromDatabase(){
        Faculty faculty = new Faculty();

        faculty.setUniversityName("Polytech");
        faculty.setFacultyName("FIT");

        return faculty;
    }

    private static Group retriveGroupFromDatabase(){
        Group group = new Group();

        group.setNumberGroup(Group.NumberGroup.THIRD);

        return group;
    }
}

