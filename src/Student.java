import java.time.LocalDate;

public class Student {
    private String name;
    private String surName;
    private char gender;
    private LocalDate dateOfStart;
    private Eduacationcenter eduacationcenter;

    public Student() {
    }

    public Student(String name, String surName, char gender, LocalDate dateOfStart, Eduacationcenter eduacationcenter) {
        this.name = name;
        this.surName = surName;
        this.gender = gender;
        this.dateOfStart = dateOfStart;
        this.eduacationcenter = eduacationcenter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public LocalDate getDateOfStart() {
        return dateOfStart;
    }

    public void setDateOfStart(LocalDate dateOfStart) {
        this.dateOfStart = dateOfStart;
    }

    public Eduacationcenter getEduacationcenter() {
        return eduacationcenter;
    }

    public void setEduacationcenter(Eduacationcenter eduacationcenter) {
        this.eduacationcenter = eduacationcenter;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", gender=" + gender +
                ", dateOfStart=" + dateOfStart +
                ", eduacationcenter=" + eduacationcenter +
                '}';
    }
}
