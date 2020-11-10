package laba3.model;

public abstract class UniversityBase {

    public String universityName;
    Boss boss;

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public Boss getBoss() {
        return boss;
    }


    public void setBoss(Boss boss) {
        this.boss = boss;
    }
}
