public class TestSandwichFilling {
    public static void main(String[] args) {
        SandwichFilling sandwichFilling1 = new SandwichFilling("egg salad", 100);
        System.out.println("This is a " + sandwichFilling1.getFillingType() + " sandwich, calories per serving is: "
                + sandwichFilling1.getCaloriesPerServing());
        SandwichFilling sandwichFilling2 = new SandwichFilling("smoke salmon", 170);
        System.out.println("This is a " + sandwichFilling2.getFillingType() + " sandwich, calories per serving is: "
                + sandwichFilling2.getCaloriesPerServing());
        SandwichFilling sandwichFilling3 = new SandwichFilling("pastrami", 230);
        System.out.println("This is a " + sandwichFilling3.getFillingType() + " sandwich, calories per serving is: "
                + sandwichFilling3.getCaloriesPerServing());
    }
}
