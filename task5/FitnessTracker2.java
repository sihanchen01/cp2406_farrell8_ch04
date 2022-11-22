import java.util.Calendar;

public class FitnessTracker2 {

    private int minutes;
    private String activity;
    private Calendar calendar;

    public FitnessTracker2 () {
        this(0, "running", Calendar.getInstance());
    }
    public FitnessTracker2 (int minutes, String activity, Calendar calendar) {
        this.minutes = minutes;
        this.activity = activity;
        this.calendar = calendar;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public Calendar getCalendar() {
        return calendar;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }
}