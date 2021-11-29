package ru.job4j.inheritance;

public class Dentist extends Doctor {
    private int teethCollection;

    public Dentist(String name, String surname,
                   String education, String birthday,
                   int teethCollection, int experienceYears, int hoursWorkDay) {
        super(name, surname, education, birthday, experienceYears, hoursWorkDay);
        this.teethCollection = teethCollection;
    }

    public void healTeeth() {

    }

    public void makeAnesthesia() {

    }

    public int getTeethCollection() {
        return teethCollection;
    }

    public void setTeethCollection(int teethCollection) {
        this.teethCollection = teethCollection;
    }
}
