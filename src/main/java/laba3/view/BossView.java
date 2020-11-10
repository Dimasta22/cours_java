package laba3.view;

import laba3.model.Sex;

public class BossView {

    public void printBossDetails (String name, String surname, String patronymic, Sex sex, String city){
        System.out.println("\nName: " +name + " | Surname: " +surname + " | FathersName: " +patronymic + " | Sex: " + sex + "| Local city: " + city);
    }
}
