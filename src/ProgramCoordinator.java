import java.util.List;

/**
 * Created by joacim on 2017-12-18.
 */
public class ProgramCoordinator {

    private String programCoord;
    private List<Teacher> teacherList;
    Teacher teacher;

    public String getProgramCoord() {
        return programCoord;
    }

    public void setProgramCoord(String programCoord) {
        this.programCoord = programCoord;
    }


    public void addTeacher(Teacher t) {

        teacherList.add(t);
    }

    public String findTeacher(String teacherName) {
        return teacherName;

    }

}








