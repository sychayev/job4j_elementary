package job4_oop.src;

public class Profession {
    private String name;
    private String surname;
    private String education;
    private int birthdayDay;

    public void getName() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void getSurname() {

    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void getEducation() {

    }

    public void setEducation(String education) {
        this.education = education;
    }

    public void getBirthdayDay() {

    }

    public void setBirthdayDay(int birthdayDay) {
        this.birthdayDay = birthdayDay;
    }

    public static void main(String[] args) {

        Dentist dent = new Dentist();
        Doctor d = new Doctor();
        Engineer e = new Engineer();
        Builder buld = new Builder();
        Profession p = new Dentist();
        dent.nsePeople();
        dent.nmbrReceipt(3);
        dent.nmbPeople();
        dent.toHeal();

        buld.bld();
        buld.nmsBuildings();
        buld.nmbBuldings();
    }
}
