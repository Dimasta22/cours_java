package laba3.controller;

import laba3.model.Sex;

public class SexController {

    public static Sex sexChoose(String input){

        Sex sex = Sex.MALE;

        switch (input){
            case "Male":
            case "MALE":
            case "male":
                sex = Sex.MALE;
                break;
            case "Female":
            case "FEMALE":
            case "female":
                sex = Sex.FEMALE;
                break;
        }

        return sex;
    }
}
