import java.util.ArrayList;
import java.util.List;

public class Przygotowanie_zadanie1 {
    public static class Person {
        private String imie;
        private String nazwisko;


        public void setImie(String imie) {
            this.imie = imie;
        }


        public void setNazwisko(String nazwisko) {
            this.nazwisko = nazwisko;
        }


        public String getImie() {
            return imie;
        }


        public String getNazwisko() {
            return nazwisko;
        }
    }
    public static class Teacher extends Person
    {

    }
    public static class Student extends  Person
    {

    }
    public static class Subject
    {
        String title;
        Teacher teacher;
        List<Student> students;

        public String getNames()
        {
            StringBuilder sb = new StringBuilder();

            sb.append(teacher.getImie() + " " + teacher.getNazwisko() + "\n");

            for (Przygotowanie_zadanie1.Student student : students)
            {
                sb.append(student.getImie() + " " + student.getNazwisko() + "\n");
            }
            return sb.toString();
        }
    }
}