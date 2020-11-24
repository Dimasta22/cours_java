package laba3.model;
import laba3.model.Sex;

import java.util.Objects;

public class Human {
    public String name;
    public String surname;
    public String patronymic;
    public Sex sex;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return name.equals(human.name) &&
                surname.equals(human.surname) &&
                patronymic.equals(human.patronymic) &&
                sex == human.sex;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, patronymic, sex);
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }
}
