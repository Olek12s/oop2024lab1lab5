import java.util.ArrayList;
import java.util.List;

public class Przygotowanie_zadanie3 {
    public static class Person implements Cloneable{
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

        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }
    public static class Teacher extends Person implements Cloneable
    {
        public Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }
    public static class Student extends  Person implements Cloneable
    {
        public Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }
    public static class Subject implements Cloneable
    {
        String title;
        Teacher teacher;
        List<Student> students;

        public String getNames()
        {
            StringBuilder sb = new StringBuilder();

            sb.append(teacher.getImie() + " " + teacher.getNazwisko() + "\n");

            for (Student student : students)
            {
                sb.append(student.getImie() + " " + student.getNazwisko() + "\n");
            }
            return sb.toString();
        }
        protected Object clone() throws CloneNotSupportedException  // Metoda wykonująca płytką kopię:
        {
            Subject clonedSubject = (Subject) super.clone();
            clonedSubject.teacher = (Teacher) teacher.clone();

            // Deep copy for students list
            List<Student> clonedStudents = new ArrayList<>();

            for (Student student : students)
            {
                clonedStudents.add((Student) student.clone());
            }
            clonedSubject.students = clonedStudents;

            return clonedSubject;
        }
    }
/* Metoda wykonująca płytką kopię:  link: https://www.altkomakademia.pl/baza-wiedzy/qna/discussion/4113/jak-poprawnie-implementowac-cloneable/p1
   protected Object clone()
   {
      try
      {
          return (Subject) super.clone();
      }
      catch(CloneNotSupportedException e)
      {
          System.out.println(this.getClass().getName() + " nie implementuje Cloneable...");
          return null;
      }
   }
   */
}
