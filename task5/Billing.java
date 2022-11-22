public class Billing {
    private static final double TAX = 0.08;

    public static void main(String[] args) {
        double bookPrice = 39.99;
        int quantity = 3;
        double couponValue = 9.99;
        Billing billing = new Billing();
        // only book price
        System.out.printf("Total for first: %.2f\n" , billing.computeBill(bookPrice));
        // book price and quantity
        System.out.printf("Total for second: %.2f\n" , billing.computeBill(bookPrice, quantity));
        // all three variables
        System.out.printf("Total for third: %.2f\n" , billing.computeBill(bookPrice, quantity, couponValue));
    }

    private double computeBill (double bookPrice) {
        return bookPrice * (1 + TAX);
    }

    private double computeBill (double bookPrice, int quantity) {
        return bookPrice * quantity * (1 + TAX);
    }

    private double computeBill (double bookPrice, int quantity, double couponValue) {
        return (bookPrice * quantity - couponValue) * (1 + TAX);
    }
}
