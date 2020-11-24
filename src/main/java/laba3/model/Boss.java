package laba3.model;

import java.util.Objects;

public class Boss extends Human {
    public String bossControl;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Boss boss = (Boss) o;
        return bossControl.equals(boss.bossControl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), bossControl);
    }

    public String getBossControl() {
        return bossControl;
    }

    public void setBossControl(String bossControl) {
        this.bossControl = bossControl;
    }
}
