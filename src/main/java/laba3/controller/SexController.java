package laba3.controller;

import laba3.model.Sex;
import laba3.model.Student;

public class SexController {

    public static Sex sexChoose(String input){

        Sex sex = Sex.MALE;

        switch (input.toUpperCase()){
            case "MALE":
                sex = Sex.MALE;
                break;
            case "FEMALE":

                sex = Sex.FEMALE;
                break;
        }

        return sex;
    }
}
