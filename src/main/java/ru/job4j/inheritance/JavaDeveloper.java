package ru.job4j.inheritance;

public class JavaDeveloper extends Engineer {
    private String skills;

    public JavaDeveloper(String[] instruments, int practiceYears, String skills) {
        super(instruments, practiceYears);
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
