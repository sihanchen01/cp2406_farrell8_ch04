public class TestBread {
    public static void main(String[] args) {
        Bread bread1 = new Bread("rye", 90);
        System.out.println("Our motto is: " + Bread.MOTTO);
        System.out.println("This is a " + bread1.getBreadType() + " bread, and each slice has calories of: "
                + bread1.getCaloriesPerSlice());

        Bread bread2 = new Bread("whole wheat", 95);
        System.out.println("This is a " + bread2.getBreadType() + " bread, and each slice has calories of: "
                + bread2.getCaloriesPerSlice());

        Bread bread3 = new Bread("white", 70);
        System.out.println("This is a " + bread3.getBreadType() + " bread, and each slice has calories of: "
                + bread3.getCaloriesPerSlice());
    }
}
