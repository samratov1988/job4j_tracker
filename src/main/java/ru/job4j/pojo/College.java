package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Самратов Самат Бисенович");
        student.setGroup("109В");
        student.setDateOfAdmission(new Date());

        System.out.println("Студент: " + student.getName() + System.lineSeparator()
                + "Группа: " + student.getGroup() + System.lineSeparator() + "Дата поступления: "
                + student.getDateOfAdmission());
    }
}
