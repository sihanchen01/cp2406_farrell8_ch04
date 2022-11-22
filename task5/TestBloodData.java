public class TestBloodData {
    public static void main(String[] args) {
        BloodData bloodData = new BloodData();
        System.out.println("Default blood type is: " + bloodData.getBloodType() + bloodData.getRhFactor());
        // we can set new value here
        bloodData.setBloodType(BloodData.BloodType.AB);
        bloodData.setRhFactor("-");
        // print out new blood type
        System.out.println("New blood type is: " + bloodData.getBloodType() + bloodData.getRhFactor());
        // initiate with value
        BloodData bloodData1 = new BloodData(BloodData.BloodType.B, "+");
        System.out.println("Constructor with value blood type is: " + bloodData1.getBloodType() + bloodData1.getRhFactor());
    }
}
