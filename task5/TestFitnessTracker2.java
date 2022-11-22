import java.text.SimpleDateFormat;

public class TestFitnessTracker2 {
    public static void main(String[] args) {
        FitnessTracker2 fitnessTracker2 = new FitnessTracker2();
        showInfo(fitnessTracker2);
    }

    public static void showInfo(FitnessTracker2 fitnessTracker2) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String dateFormatted = format.format(fitnessTracker2.getCalendar().getTime());

        System.out.println("Current activity: " + fitnessTracker2.getActivity() + "\n"
                + "Current minutes: " + fitnessTracker2.getMinutes() + "\n"
                + "Date: " + dateFormatted);
    }
}
