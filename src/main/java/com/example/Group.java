package com.example;

public class Group {
    public enum NumberGroup{
        FIRST,
        SECOND,
        THIRD
    };

    private NumberGroup numberGroup;

    public NumberGroup getNumberGroup(){
        return numberGroup;
    }

    public void setNumberGroup(NumberGroup numberGroup){
        this.numberGroup=numberGroup;
    }
}
