package laba3.controller;

import laba3.model.Group;
import laba3.view.GroupView;

public class GroupController {

    private Group groupModel;
    private GroupView groupView;

    public GroupController(Group groupModel, GroupView groupView){
        this.groupModel = groupModel;
        this.groupView = groupView;
    }

    public Group getGroupModel() {
        return groupModel;
    }

    public void setGroupModel(Group groupModel) {
        this.groupModel = groupModel;
    }

    public GroupView getGroupView() {
        return groupView;
    }

    public void setGroupView(GroupView groupView) {
        this.groupView = groupView;
    }

    public void updateGroupeView(){
        groupView.printGroupDetails(groupModel.getGroupNumber());
    }
}
