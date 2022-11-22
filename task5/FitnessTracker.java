import java.util.Calendar;

public class FitnessTracker {
    private int minutes;
    private String activity;
    private Calendar calendar;

    public FitnessTracker () {
        this.minutes = 0;
        this.activity = "running";
        // default data is Jan 01 current year
        this.calendar = Calendar.getInstance();
        calendar.set(calendar.get(Calendar.YEAR), Calendar.JANUARY, 1);
    }

    public FitnessTracker (int minutes, String activity, Calendar calendar) {
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
