import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Student[] student = {
                new Student("Kurmanbek","Abdullaev",'M', LocalDate.of(2023,9,1),
                        new School("N:13-Raxmanjan","Nooken",LocalDate.of(1980,1,1))),
                new Student("Asan","Asanov",'M',LocalDate.of(2020,9,1),
                        new University("Manas","Bishkek",LocalDate.of(2000,1,1))),
                new Student("Uson", "Usenov",'M',LocalDate.of(2019,9,1),
                        new Collage("N;77","Kochkor-ata",LocalDate.of(1990,1,1)))

        };
infoStudent(student);
    }
    public static void infoStudent(Student[]students){
        for(Student student:students){
            int a=LocalDate.now().getYear()-student.getDateOfStart().getYear();
            System.out.println("name: "+student.getName()+" okujaiy "+student.getEduacationcenter().getLocatedCountry()+
                    " okkugan jyly "+a);
        }
    }
}