import java.util.List;

/**
 * Created by joacim on 2017-12-18.
 */
public class Teacher {

    private String teatcherName;
    Seminar seminar;
    private List<Seminar> seminars;


    public String getTeatcherName() {
        return teatcherName;
    }

    public void setTeatcherName(String teatcherName) {
        this.teatcherName = teatcherName;
    }

    public Seminar getCurrentSeminar(Seminar teacherName){

        return seminar;
    }

    public List<Seminar> getSeminarHistory(){
        return seminars;

    }



}



