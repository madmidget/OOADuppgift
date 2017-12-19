import java.util.List;

/**
 * Created by joacim on 2017-12-18.
 */
public class Seminar {

    private String seminarName;
    Subject subject;
    List<Subject> subjects;

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public String getSeminarName() {
        return seminarName;
    }

    public void setSeminarName(String seminar) {
        this.seminarName = seminarName;
    }

    public int getTotalAttendence(int attendenceLevel){
        return attendenceLevel;

    }


}
