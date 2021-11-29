package ru.job4j.inheritance;

public class Doctor extends Profession {
    private int experienceYears;
    private int hoursWorkDay;

    public Doctor(String name, String surname,
                  String education, String birthday,
                  int experienceYears, int hoursWorkDay) {
        super(name, surname, education, birthday);
        this.experienceYears = experienceYears;
        this.hoursWorkDay = hoursWorkDay;
    }

    public void callNurse() {

    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public int getHoursWorkDay() {
        return hoursWorkDay;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    public void setHoursWorkDay(int hoursWorkDay) {
        this.hoursWorkDay = hoursWorkDay;
    }
}
