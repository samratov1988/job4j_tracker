package ru.job4j.inheritance;

public class Surgeon extends Doctor {
    private String workNickname;

    public Surgeon(String name, String surname,
                   String education, String birthday,
                   int experienceYears, int hoursWorkDay,
                   String workNickname) {
        super(name, surname, education, birthday, experienceYears, hoursWorkDay);
        this.workNickname = workNickname;
    }

    public void operate() {

    }

    public String getWorkNickname() {
        return workNickname;
    }

    public void setWorkNickname(String workNickname) {
        this.workNickname = workNickname;
    }
}
