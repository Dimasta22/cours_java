package laba4;

import laba3.controller.*;
import laba3.model.*;
import laba3.view.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Filling {

    public University createUniversity() {

        University universityModel = retriveUniversityFromDatabase();


        UniversityView universityView = new UniversityView();
        UniversityController universityController = new UniversityController(universityModel, universityView);

        universityController.updateUniversityView();

        return universityModel;
    }

    private University retriveUniversityFromDatabase() {
        String name = "NTU";
        ;

        Scanner scanner = new Scanner(System.in);
        University university = new University();

        university.setUniversityName(name);

        Boss universityBoss = retriveBossFromDatabase(name);
        BossView bossView = new BossView();
        BossController bossController = new BossController(universityBoss, bossView);
        bossController.updateBossView();
        university.setBossUniversity(universityBoss);

        university.setLocationCities("Dnipro");

        ArrayList<Faculty> faculties = (ArrayList<Faculty>) createFaculty();
        university.setFaculties(faculties);

        return university;
    }

    private List<Faculty> createFaculty() {
        ArrayList<Faculty> faculties = new ArrayList<Faculty>();

        Faculty facultyModel = retriveFacultyFromDatabase();
        faculties.add(facultyModel);

        FacultyView facultyView = new FacultyView();
        FacultyController facultyController = new FacultyController(facultyModel, facultyView);

        facultyController.updateFacultyView();

        return faculties;
    }

    private Faculty retriveFacultyFromDatabase() {
        String name = "FIT";


        Faculty faculty = new Faculty();


        faculty.setFacultyName(name);

        Boss facultyBoss = retriveBossFromDatabase(name);
        BossView bossView = new BossView();
        BossController bossController = new BossController(facultyBoss, bossView);
        bossController.updateBossView();
        faculty.setBossFaculty(facultyBoss);

        ArrayList<Department> departments = (ArrayList<Department>) createDepartment();
        faculty.setDepartments(departments);

        return faculty;
    }

    private List<Department> createDepartment() {
        ArrayList<Department> departments = new ArrayList<Department>();


        Department departmentModel = retriveDepartmentFromDatabase();
        departments.add(departmentModel);

        DepartmentView departmentView = new DepartmentView();
        DepartmentController departmentController = new DepartmentController(departmentModel, departmentView);

        departmentController.updateDepartmentView();

        return departments;
    }

    private Department retriveDepartmentFromDatabase() {
        String name = "SAU";


        Department department = new Department();

        department.setDepartmentName(name);

        Boss departmentBoss = retriveBossFromDatabase(name);
        BossView bossView = new BossView();
        BossController bossController = new BossController(departmentBoss, bossView);
        bossController.updateBossView();
        department.setBossDepartment(departmentBoss);

        ArrayList<Group> groups = (ArrayList<Group>) createGroup();
        department.setGroups(groups);

        return department;
    }

    private List<Group> createGroup() {
        ArrayList<Group> groups = new ArrayList<Group>();

        Group groupModel = retriveGroupFromDatabase();
        groups.add(groupModel);

        GroupView groupView = new GroupView();
        GroupController groupController = new GroupController(groupModel, groupView);

        groupController.updateGroupeView();

        return groups;
    }

    private Group retriveGroupFromDatabase() {
        String number = "1";

        Group group = new Group();

        group.setGroupNumber(number);

        Boss groupBoss = retriveBossFromDatabase(number);
        BossView bossView = new BossView();
        BossController bossController = new BossController(groupBoss, bossView);
        bossController.updateBossView();
        group.setBossGroup(groupBoss);

        ArrayList<Student> students = (ArrayList<Student>) createStudent();
        group.setStudents(students);

        return group;
    }

    private List<Student> createStudent() {
        ArrayList<Student> students = new ArrayList<Student>();

        Student studentModel = retriveStudentFromDatabase();
        students.add(studentModel);

        StudentView studentView = new StudentView();
        StudentController studentController = new StudentController(studentModel, studentView);

        studentController.updateStudentView();


        return students;
    }

    private Student retriveStudentFromDatabase() {

        Student student = new Student();
        student.setName("Dimitry");
        student.setSurname("Serdiuk");
        student.setPatronymic("Olegovich");
        student.setCourse(3);

        student.setSex(Sex.MALE);

        return student;
    }

    private Boss retriveBossFromDatabase(String nameAria) {

        Boss boss = new Boss();
        boss.setName("Aleksandr");
        boss.setSurname("Mineev");
        boss.setPatronymic("Sergeevich");
        boss.setSex(Sex.MALE);
        boss.setBossControl(nameAria);

        return boss;
    }
}


