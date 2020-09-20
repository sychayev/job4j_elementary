package pojo;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        Date date = new Date();
        student.setFulname("Ivanov Ivan Ivanovich");
        student.setDate(date);
        student.setGroup('A');
        System.out.println("Fulname student: " + student.getFulname());
        System.out.println("Started learning date: " + student.getDate());
        System.out.println("ID group: " + student.getGroup());
    }
}
