import dao.StudentDao;
import models.Student;

public class Main {
    public static void main(String[] args) {
        StudentDao daoStudent = new StudentDao();
        Student student = new Student();
        student.setName("Diego Martinez");
        student.setId(144562L);
        student.setMajor("Ingenieria en Sistemas de Informacion");
        daoStudent.save(student);

        Student student2 = new Student();
        student2.setName("Jose Lopez");
        student2.setId(52423L);
        student2.setMajor("Ingenieria Civil");
        daoStudent.save(student2);

        Student student3 = new Student();
        student3.setName("Regina Luna");
        student3.setId(76243L);
        student3.setMajor("Negocios Internacionales");
        daoStudent.save(student3);

        Student student4 = new Student();
        student4.setName("Kendrick Barrios");
        student4.setId(97643L);
        student4.setMajor("Ingenieria en Sistemas de Informacion");
        daoStudent.save(student4);




    }
}
