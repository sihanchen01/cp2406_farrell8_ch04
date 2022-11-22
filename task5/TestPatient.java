public class TestPatient {
    public static void main(String[] args) {
        // first, test default constructor
        Patient patient = new Patient();
        System.out.println("Default patient info: id - " + patient.getId() + ", age - " + patient.getAge()
                + ", blood type - " + patient.getBloodData());
        // test constructor with values
        Patient patient2 = new Patient(7, 30, new BloodData(BloodData.BloodType.A, "-"));
        System.out.println("Default patient info: id - " + patient2.getId() + ", age - " + patient2.getAge()
                + ", blood type - " + patient2.getBloodData());
    }
}
