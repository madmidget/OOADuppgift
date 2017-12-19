import java.util.List;

/**
 * Created by joacim on 2017-12-18.
 */
public class Attendence {

    private int attendenceLevel;

    List<Attendence> attendenceList;

    public int getAttendenceLevel() {
        return attendenceLevel;
    }

    public void setAttendenceLevel(int attendenceLevel) {
        this.attendenceLevel = attendenceLevel;
    }


    public void registerAttendence(Seminar seminar, List<Student> student) {
        attendenceLevel = student.size();

    }
    public void removeAttendence(Seminar seminar, Student student) {

        attendenceLevel--;
    }


}
