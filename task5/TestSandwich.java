public class TestSandwich {
    public static void main(String[] args) {
        Sandwich sandwich1 = new Sandwich(new Bread("rye", 90),
                new SandwichFilling("pastrami", 230));
        System.out.println("This is a " + sandwich1.getBread().getBreadType() + " "
                + sandwich1.getSandwichFilling().getFillingType() + " sandwich, calories: " + sandwich1.getCalories());

        Sandwich sandwich2 = new Sandwich(new Bread("whole wheat", 95),
                new SandwichFilling("smoke salmon", 180));
        System.out.println("This is a " + sandwich2.getBread().getBreadType() + " "
                + sandwich2.getSandwichFilling().getFillingType() + " sandwich, calories: " + sandwich2.getCalories());

        Sandwich sandwich3 = new Sandwich(new Bread("white", 70),
                new SandwichFilling("egg salad", 150));
        System.out.println("This is a " + sandwich3.getBread().getBreadType() + " "
                + sandwich3.getSandwichFilling().getFillingType() + " sandwich, calories: " + sandwich3.getCalories());
    }
}
