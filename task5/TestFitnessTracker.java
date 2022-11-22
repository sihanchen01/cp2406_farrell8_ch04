import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TestFitnessTracker {

    public static void main(String[] args) {
        // test out default constructor
        FitnessTracker fitnessTracker = new FitnessTracker();
        showInfo(fitnessTracker);
        // test out constructor with parameters, using current time
        Calendar newCalendar = Calendar.getInstance();
        FitnessTracker fitnessTracker1 = new FitnessTracker(20, "swimming", newCalendar);
        showInfo(fitnessTracker1);
    }
    public static void showInfo(FitnessTracker fitnessTracker) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String dateFormatted = format.format(fitnessTracker.getCalendar().getTime());

        System.out.println("Current activity: " + fitnessTracker.getActivity() + "\n"
                + "Current minutes: " + fitnessTracker.getMinutes() + "\n"
                + "Date: " + dateFormatted);
    }
}