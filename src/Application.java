import java.util.ArrayList;
import java.util.List;

/**
 * Created by joacim on 2017-12-18.
 */
public class Application {

    public static void main(String[] arg) {

        ProgramCoordinator proCo = new ProgramCoordinator();
        proCo.setProgramCoord("Jocke");


        //Lägger till lärare
        Teacher teacher1 = new Teacher();
        teacher1.setTeatcherName("Bosse");
        Teacher teacher2 = new Teacher();
        teacher2.setTeatcherName("Ingrid");
        Teacher teacher3 = new Teacher();
        teacher3.setTeatcherName("Lorentz");


        List<Teacher> allTeachers = new ArrayList<>();
        allTeachers.add(teacher1);
        allTeachers.add(teacher2);
        allTeachers.add(teacher3);

        for (Teacher t : allTeachers) {
            System.out.println(t.getTeatcherName());
        }
        System.out.println();


        //Lägger till studenter
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        student1.setStudentName("Jakob");
        student2.setStudentName("Lisa");
        student3.setStudentName("Dragan");

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        System.out.println("Det finns: " + students.size() + " studenter.");

        //Skapa seminarium
        List<Seminar> seminar = new ArrayList<>();
        Seminar seminar1 = new Seminar();
        seminar1.setSeminarName("Svenska");
        Seminar seminar2 = new Seminar();
        seminar2.setSeminarName("Komposition");
        seminar.add(seminar1);
        seminar.add(seminar2);


        //Skapar ett program
        List<Program> programs = new ArrayList<>();
        Program program1 = new Program();
        program1.setProgramName("Språk");
        Program program2 = new Program();
        program2.setProgramName("Musik");


        //Sätter en student till ett program
        program1.setStudent(student1);
        System.out.println(program1.getStudent().getStudentName());


        //Vilka ämnen har undervisats i detta seminarie
        Subject subject = new Subject();
        Subject subject2 = new Subject();

        subject.setSubjectName("Svenska A");
        subject2.setSubjectName("Komposition A");
        seminar1.setSubject(subject);

        System.out.println(seminar1.getSubject().getSubjectName());


        //Vilka seminarier har lärare undervisat?
        teacher1.getSeminarHistory().add(seminar1);
        System.out.println(teacher1.getSeminarHistory());


        // Närvaron för seminarie
        Attendence attendence = new Attendence();


        attendence.registerAttendence(seminar1, students);
        attendence.setAttendenceLevel(students.size());
        System.out.println(attendence.getAttendenceLevel());
    }
}


