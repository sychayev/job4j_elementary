package job4_oop.src;

public class Profession {
    private String name;
    private String surname;
    private String education;
    private int birthdayDay;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public int getBirthdayDay() {
        return birthdayDay;
    }

    public void setBirthdayDay(int birthdayDay) {
        this.birthdayDay = birthdayDay;
    }

    public static void main(String[] args) {
        Dentist dent = new Dentist ();
        Doctor d = new Doctor();
        Engineer e = new Engineer();
        Builder buld = new Builder();

        dent.toHeal();
        dent.nmbPeople();
        dent.nsePeople();
        d.Receipt("Receipt");
        d.grpTablet('B');
        d.nmbrReceipt(5);

        e.nmeShem("Electrical");
        e.grpShem('E');
        e.nmbrShem(3);
        buld.bld();
        buld.nmbBuldings();
        buld.nmsBuildings();
    }
}
