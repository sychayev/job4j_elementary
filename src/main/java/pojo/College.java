package pojo;

import java.sql.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        Date date = new Date(2020 - 20 - 9);
        student.setFulname("Ivanov Ivan Ivanovich");
        student.setDate(date);
        student.setGroup('A');
        System.out.println("Fulname student: " + student.getFulname());
        System.out.println("Started learning date: " + student.getDate());
        System.out.println("ID group: " + student.getGroup());
    }
}
