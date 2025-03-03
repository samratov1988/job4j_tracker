package ru.job4j.inheritance;

public class Engineer extends Profession {
    private String[] instruments;
    private int practiceYears;

    public Engineer(String name, String surname,
                    String education, String birthday,
                    String[] instruments, int practiceYears) {
        super(name, surname, education, birthday);
        this.instruments = instruments;
        this.practiceYears = practiceYears;
    }

    public void create() {
        System.out.println("New Technology");
    }

    public void setInstruments(String[] instruments) {
        this.instruments = instruments;
    }

    public void setPracticeYears(int practiceYears) {
        this.practiceYears = practiceYears;
    }

    public String[] getInstruments() {
        return instruments;
    }

    public int getPracticeYears() {
        return practiceYears;
    }
}
