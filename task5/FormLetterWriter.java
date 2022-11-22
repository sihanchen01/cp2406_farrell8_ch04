public class FormLetterWriter {
    public static void main(String[] args) {
        FormLetterWriter formLetterWriter = new FormLetterWriter();
        String firstName = "John";
        String lastName = "Snow";
        // test out only last name
        formLetterWriter.displaySalutation(lastName);
        // test out first name and last name
        formLetterWriter.displaySalutation(firstName, lastName);
    }

    private void displaySalutation(String lastName){
        System.out.println("Dear Mr. or Ms. " + lastName);
        System.out.println("Thank you for your recent order.");
    }

    private void displaySalutation(String firstName, String lastName){
        System.out.println("Dear " + firstName + " " + lastName);
        System.out.println("Thank you for your recent order.");
    }
}
