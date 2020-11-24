package laba3.model;

import java.util.Objects;

public abstract class UniversityBase {

    public String universityName;
    Boss boss;

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UniversityBase that = (UniversityBase) o;
        return universityName.equals(that.universityName) &&
                boss.equals(that.boss);
    }

    @Override
    public int hashCode() {
        return Objects.hash(universityName, boss);
    }

    public Boss getBoss() {
        return boss;
    }


    public void setBoss(Boss boss) {
        this.boss = boss;
    }
}
