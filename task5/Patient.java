public class Patient {
    private final int id;
    private final int age;
    private final BloodData bloodData;

    public Patient () {
        this.id = 0;
        this.age = 0;
        this.bloodData = new BloodData();
    }

    public Patient(int id, int age, BloodData bloodData) {
        this.id = id;
        this.age = age;
        this.bloodData = bloodData;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getBloodData() {
        return bloodData.getBloodType() + bloodData.getRhFactor();
    }
}
