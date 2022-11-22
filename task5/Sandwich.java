public class Sandwich {
    private final Bread bread;
    private final SandwichFilling sandwichFilling;

    public Sandwich(Bread bread, SandwichFilling sandwichFilling) {
        this.bread = bread;
        this.sandwichFilling = sandwichFilling;
    }

    public int getCalories () {
        return this.sandwichFilling.getCaloriesPerServing() + this.bread.getCaloriesPerSlice() * 2;
    }

    public Bread getBread() {
        return bread;
    }

    public SandwichFilling getSandwichFilling() {
        return sandwichFilling;
    }
}
