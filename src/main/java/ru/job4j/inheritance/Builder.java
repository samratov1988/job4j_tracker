package ru.job4j.inheritance;

public class Builder extends Engineer {
    private boolean canTractorDrive;

    public Builder(String name, String surname,
                   String education, String birthday,
                   String[] instruments, int practiceYears,
                   boolean canTractorDrive) {
        super(name, surname, education, birthday, instruments, practiceYears);
        this.canTractorDrive = canTractorDrive;
    }

    public boolean isCanTractorDrive() {
        return canTractorDrive;
    }

    public void build() {

    }

    public void setCanTractorDrive(boolean canTractorDrive) {
        this.canTractorDrive = canTractorDrive;
    }
}
