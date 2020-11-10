package laba3.controller;

import laba3.model.Department;
import laba3.model.Group;
import laba3.view.DepartmentView;

import java.util.ArrayList;

public class DepartmentController {
    private Department departmentModel;
    private DepartmentView departmentView;

    public DepartmentController(Department departmentModel, DepartmentView departmentView){
        this.departmentModel = departmentModel;
        this.departmentView = departmentView;
    }

    public Department getDepartmentModel() {
        return departmentModel;
    }

    public void setDepartmentModel(Department departmentModel) {
        this.departmentModel = departmentModel;
    }

    public DepartmentView getDepartmentView() {
        return departmentView;
    }

    public void setDepartmentView(DepartmentView departmentView) {
        this.departmentView = departmentView;
    }
    public void updateDepartmentView(){
        departmentView.printDepartmentDetails(departmentModel.getDepartmentName());
    }
}
