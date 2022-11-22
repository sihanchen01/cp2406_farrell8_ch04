public class SandwichFilling {
    private final String fillingType;
    private final int caloriesPerServing;

    public SandwichFilling(String fillingType, int caloriesPerServing) {
        this.fillingType = fillingType;
        this.caloriesPerServing = caloriesPerServing;
    }

    public String getFillingType() {
        return fillingType;
    }

    public int getCaloriesPerServing() {
        return caloriesPerServing;
    }
}
