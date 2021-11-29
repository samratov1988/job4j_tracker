package ru.job4j.inheritance;

public class JavaDeveloper extends Engineer {
    private String skills;

    public JavaDeveloper(String name, String surname,
                         String education, String birthday,
                         String[] instruments, int practiceYears,
                         String skills) {
        super(name, surname, education, birthday, instruments, practiceYears);
        this.skills = skills;
    }

    public void writeCode() {

    }

    public void debagCode() {

    }

    public String getSkills() {
        return skills;
    }

    public void setSkills() {
        this.skills = skills;
    }

}
