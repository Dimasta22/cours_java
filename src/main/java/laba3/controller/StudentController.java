package laba3.controller;

import laba3.model.Student;
import laba3.view.StudentView;

public class StudentController {

    private Student studentModel;
    private StudentView studentView;

    public StudentController(Student studentModel, StudentView studentView){
        this.studentModel = studentModel;
        this.studentView = studentView;
    }

    public Student getStudentModel() {
        return studentModel;
    }

    public void setStudentModel(Student studentModel) {
        this.studentModel = studentModel;
    }

    public StudentView getStudentView() {
        return studentView;
    }

    public void setStudentView(StudentView studentView) {
        this.studentView = studentView;
    }

    public void updateStudentView(){
        studentView.printStudentDetails(studentModel.getName(), studentModel.getSurname(), studentModel.getPatronymic(), studentModel.getCourse(), studentModel.getSex());
    }
}
