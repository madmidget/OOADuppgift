import java.util.List;

/**
 * Created by joacim on 2017-12-18.
 */
public class Program {

    private String programName;
    Student student;
    List<Student> allStudents;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public String getProgramName() {
        return programName;
    }


    public List<Student> getStudents() {
        return allStudents;

    }
}

